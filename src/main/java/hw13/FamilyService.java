package hw13;

import hw13.Dao.CollectionFamilyDao;
import hw13.Dao.FamilyDao;
import hw13.Entity.Family;
import hw13.Entity.Human;
import hw13.Pet.Pet;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class FamilyService {
    FamilyDao<Family> dao = new CollectionFamilyDao("families.txt");


    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }

    public List<Family> displayAllFamilies() {
        return dao.displayAllFamilies();
    }

    public Family getFamilyByIndex(int index) {
        return dao.getFamilyByIndex(index);
    }

    public List<Family> getFamiliesBiggerThan(int count) {

        return getAllFamilies().stream().filter(n->n.countFamily()>count).collect(Collectors.toList());

    }

    public List<Family> getFamiliesLessThan(int count) {
        return getAllFamilies().stream().filter(n->n.countFamily()<count).collect(Collectors.toList());
    }

    public List<Family> getFamiliesEqual(int count) {
        return getAllFamilies().stream().filter(n->n.countFamily()==count).collect(Collectors.toList());
    }

    public List<Integer> countFamiliesWithMember(){
        return getAllFamilies().stream().map(Family::countFamily).collect(Collectors.toList());
    }

    public List<Family> deleteFamily(int index) {
        return dao.deleteFamily(index);
    }

    public List<Family> deleteFamily(Family family) {
        return dao.deleteFamily(family);
    }

    public Family saveFamily(Family family) throws IOException {
        return dao.saveFamily(family);

    }

    public Family addChildToFamily(Family newFamily, String sex) {
        return dao.addChild(newFamily, sex);
    }

    public Family adoptChild(Family newFamily1, Human child1) {
        return dao.adoptChild(newFamily1, child1);
    }

    public List<Family> deleteChildrenOlderThan(int i) {
        return dao.deleteChildrenOlderThan(i);
    }

    public int count() {
        return dao.count();
    }

    public List<Pet> getPets(int i) {
        return dao.getPets(i);
    }

    public Family addPets(int i, Pet pet) {
        return dao.addPets(i, pet);
    }
}
