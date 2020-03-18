package hw09.Dao;

import hw09.Entity.Family;

import java.util.List;
import java.util.Optional;

public interface FamilyDao<Family> {

    public List<Family> getAllFamilies();

    Optional<Family> getFamilyByIndex(int index);

    List<Family> deleteFamily(int index);

    boolean deleteFamily(Family family);

    boolean saveFamily(Family family);

}
