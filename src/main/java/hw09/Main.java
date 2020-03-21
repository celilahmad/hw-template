package hw09;

import hw09.Entity.Family;
import hw09.Entity.Human;

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

        familyController.getAllFamilies();

        System.out.println("------------------------");

        // familyController.getFamilyByIndex(2); //done

        //familyController.save(newFamily); // dome

        //System.out.println("------------------------");

        //familyController.deleteFamily(1); //done

        //familyController.deleteFamily(newFamily); done

        //System.out.println("------------------------");

        //familyController.getFamiliesBiggerThan(3); done

        //System.out.println("------------------------");

        //familyController.getFamiliesLessThan(4); done


        //familyController.createNewFamily(mother, father); done

        //familyController.bornChild(newFamily1, "boy"); //done

        //familyController.getAllFamilies();

        //familyController.adoptChild(newFamily1,newFamily ,child1); done

        //familyController.deleteAllChildrenOlderThan(25); done

        System.out.println("------------------------");

        //familyController.getAllFamilies();

        //familyController.count(); done

        //familyController.getPets(2); done



















    /*    Family family1 = new Family();
        Family family2 = new Family();
        Family family3 = new Family();


        Human child1 = new Human("Jamilla", "Naek", 1990);
        child1.getSchedule().put("Monday", "work");
        child1.getSchedule().put("Tuesday", "work");

        Human child2 = new Human("Ali", "Naek", 1992);
        child2.getSchedule().put("Monday", "school");
        child2.getSchedule().put("Tuesday", "watch tv");

        Human child3 = new Human("Danielle", "Naek", 1993);
        child3.getSchedule().put("Monday", "gym");
        child3.getSchedule().put("Tuesday", "fishing");

        Human child4 = new Human("Giovanni", "Naek", 1995);
        child4.getSchedule().put("Monday", "work");
        child4.getSchedule().put("Tuesday", "pub");

        Human child5 = new Human("Max", "Naek", 1997);
        child5.getSchedule().put("Monday", "fishing");
        child5.getSchedule().put("Tuesday", "sleep");

        Human child6 = new Human("Taro", "Naek", 1999);
        child6.getSchedule().put("Monday", "working");
        child6.getSchedule().put("Tuesday", "sleep");

        family1.addChild(child1);
        family2.addChild(child2);
        family2.addChild(child3);
        family2.addChild(child4);
        family3.addChild(child5);
        family3.addChild(child6);

        System.out.println(family1.getChildren());*/

        //family.finalize();
        // family1.deleteChild(child1);

        //System.out.println(family1.getChildren());

        //family1.deleteChild(2);

        //System.out.println(family1.getChildren());

        //System.out.println(family1.countFamily());

        //System.out.println();

        /*Dog dog1 = new Dog("Toplan", 3);
        dog1.getHabbits().add("playing");
        dog1.getHabbits().add("barking");

        Fish fish1 = new Fish("Buble", 1);
        fish1.getHabbits().add("swimming");
        fish1.getHabbits().add("eating");

        DomesticCat cat1 = new DomesticCat("Tom", 2);
        cat1.getHabbits().add("eating");
        cat1.getHabbits().add("sleeping");

        RoboCat rob1 = new RoboCat("Matrix", 5);
        rob1.getHabbits().add("Cleaning houses");


        System.out.println(dog1);
        System.out.println(fish1);
        System.out.println(cat1);
        System.out.println(rob1);

        System.out.println();*/

        /*dog1.respond();
        cat1.foul();
        fish1.respond();

        Man man = new Man("John", "Leon", 1960);
        man.greetPet();
        man.repairCar();

        Woman woman = new Woman("Emily", "Clarke", 1985);
        woman.makeUp();*/

        /*family1.getPet().add(dog1);
        family1.getPet().add(cat1);
        System.out.println(family1.getPet());*/
    }
}
