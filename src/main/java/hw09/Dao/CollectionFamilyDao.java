package hw09.Dao;

import hw09.Entity.Family;
import hw09.Entity.Human;
import hw09.Pet.Dog;
import hw09.Pet.DomesticCat;
import hw09.Pet.Fish;
import hw09.Pet.Pet;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionFamilyDao implements FamilyDao<Family> {


    Human child1 = new Human("Jamilla", "Naek", 1990);
    Human child2 = new Human("Ali", "Naek", 1992);
    Human child3 = new Human("Danielle", "Naek", 1993);
    Human child4 = new Human("Giovanni", "Naek", 1995);
    Human child5 = new Human("Max", "Naek", 1997);
    Human child6 = new Human("Taro", "Naek", 1999);

    Dog dog1 = new Dog("Toplan", 2);
    Dog dog2 = new Dog("Lulu", 1);

    DomesticCat cat1 = new DomesticCat("Tom",3);
    DomesticCat cat2 = new DomesticCat("Sosu", 1);
    DomesticCat cat3 = new DomesticCat("Motu", 2);

    Fish fish1 = new Fish("Ozy", 1);

    List<Pet> familyPet1 = new ArrayList<>(Arrays.asList(dog1, cat1));
    List<Pet> familyPet2 = new ArrayList<>(Arrays.asList(dog2, fish1));
    List<Pet> familyPet3 = new ArrayList<>(Arrays.asList(cat2, cat3));

    Human boy = new Human("Rocky", "Balboa", 1996);
    Human girl = new Human("Charlize", "Theron", 1998);
    List<Human> newboy = new ArrayList<>(Arrays.asList(boy));
    List<Human> newgirl = new ArrayList<>(Arrays.asList(girl));

    List<Human> familyChild1 = new ArrayList<>(Arrays.asList(child1));
    List<Human> familyChild2 = new ArrayList<>(Arrays.asList(child2, child3, child4));
    List<Human> familyChild3 = new ArrayList<>(Arrays.asList(child5, child6));

    Family family1 = new Family(1, new Human("Jack", "Stuard"), new Human("Michele", "Rodriguez"), familyChild1, familyPet1);
    Family family2 = new Family(2, new Human("Alan", "Walker"), new Human("Adriana", "Lima"), familyChild2, familyPet2);
    Family family3 = new Family(3, new Human("Michael", "Jackson"), new Human("Nicky", "Minaj"), familyChild3, familyPet3);

    List<Family> families = new ArrayList<>();
    //List<Pet> pets = new ArrayList<>();


    @Override
    public List<Family> getAllFamilies() {
        if (families.size() == 0) {
            families.addAll(Arrays.asList(family1, family2, family3));
        }
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
        getAllFamilies().remove(index - 1);
        return getAllFamilies();
    }

    @Override
    public List<Family> deleteFamily(Family family) {
        getAllFamilies().remove(family);
        return getAllFamilies();

    }

    @Override
    public List<Family> saveFamily(Family family) {
        families.add(family);
        return families;


    }

    @Override
    public Family addChild(Family family, String child) {
        Family fam = new Family();
        if (child.equals("boy")) {
            fam.setMother(family.getMother());
            fam.setFather(family.getFather());
            fam.setChildren(newboy);
        } else if (child.equals("girl")) {
            fam.setMother(family.getMother());
            fam.setFather(family.getFather());
            fam.setChildren(newgirl);
        }
        saveFamily(fam);
        return fam;
    }

    @Override
    public Family adoptChild(Family familyTo, Family familyFrom, Human child) {
        familyTo.setChildren(Arrays.asList(child));
        familyFrom.getChildren().remove(child);
        saveFamily(familyTo);
        return familyTo;
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
        //return getAllFamilies().get(i-1).getPet();

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
