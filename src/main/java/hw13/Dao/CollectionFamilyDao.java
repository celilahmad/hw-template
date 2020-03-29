package hw13.Dao;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import hw13.Entity.Family;
import hw13.Entity.Human;
import hw13.Pet.Pet;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class CollectionFamilyDao implements FamilyDao<Family> {

    Human boy = new Human("Rocky", "Balboa", 1996);
    Human girl = new Human("Charlize", "Theron", 1998);

    private File file;

    List<Family> families = new ArrayList<>();

    public CollectionFamilyDao(String filename) {
        this.file = new File(filename);
    }

    @Override
    public List<Family> getAllFamilies() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
           String json = br.lines().collect(Collectors.joining());
           List<Family> families = Arrays.asList(new ObjectMapper().readValue(json, Family[].class));
           return families;
        } catch (IOException ex) {
            return new ArrayList<>();
        }
        //return families;
    }

    @Override
    public List<Family> displayAllFamilies() {
        return getAllFamilies().stream().collect(Collectors.toList());
    }


    @Override
    public Family getFamilyByIndex(int index) {
        return getAllFamilies().stream().filter(s -> s.getId() == index).collect(Collectors.toList()).get(0);
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
    public Family saveFamily(Family family) throws IOException {
        family.setId(getAllFamilies().size()+1);
        families.add(family);
        loadData(families);
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
        //famFrom.getChildren().remove(child);

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


    @Override
    public void loadData(List<Family> family) throws IOException {
        try {//(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {


                List<Family> s = family.stream().collect(Collectors.toList());
                ObjectMapper mapper = new ObjectMapper();
                ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());
                writer.writeValue(file, s);
                //writer.writeValue(file, "\n");
                /*new ObjectMapper().writer();
                bw.write(s.toString());
                bw.write("\n");*/

                //bw.close();


        } catch (IOException ex) {
            throw new RuntimeException("DAO:write:IOException", ex);
        }

    }
}
