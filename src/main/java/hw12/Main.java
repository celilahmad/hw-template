package hw12;

import hw12.Entity.*;
import hw12.Pet.Dog;
import hw12.Pet.DomesticCat;
import hw12.Pet.Fish;
import hw12.Pet.Pet;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {


    public static void main(String[] args) throws ParseException {

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
        Human child1 = new Child("girl", "Jamilla", "Naek", 637444800000L, 77, sce);
        Human child2 = new Child("boy", "Ali", "Naek", 724968000000L, 85, sce1);
        Human child3 = new Child("girl", "Danielle", "Naek", 745617600000L, 76, sce2);
        Human child4 = new Child("boy", "Giovanni", "Naek", 804974400000L, 90, sce3);
        Human child5 = new Child("boy", "Max", "Naek", 875300400000L, 68, sce4);
        Human child6 = new Child("boy", "Taro", "Naek", 943387200000L, 77, sce5);


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


        DomesticCat cat1 = new DomesticCat("Tom", 3, schedule3);
        DomesticCat cat2 = new DomesticCat("Sosu", 1, schedule4);
        DomesticCat cat3 = new DomesticCat("Motu", 2, schedule5);

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
        Human boy = new Child("boy", "Rocky", "Balboa", 823464000000L, 70, sce6);
        Human girl = new Child("girl", "Charlize", "Theron", 891802800000L, 87, sce7);


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

        Family family1 = new Family(1, new Man("Jack", "Stuard", 3960000000L, 88, newSchedule3),
                new Woman("Michele", "Rodriguez", 67032000000L, 80, newSchedule4), familyChild1, familyPet1);
        Family family2 = new Family(2, new Man("Alan", "Walker", 45864000000L, 90, newSchedule5),
                new Woman("Adriana", "Lima", 109022400000L, 85, newSchedule6), familyChild2, familyPet2);
        Family family3 = new Family(3, new Man("Michael", "Jackson", 53812800000L, 99, newSchedule7),
                new Woman("Nicky", "Minaj", 180043200000L, 78, newSchedule8), familyChild3, familyPet3);


        Scanner sc = new Scanner(System.in);
        familyController.menu();
        String input;
        boolean test = true;
        while (test) {

            input = sc.nextLine();
            switch (input) {
                case "1":
                    familyController.save(family1);
                    familyController.save(family2);
                    familyController.save(family3);
                    break;
                case "2":
                    familyController.displayAllFamilies();
                    break;
                case "3":
                    System.out.println("At least how many members in family you want?");
                    familyController.getFamiliesBiggerThan(sc.nextInt());
                    break;
                case "4":
                    System.out.println("Limit the familiy members with ");
                    familyController.getFamiliesLessThan(sc.nextInt());
                    break;
                case "5":
                    System.out.println("Found excat members of family");
                    familyController.getFamiliesEqual(sc.nextInt());
                    break;
                case "6":
                    System.out.println("Enter mother name");
                    String name = sc.nextLine();
                    System.out.println("Enter mother surname");
                    String surname = sc.nextLine();
                    System.out.println("Enter mother birth year");
                    int year = sc.nextInt();
                    System.out.println("Enter mother birth month");
                    int month = sc.nextInt();
                    System.out.println("Enter mother birth day");
                    int day = sc.nextInt();
                    System.out.println("Enter mother iq");
                    int iq = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter father name");
                    String name1 = sc.nextLine();
                    System.out.println("Enter father surname");
                    String surname1 = sc.nextLine();
                    System.out.println("Enter father birth year");
                    int year1 = sc.nextInt();
                    System.out.println("Enter father birth month");
                    int month1 = sc.nextInt();
                    System.out.println("Enter father birth day");
                    int day1 = sc.nextInt();
                    System.out.println("Enter father iq");
                    int iq1 = sc.nextInt();

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                    SimpleDateFormat sample = new SimpleDateFormat("yyyy/MM/dd");

                    LocalDate dt1 = LocalDate.of(year, month, day);
                    String s1 = formatter.format(dt1);
                    Date date = sample.parse(s1);
                    long millis = date.getTime();

                    LocalDate dt2 = LocalDate.of(year1, month1, day1);
                    String s2 = formatter.format(dt2);
                    Date date1 = sample.parse(s2);
                    long millis1 = date1.getTime();

                    Woman woman = new Woman(name, surname, millis, iq);
                    Man man = new Man(name1, surname1, millis1, iq1);

                    System.out.println("New Family creating");
                    familyController.createNewFamily(woman, man);

                    break;
                case "7":
                    System.out.println("Enter index number you want to delete");
                    familyController.deleteFamily(sc.nextInt());
                    break;
                case "8":
                    System.out.println("Enter 1 for birthChild, 2 for adopt child, 3 for main menu");
                    int sel = sc.nextInt();
                    if (sel == 1) {
                        System.out.println("Enter family id");
                        int i = sc.nextInt();
                        sc.nextLine();
                        familyController.getFamilyByIndex(i);
                        System.out.println("Enter gender(boy or girl)");
                        String gen = sc.nextLine();
                        System.out.println("Enter name");
                        String nameChild = sc.nextLine();
                        System.out.println("Enter surname");
                        String surnameChild = sc.nextLine();
                        Human newHuman = new Child(gen, nameChild, surnameChild);
                        familyController.familyService.getFamilyByIndex(i).addChild(newHuman);
                        System.out.println("Added to family");
                        familyController.getFamilyByIndex(i);
                    } else if (sel == 2) {
                        System.out.println("Enter family id");
                        int i = sc.nextInt();
                        sc.nextLine();
                        familyController.getFamilyByIndex(i);
                        System.out.println("Enter gender(boy or girl)");
                        String gen = sc.nextLine();
                        System.out.println("Enter name");
                        String nameChild = sc.nextLine();
                        System.out.println("Enter surname");
                        String surnameChild = sc.nextLine();
                        System.out.println("Enter birth date");
                        String yaerChild = sc.nextLine();
                        System.out.println("Enter iq");
                        int iql = sc.nextInt();
                        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                        SimpleDateFormat sample1 = new SimpleDateFormat("yyyy/MM/dd");

                        Date newDate = sample1.parse(yaerChild);
                        long milli = newDate.getTime();
                        Human hw = new Child(gen, nameChild, surnameChild, milli, iql);
                        familyController.familyService.getFamilyByIndex(i).addChild(hw);
                    } else if (sel == 3) {
                        familyController.menu();
                    } else {
                        System.out.println("Enter correct number. Returning to main menu");
                        familyController.menu();
                    }
                    break;

                case "9":
                    System.out.println("Delete children bigger than");
                    familyController.deleteAllChildrenOlderThan(sc.nextInt());
                    break;
                case "exit":
                    System.out.println("Exiting");
                    test = false;
                    break;
                default:
                    System.out.println("Enter correct number");
            }

        }


    }
}
