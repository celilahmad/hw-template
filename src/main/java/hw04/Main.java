package hw04;

public class Main {



    public static void main(String[] args) {

        Human mother = new Human();
        mother.setName("Jane");
        mother.setSurname("Karleone");

        Human father = new Human();
        father.setName("Vito");
        father.setSurname("Karleone");


        Pet dog = new Pet("dog","Rock",5,new String[]{"eat","drink","sleep"});

        Human child = new Human("Michael","Karleone",1990,90,dog,mother,father);

        System.out.println(dog);
        System.out.println(child);

        System.out.println();

        String feed= child.isFeed(false);
        System.out.println(feed);

        child.describePet(dog);




    }
}
