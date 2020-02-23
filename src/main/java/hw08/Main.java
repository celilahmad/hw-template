package hw08;


import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) throws Throwable {

        Family family = new Family();


        Human child1 = new Human("Jamilla","Naek", 1990);
        child1.getSchedule().put("Monday","work");
        child1.getSchedule().put("Tuesday","work");

        Human child2 = new Human("Ali","Naek", 1992);
        child2.getSchedule().put("Monday","school");
        child2.getSchedule().put("Tuesday","watch tv");

        Human child3 = new Human("Danielle","Naek", 1993);
        child3.getSchedule().put("Monday","gym");
        child3.getSchedule().put("Tuesday","fishing");

        Human child4 = new Human("Giovanni","Naek", 1995);
        child4.getSchedule().put("Monday","work");
        child4.getSchedule().put("Tuesday","pub");

        Human child5 = new Human("Max","Naek", 1997);
        child5.getSchedule().put("Monday","fishing");
        child5.getSchedule().put("Tuesday","sleep");

        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);
        family.addChild(child4);
        family.addChild(child5);

        System.out.println(family.getChildren());

        family.deleteChild(child1);

        System.out.println(family.getChildren());

        family.delChild(2);

        System.out.println(family.getChildren());

        family.countFamily();

        System.out.println();

       Dog dog1 = new Dog("Toplan", 3);
       dog1.getHabbits().addAll(Arrays.asList("playing","barking"));

        Fish fish1 = new Fish("Buble", 1);
        fish1.getHabbits().addAll(Arrays.asList("swimming","eating"));

        DomesticCat cat1 = new DomesticCat("Tom", 2);
        cat1.getHabbits().addAll(Arrays.asList("eating","sleeping"));

        RoboCat rob1 = new RoboCat("Matrix", 5);
        rob1.getHabbits().addAll(Arrays.asList("cleaning house"));


        System.out.println(dog1);
        System.out.println(fish1);
        System.out.println(cat1);
        System.out.println(rob1);

        System.out.println();

        /*dog1.respond();
        cat1.foul();
        fish1.respond();

        Man man = new Man("John", "Leon", 1960);
        man.greetPet();
        man.repairCar();

        Woman woman = new Woman("Emily", "Clarke", 1985);
        woman.makeUp();*/

        family.getPet().add(dog1);
        family.getPet().add(cat1);
        System.out.println(family.getPet());
    }
}
