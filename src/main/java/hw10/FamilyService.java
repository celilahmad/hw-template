package hw10;

import hw10.Dao.CollectionFamilyDao;
import hw10.Dao.FamilyDao;
import hw10.Entity.Family;
import hw10.Entity.Human;
import hw10.Pet.Pet;

import java.util.ArrayList;
import java.util.List;


public class FamilyService {
    FamilyDao<Family> dao = new CollectionFamilyDao();


    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }

    public List<Family> getFamilyByIndex(int index) {
        return dao.getFamilyByIndex(index);
    }

    public List<Family> getFamiliesBiggerThan(int count) {
        List<Family> bigger = new ArrayList<>();
        for (Family f : getAllFamilies()) {
            if (f.countFamily() > count) {
                bigger.add(f);
            }
        }
        return bigger;
    }

    public List<Family> getFamiliesLessThan(int count) {
        List<Family> lower = new ArrayList<>();
        for (Family f : getAllFamilies()) {
            if (f.countFamily() < count) {
                lower.add(f);
            }
        }
        return lower;
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
