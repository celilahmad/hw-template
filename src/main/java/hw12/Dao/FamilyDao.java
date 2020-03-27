package hw12.Dao;

import hw12.Entity.Human;
import hw12.Pet.Pet;

import java.util.List;
import java.util.function.Predicate;

public interface FamilyDao<Family> {

    List<Family> getAllFamilies();

    List<Family> displayAllFamilies();

    Family getFamilyByIndex(int index);

    List<Family> deleteFamily(int index);

    List<Family> getAllBy(Predicate<Family> p);

    List<Family> deleteFamily(Family family);

    Family saveFamily(Family family);

    Family addChild(Family family, String sex);

    Family adoptChild(Family familyTo, Human child);

    List<Family> deleteChildrenOlderThan(int i);

    int count();

    List<Pet> getPets(int i);

    Family addPets(int i, Pet pet);
}
