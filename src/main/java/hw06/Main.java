package hw06;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        DayOfWeek mon = DayOfWeek.MONDAY;
        DayOfWeek tue = DayOfWeek.TUESDAY;
        DayOfWeek wed = DayOfWeek.WEDNESDAY;
        DayOfWeek thu = DayOfWeek.THURSDAY;
        DayOfWeek fri = DayOfWeek.FRIDAY;
        DayOfWeek sat = DayOfWeek.SATURDAY;
        DayOfWeek sun = DayOfWeek.SUNDAY;




        Human human= new Human();

        human.setSchedule(new String[][]{{mon.name(), "do homework"}, {tue.name(), "work"}, {wed.name(), "run"},
                {thu.name(), "go to gym"}, {fri.name(), "go fishing"}, {sat.name(), "relax"}, {sun.name(), "sleep"}});


        for (int i =0; i<human.getSchedule().length; i++){

        }

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
