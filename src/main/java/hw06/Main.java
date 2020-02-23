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



        Human child = new Human("Jack", "Sparrow", 1800, 100);
        Human child1 = new Human("Jacky", "Sparrowy", 1900, 80);
        Human child2 = new Human("Mick", "Mouse", 1950, 90);
        Human child3 = new Human("Micky", "Mousy", 1990, 75);

        child.setSchedule(new String[][]{{mon.name(), "do homework"}, {tue.name(), "work"}, {wed.name(), "run"},
                {thu.name(), "go to gym"}, {fri.name(), "go fishing"}, {sat.name(), "relax"}, {sun.name(), "sleep"}});

        child1.setSchedule(new String[][]{{mon.name(), "go to work"}, {tue.name(), "watch football"}, {wed.name(), "games"},
                {thu.name(), "play chess"}, {fri.name(), "code"}, {sat.name(), "relax"}, {sun.name(), "sleep"}});

        child2.setSchedule(new String[][]{{mon.name(), "wash car"}, {tue.name(), "work"}, {wed.name(), "watch tv"},
                {thu.name(), "go to gym"}, {fri.name(), "visit friends"}, {sat.name(), "relax"}, {sun.name(), "sleep"}});

        child3.setSchedule(new String[][]{{mon.name(), "work"}, {tue.name(), "clean house"}, {wed.name(), "play poker"},
                {thu.name(), "play games"}, {fri.name(), "go to pub"}, {sat.name(), "relax"}, {sun.name(), "sleep"}});



        family.addChild(child);
        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);

        System.out.println(Arrays.toString(family.getChildren()));


        for (Human h : family.getChildren()) {
            System.out.println(Arrays.deepToString(h.getSchedule()));
        }
        System.out.println();
        //family.finalize();
        family.deleteChild(child);
        family.deleteChild(0);



        System.out.println(Arrays.toString(family.getChildren()));

        //System.out.println(Arrays.deepToString(human.getSchedule()));


        int size= family.countFamily();
        System.out.println("Family size is " + size);




    }
}
