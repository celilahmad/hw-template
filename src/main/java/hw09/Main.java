package hw09;

import hw09.Entity.Family;
import hw09.Entity.Human;
import hw09.Pet.Fish;
import hw09.Pet.Pet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        FamilyController familyController = new FamilyController();

        Human child1 = new Human("Danielle", "Naek", 1990);
        Human child2 = new Human("Max", "Naek", 1992);
        List<Human> familyChild = new ArrayList<>(Arrays.asList(child1, child2));
        Family newFamily = new Family(4, new Human("Giovanni", "Cupello"), new Human("Suu", "Lee"), familyChild);

        Human mother = new Human("Emily", "Blunt");
        Human father = new Human("Matt", "Damon");
        Family newFamily1 = new Family(mother, father);

        Human bornChild = new Human("Alice", "Eyre");
        Pet fish2 = new Fish("Starfish", 1);
        Pet fish3 = new Fish("Nino", 1);

        familyController.getAllFamilies();

        System.out.println("------------------------");

        familyController.getFamilyByIndex(2); //done

        //System.out.println("------------------------");

        //familyController.save(newFamily); // dome

        //System.out.println("------------------------");

        //familyController.deleteFamily(15); //done

        //System.out.println("------------------------");

        //familyController.deleteFamily(newFamily); //done

        //System.out.println("------------------------");

        //familyController.getFamiliesBiggerThan(3); done

        //System.out.println("------------------------");

        //familyController.getFamiliesLessThan(4); done

        //System.out.println("------------------------");

        //familyController.createNewFamily(mother, father); done

        //System.out.println("------------------------");

        //familyController.bornChild(newFamily1, "boy"); //done

        //System.out.println("------------------------");

        //familyController.getAllFamilies();

        //System.out.println("------------------------");

        //familyController.adoptChild(newFamily1,newFamily ,child1); done

        //System.out.println("------------------------");

        //familyController.deleteAllChildrenOlderThan(25); done

        //System.out.println("------------------------");

        //familyController.getAllFamilies();

        //familyController.count(); //done

        //System.out.println("------------------------");

        //familyController.getPets(2); //done

        //System.out.println("------------------------");

        //familyController.addPets(2, fish2); //done

        //System.out.println("------------------------");

        //familyController.addPets(3, fish3); //done

        //System.out.println("------------------------");

        //familyController.addPets(4, fish3); //done

        //System.out.println("----------------");

       // familyController.getAllFamilies();

    }
}
