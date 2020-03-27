package hw12;

import hw12.Dao.CollectionFamilyDao;
import hw12.Dao.FamilyDao;
import hw12.Entity.Family;
import hw12.Entity.Human;
import hw12.Pet.Pet;

import java.util.List;
import java.util.stream.Collectors;


public class FamilyService {
    FamilyDao<Family> dao = new CollectionFamilyDao();


    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }

    public List<Family> displayAllFamilies() {
        return dao.displayAllFamilies();
    }

    public List<Family> getFamilyByIndex(int index) {
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

    public Family saveFamily(Family family) {
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
