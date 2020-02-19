package hw05;

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

        Family family = new Family();
        family.addChild(child);
        family.addChild(child1);

        System.out.println(family.getChildren().toString());



        System.out.println(dog);
        System.out.println(child);

        System.out.println();

        //String feed= child.isFeed(false);
        //System.out.println(feed);

        child.describePet(dog);




    }
}
