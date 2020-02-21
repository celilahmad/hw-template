package hw06;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) throws Throwable {

        DayOfWeek mon = DayOfWeek.MONDAY;
        DayOfWeek tue = DayOfWeek.TUESDAY;
        DayOfWeek wed = DayOfWeek.WEDNESDAY;
        DayOfWeek thu = DayOfWeek.THURSDAY;
        DayOfWeek fri = DayOfWeek.FRIDAY;
        DayOfWeek sat = DayOfWeek.SATURDAY;
        DayOfWeek sun = DayOfWeek.SUNDAY;



        Family family = new Family();
        Human human= new Human();

        human.setSchedule(new String[][]{{mon.name(), "do homework"}, {tue.name(), "work"}, {wed.name(), "run"},
                {thu.name(), "go to gym"}, {fri.name(), "go fishing"}, {sat.name(), "relax"}, {sun.name(), "sleep"}});


        Human child = new Human("Jack", "Sparrow", 1800, 100, new String[][]{{"Monday","doo"}, {"Tuesday", "work"}});
        Human child1 = new Human("Jacky", "Sparrowy", 1800, 100, new String[][]{{"Monday","doo"}, {"Tuesday", "work"}});

        family.addChild(child);
        family.addChild(child1);


        System.out.println(Arrays.toString(family.getChildren()));

        family.deleteChild(child);

        System.out.println(Arrays.toString(family.getChildren()));

        System.out.println(Arrays.deepToString(human.getSchedule()));
        /*Human mother = new Human();
        mother.setName("Jane");
        mother.setSurname("Karleone");

        Human father = new Human();
        father.setName("Vito");
        father.setSurname("Karleone");


        Pet dog = new Pet(Species.DOG,"Rock",5,new String[]{"eat","drink","sleep"});

        Human child = new Human("Michael","Karleone",1990,90,dog,mother,father);

        System.out.println(dog);
        System.out.println(child);

        System.out.println();

        String feed= child.isFeed(false);
        System.out.println(feed);

        child.describePet(dog);*/




    }
}
