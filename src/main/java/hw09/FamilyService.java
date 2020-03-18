package hw09;

import hw09.Dao.CollectionFamilyDao;
import hw09.Dao.FamilyDao;
import hw09.Entity.Family;

import java.util.List;
import java.util.Optional;

public class FamilyService{
    FamilyDao dao = new CollectionFamilyDao();



    public List<Family> getAllFamilies() {
        return dao.getAllFamilies();
    }


    public Optional<Family> getFamilyByIndex(int index) {
        return dao.getFamilyByIndex(index);
    }


    public List<Family> deleteFamily(int index) {
        return dao.deleteFamily(index);
    }


    public boolean deleteFamily(Family family) {
        return dao.deleteFamily(family);
    }


    public boolean saveFamily(Family family) {
        return dao.saveFamily(family);
    }
}
