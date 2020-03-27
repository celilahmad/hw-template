package hw09.Dao;

import hw09.Entity.Family;
import hw09.Entity.Human;
import hw09.Main;
import hw09.Pet.Dog;
import hw09.Pet.DomesticCat;
import hw09.Pet.Fish;
import hw09.Pet.Pet;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CollectionFamilyDao implements FamilyDao<Family> {

    Human boy = new Human("Rocky", "Balboa", 1996);
    Human girl = new Human("Charlize", "Theron", 1998);
    List<Human> newboy = new ArrayList<>(Arrays.asList(boy));
    List<Human> newgirl = new ArrayList<>(Arrays.asList(girl));

    List<Family> families = new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public List<Family> getFamilyByIndex(int index) {
        return getAllFamilies().stream().filter(s -> s.getId() == index).collect(Collectors.toList());
    }

    @Override
    public List<Family> getAllBy(Predicate<Family> p) {
        return getAllFamilies().stream().filter(p).collect(Collectors.toList());
    }

    @Override
    public List<Family> deleteFamily(int index) {
        if (getAllFamilies().stream().anyMatch(p -> p.getId() == index)){
            getAllFamilies().remove(getAllBy(p -> p.getId() == index).get(0));
        }
        return getAllFamilies();
    }

    @Override
    public List<Family> deleteFamily(Family family) {
        getAllFamilies().remove(family);
        return getAllFamilies();
    }

    @Override
    public Family saveFamily(Family family) {
        family.setId(getAllFamilies().size()+1);
        families.add(family);
        return family;
    }

    @Override
    public Family addChild(Family family, String child) {

        Family familyStream = getAllFamilies().stream().filter(m -> m.getMother() == family.getMother()).collect(Collectors.toList()).get(0);
        List<Human> childf = new ArrayList<>();
        if (familyStream.getChildren()==null){
            if (child.equals("boy")) {
                childf.add(boy);
            } else if (child.equals("girl")) {
                childf.add(girl);
            }
            familyStream.setChildren(childf);
        }else{
            if (child.equals("boy")) {
                familyStream.getChildren().add(boy);
            } else if (child.equals("girl")) {
                familyStream.getChildren().add(girl);
            }
        }

        return familyStream;
    }


    @Override
    public Family adoptChild(Family familyTo, Human child) {

        Family famTo = getAllFamilies()
                .stream().filter(m -> m.getMother() == familyTo.getMother())
                .collect(Collectors.toList()).get(0);

        List<Human> childf = new ArrayList<>();
        if (famTo.getChildren()==null){
            childf.add(child);
            famTo.setChildren(childf);
        }else{
            famTo.getChildren().add(child);
        }

        return famTo;
    }

    @Override
    public List<Family> deleteChildrenOlderThan(int i) {
        List<Family> updatedFamily = getAllFamilies();
        updatedFamily.forEach(n->n.getChildren().removeIf(m->2020- m.getYearOfBirth()>i));
        return updatedFamily;

    }

    @Override
    public int count() {
        return getAllFamilies().size();
    }

    @Override
    public List<Pet> getPets(int i) {
        Family allBy = getAllBy(p -> p.getId() == i).get(0);
        return allBy.getPet();

    }

    @Override
    public Family addPets(int i, Pet pet) {

        Family fam = getAllBy(p -> p.getId() == i).get(0);

        List<Pet> pet1 = fam.getPet();
        if (pet1==null){
            ArrayList<Pet> pets = new ArrayList<>(Arrays.asList(pet));
            fam.setPet(pets);
        }else{
            pet1.add(pet);
        }
        return fam;

    }


}
