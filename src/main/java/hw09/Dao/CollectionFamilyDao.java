package hw09.Dao;

import hw09.Entity.Family;
import hw09.Entity.Human;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionFamilyDao implements FamilyDao<Family> {


    Human child1 = new Human("Jamilla", "Naek", 1990);
    Human child2 = new Human("Ali", "Naek", 1992);
    Human child3 = new Human("Danielle", "Naek", 1993);
    Human child4 = new Human("Giovanni", "Naek", 1995);
    Human child5 = new Human("Max", "Naek", 1997);
    Human child6 = new Human("Taro", "Naek", 1999);

    List<Human> familyChild1 = Arrays.asList(child1);
    List<Human> familyChild2 = Arrays.asList(child2,child3,child4);
    List<Human> familyChild3 = Arrays.asList(child5,child6);

    Family family1 = new Family(1,new Human("Jack", "Stuard"), new Human("Michele","Rodriguez"), familyChild1);
    Family family2 = new Family(2,new Human("Alan", "Walker"), new Human("Adriana","Lima"), familyChild2);
    Family family3 = new Family(3,new Human("Michael", "Jackson"), new Human("Nicky","Minaj"), familyChild3);

    List<Family> families = new ArrayList<>();



    @Override
    public List<Family> getAllFamilies() {
        if (families.size()==0){
            families.addAll(Arrays.asList(family1,family2,family3));
        }
       return families;
    }

    @Override
    public List<Family> getFamilyByIndex(int index) {
        return getAllFamilies().stream().filter(s -> s.getId() == index).collect(Collectors.toList());
    }

    @Override
    public List<Family> getAllBy(Predicate<Family> p) {
        return getAllFamilies().stream().filter(p).collect(Collectors.toList());
    }

    @Override
    public List<Family> deleteFamily(int index) {
        List<Family> newList = new ArrayList<>();
        newList.addAll(getAllBy((s -> s.getId() != index)));
        return newList;
    }



    @Override
    public boolean deleteFamily(Family family) {
        if (getAllFamilies().remove(family)) return true;
        else return false;

    }

    @Override
    public List<Family> saveFamily(Family family) {
        families.add(family);
        return families;


    }


}
