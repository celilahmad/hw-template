package hw09.Dao;

import hw09.Entity.Human;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface FamilyDao<Family> {

    List<Family> getAllFamilies();

    List<Family> getFamilyByIndex(int index);

    List<Family> deleteFamily(int index);

    List<Family> getAllBy(Predicate<Family> p);

    List<Family> deleteFamily(Family family);

    List<Family> saveFamily(Family family);

    Family addChild(Family family, String human);

}
