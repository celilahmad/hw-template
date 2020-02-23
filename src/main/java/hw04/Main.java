package hw04;

public class Main {



    public static void main(String[] args) {

        Human mother = new Human("Jane","Karleone", 1970);

        Human father = new Human("Vito","Karleone", 1965);



        Pet dog = new Pet("dog","Rock",5,new String[]{"eat","drink","sleep"});
        Pet cat = new Pet("cat","Tom",3,new String[]{"eat","drink","sleep"});

        Human child = new Human("Michael","Karleone",1990,mother,father);

        System.out.println(dog);
        System.out.println(child);

        System.out.println();

        child.greetPet(dog);
        String feed= child.isFeed(true);
        System.out.println(feed);

        child.describePet(dog);




    }
}
