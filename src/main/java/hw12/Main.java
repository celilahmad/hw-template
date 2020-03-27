package hw12;

import hw12.Entity.*;
import hw12.Pet.Dog;
import hw12.Pet.DomesticCat;
import hw12.Pet.Fish;
import hw12.Pet.Pet;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        FamilyController familyController = new FamilyController();

        HashMap<String, String> sce = new HashMap<>();
        sce.put("Tuesday", "relax");
        HashMap<String, String> sce1 = new HashMap<>();
        sce1.put("Wednesday", "play football");
        HashMap<String, String> sce2 = new HashMap<>();
        sce2.put("Sunday", "ping pong");
        HashMap<String, String> sce3 = new HashMap<>();
        sce3.put("Tuesday", "relax");
        HashMap<String, String> sce4 = new HashMap<>();
        sce4.put("Wednesday", "play football");
        HashMap<String, String> sce5 = new HashMap<>();
        sce5.put("Sunday", "ping pong");
        Human child1 = new Child("girl","Jamilla", "Naek", 637444800000L,77,sce);
        Human child2 = new Child("boy","Ali", "Naek", 724968000000L, 85,sce1);
        Human child3 = new Child("girl","Danielle", "Naek", 745617600000L, 76,sce2);
        Human child4 = new Child("boy","Giovanni", "Naek", 804974400000L,90,sce3);
        Human child5 = new Child("boy","Max", "Naek", 875300400000L, 68,sce4);
        Human child6 = new Child("boy","Taro", "Naek", 943387200000L, 77,sce5);


        Set<String> schedule1 = new HashSet<>();
        schedule1.add("playing");
        schedule1.add("running");
        Set<String> schedule2 = new HashSet<>();
        schedule2.add("sleeping");
        schedule2.add("chasing");
        Dog dog1 = new Dog("Toplan", 2, schedule1);
        Dog dog2 = new Dog("Lulu", 1, schedule2);

        Set<String> schedule3 = new HashSet<>();
        schedule3.add("playing");
        schedule3.add("sleeping");
        Set<String> schedule4 = new HashSet<>();
        schedule4.add("chasing mice");
        Set<String> schedule5 = new HashSet<>();
        schedule5.add("fighting");



        DomesticCat cat1 = new DomesticCat("Tom",3,schedule3);
        DomesticCat cat2 = new DomesticCat("Sosu", 1,schedule4);
        DomesticCat cat3 = new DomesticCat("Motu", 2,schedule5);

        Set<String> schedule6 = new HashSet<>();
        schedule6.add("swimming");
        Fish fish1 = new Fish("Ozy", 1, schedule6);

        List<Pet> familyPet1 = new ArrayList<>(Arrays.asList(dog1, cat1));
        List<Pet> familyPet2 = new ArrayList<>(Arrays.asList(dog2, fish1));
        List<Pet> familyPet3 = new ArrayList<>(Arrays.asList(cat2, cat3));

        HashMap<String, String> sce6 = new HashMap<>();
        sce6.put("Wednesday", "go to pub");
        HashMap<String, String> sce7 = new HashMap<>();
        sce7.put("Saturday", "make up");
        Human boy = new Child("boy","Rocky", "Balboa", 823464000000L, 70, sce6);
        Human girl = new Child("girl","Charlize", "Theron", 891802800000L,87, sce7);


        List<Human> familyChild1 = new ArrayList<>(Arrays.asList(child1));
        List<Human> familyChild2 = new ArrayList<>(Arrays.asList(child2, child3, child4));
        List<Human> familyChild3 = new ArrayList<>(Arrays.asList(child5, child6));

        HashMap<String, String> newSchedule3 = new HashMap<>();
        newSchedule3.put("Tuesday", "relax");
        HashMap<String, String> newSchedule4 = new HashMap<>();
        newSchedule4.put("Wednesday", "play football");
        HashMap<String, String> newSchedule5 = new HashMap<>();
        newSchedule5.put("Sunday", "ping pong");
        HashMap<String, String> newSchedule6 = new HashMap<>();
        newSchedule6.put("Tuesday", "relax");
        HashMap<String, String> newSchedule7 = new HashMap<>();
        newSchedule7.put("Wednesday", "play football");
        HashMap<String, String> newSchedule8 = new HashMap<>();
        newSchedule8.put("Sunday", "ping pong");

        Family family1 = new Family(1, new Man("Jack", "Stuard",3960000000L,88,newSchedule3),
                new Woman("Michele", "Rodriguez",67032000000L,80,newSchedule4), familyChild1, familyPet1);

        Family family2 = new Family(2, new Man("Alan", "Walker",45864000000L, 90,newSchedule5),
                new Woman("Adriana", "Lima",109022400000L, 85,newSchedule6), familyChild2, familyPet2);
        Family family3 = new Family(3, new Man("Michael", "Jackson",53812800000L, 99,newSchedule7),
                new Woman("Nicky", "Minaj",180043200000L, 78,newSchedule8), familyChild3, familyPet3);


        Human child7 = new Human("Jeremy", "Brown", 639428400000L,80);
        Human child8 = new Human("Juan", "Naek", 723672000000L, 90);
        List<Human> familyChild = new ArrayList<>(Arrays.asList(child7, child8));

        HashMap<String, String> newSchedule9 = new HashMap<>();
        newSchedule9.put("Thursday", "work");
        HashMap<String, String> newSchedule10 = new HashMap<>();
        newSchedule10.put("Wednesday", "basketball");
        Family newFamily = new Family(4, new Woman("Giovanni", "Cupello",186177600000L, 10,newSchedule9),
                new Man("Suu", "Lee",191188800000L,90, newSchedule10), familyChild);

        HashMap<String, String> newSchedule = new HashMap<>();
        newSchedule.put("Monday", "working");
        HashMap<String, String> newSchedule1 = new HashMap<>();
        newSchedule1.put("Friday", "fishing");

        Human mother = new Human("Emily", "Blunt",153777600000L, 70, newSchedule);
        Human father = new Human("Matt", "Damon",123105600000L, 80, newSchedule1);
        Family newFamily1 = new Family(4,mother, father);

        Set<String> schedule7 = new HashSet<>();
        schedule7.add("playing");
        Set<String> schedule8 = new HashSet<>();
        schedule8.add("eating");
        Pet fish2 = new Fish("Starfish", 1,schedule7);
        Pet fish3 = new Fish("Nino", 1, schedule8);


        familyController.save(family1);
        familyController.save(family2);
        familyController.save(family3);

        System.out.println("------------------------");

        //familyController.displayAllFamilies();

        //System.out.println("------------------------");

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

        //familyController.adoptChild(family2,child7); //done

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
