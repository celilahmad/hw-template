package hw13.Dao;

import hw13.Entity.Human;
import hw13.Pet.Pet;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public interface FamilyDao<Family> {

    List<Family> getAllFamilies();

    List<Family> displayAllFamilies();

    Family getFamilyByIndex(int index);

    List<Family> deleteFamily(int index);

    List<Family> getAllBy(Predicate<Family> p);

    List<Family> deleteFamily(Family family);

    Family saveFamily(Family family) throws IOException;

    Family addChild(Family family, String sex);

    Family adoptChild(Family familyTo, Human child);

    List<Family> deleteChildrenOlderThan(int i);

    int count();

    List<Pet> getPets(int i);

    Family addPets(int i, Pet pet);

    void loadData(List<Family> familes) throws IOException;
}
