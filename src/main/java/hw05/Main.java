package hw05;

import java.util.Arrays;

public class Main {



    public static void main(String[] args) {

        Human mother = new Human();
        mother.setName("Jane");
        mother.setSurname("Karleone");

        Human father = new Human();
        father.setName("Vito");
        father.setSurname("Karleone");


        Pet dog = new Pet("dog","Rock",5,new String[]{"eat","drink","sleep"});

        Human child = new Human("Michael","Karleone",1990,90);
        Human child1 = new Human("John","Leone", 1992, 89);
        Human child2 = new Human("Merry","Leone", 1994, 86);
        Human child3 = new Human("Louise","Leone", 1996, 84);

        Family family = new Family(mother,father);
        family.addChild(child);
        family.addChild(child1);
        family.addChild(child2);
        family.addChild(child3);


        System.out.println(Arrays.toString(family.getChildren()));
        System.out.println();
       // family.deleteChild(child1);

        System.out.println(family.getChildren());





        System.out.println(dog);
        //System.out.println(child);

        System.out.println();

        //String feed= child.isFeed(false);
        //System.out.println(feed);

        child.describePet(dog);




    }
}
