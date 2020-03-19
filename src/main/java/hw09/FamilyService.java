package hw09;

import hw09.Dao.CollectionFamilyDao;
import hw09.Dao.FamilyDao;
import hw09.Entity.Family;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FamilyService{
    FamilyDao<Family> dao = new CollectionFamilyDao();
    Family family = new Family();

    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }


    public List<Family> getFamilyByIndex(int index) {
        return dao.getFamilyByIndex(index);
    }

    public List<Family> getFamiliesBiggerThan(int count){
        List<Family> bigger = new ArrayList<>();
        for (Family f : getAllFamilies()){
            if (f.countFamily()>count){
                bigger.add(f);
            }
        }
        return bigger;
    }
    public List<Family> getFamiliesLessThan(int count) {
        List<Family> lower = new ArrayList<>();
        for (Family f : getAllFamilies()){
            if (f.countFamily()<count){
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


    public List<Family> saveFamily(Family family) {
        return dao.saveFamily(family);

    }


}
