package hw07;

public class Main {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Toplan", 3, new String[]{"eating", "drinking", "running"});

        Fish fish1 = new Fish("Buble", 1, new String[]{"eating", "swimming"});

        DomesticCat cat1 = new DomesticCat("Tom", 2, new String[]{"eating", "catching mouse", "sleeping"});

        RoboCat rob1 = new RoboCat("Matrix", 5, new String[]{"cleaning house"});

        System.out.println(dog1);
        System.out.println(fish1);
        System.out.println(cat1);
        System.out.println(rob1);

        System.out.println();

        dog1.respond();
        cat1.foul();
        fish1.respond();

        Man man = new Man("John", "Leon", 1960);
        man.greetPet();
        man.repairCar();

        Woman woman = new Woman("Emily", "Clarke", 1985);
        woman.makeUp();

    }
}
