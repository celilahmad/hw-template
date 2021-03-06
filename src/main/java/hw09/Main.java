package hw09;

import hw09.Entity.Family;
import hw09.Entity.Human;
import hw09.Pet.Dog;
import hw09.Pet.DomesticCat;
import hw09.Pet.Fish;
import hw09.Pet.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        FamilyController familyController = new FamilyController();

        Human child1 = new Human("Jamilla", "Naek", 1990);
        Human child2 = new Human("Ali", "Naek", 1992);
        Human child3 = new Human("Danielle", "Naek", 1993);
        Human child4 = new Human("Giovanni", "Naek", 1995);
        Human child5 = new Human("Max", "Naek", 1997);
        Human child6 = new Human("Taro", "Naek", 1999);

        Dog dog1 = new Dog("Toplan", 2);
        Dog dog2 = new Dog("Lulu", 1);

        DomesticCat cat1 = new DomesticCat("Tom",3);
        DomesticCat cat2 = new DomesticCat("Sosu", 1);
        DomesticCat cat3 = new DomesticCat("Motu", 2);

        Fish fish1 = new Fish("Ozy", 1);

        List<Pet> familyPet1 = new ArrayList<>(Arrays.asList(dog1, cat1));
        List<Pet> familyPet2 = new ArrayList<>(Arrays.asList(dog2, fish1));
        List<Pet> familyPet3 = new ArrayList<>(Arrays.asList(cat2, cat3));

        Human boy = new Human("Rocky", "Balboa", 1996);
        Human girl = new Human("Charlize", "Theron", 1998);
        List<Human> newboy = new ArrayList<>(Arrays.asList(boy));
        List<Human> newgirl = new ArrayList<>(Arrays.asList(girl));

        List<Human> familyChild1 = new ArrayList<>(Arrays.asList(child1));
        List<Human> familyChild2 = new ArrayList<>(Arrays.asList(child2, child3, child4));
        List<Human> familyChild3 = new ArrayList<>(Arrays.asList(child5, child6));

        Family family1 = new Family(1, new Human("Jack", "Stuard"), new Human("Michele", "Rodriguez"), familyChild1, familyPet1);
        Family family2 = new Family(2, new Human("Alan", "Walker"), new Human("Adriana", "Lima"), familyChild2, familyPet2);
        Family family3 = new Family(3, new Human("Michael", "Jackson"), new Human("Nicky", "Minaj"), familyChild3, familyPet3);


        Human child7 = new Human("Danielle", "Naek", 1990);
        Human child8 = new Human("Max", "Naek", 1992);
        List<Human> familyChild = new ArrayList<>(Arrays.asList(child7, child8));
        Family newFamily = new Family(4, new Human("Giovanni", "Cupello"), new Human("Suu", "Lee"), familyChild);

        Human mother = new Human("Emily", "Blunt");
        Human father = new Human("Matt", "Damon");
        Family newFamily1 = new Family(4,mother, father);

        Pet fish2 = new Fish("Starfish", 1);
        Pet fish3 = new Fish("Nino", 1);

        familyController.save(family1);
        familyController.save(family2);
        familyController.save(family3);

        System.out.println("------------------------");

        familyController.displayAllFamilies();

        System.out.println("------------------------");

        //familyController.getFamilyByIndex(2); //done

        //System.out.println("------------------------");

        //familyController.save(newFamily); // dome

        //System.out.println("------------------------");

        //familyController.displayAllFamilies();

        //familyController.deleteFamily(1); //done

        //System.out.println("------------------------");

        //familyController.deleteFamily(family2); //done

        //System.out.println("------------------------");

        //familyController.getFamiliesBiggerThan(3); //done

        //System.out.println("------------------------");

        //familyController.getFamiliesLessThan(4); //done

        //familyController.countFamiliesWithMember();

        //System.out.println("------------------------");

        //familyController.createNewFamily(mother, father); //done

        //System.out.println("------------------------");

        //familyController.displayAllFamilies();

        //System.out.println("------------------------");

        //familyController.bornChild(newFamily1, "boy"); //done

        //System.out.println("------------------------");

        //familyController.displayAllFamilies();

        //System.out.println("------------------------");

        //familyController.adoptChild(family1,child7); //done

        //System.out.println("------------------------");

        //familyController.displayAllFamilies();

        //familyController.deleteAllChildrenOlderThan(25); //done

        //System.out.println("------------------------");

        //familyController.displayAllFamilies();

        //familyController.count(); //done

        //System.out.println("------------------------");

        //familyController.getPets(1); //done

        //System.out.println("------------------------");

       // familyController.addPets(2, fish2); //done

        //System.out.println("------------------------");

        //familyController.addPets(3, fish3); //done

        //System.out.println("------------------------");

       // familyController.displayAllFamilies();

    }
}
