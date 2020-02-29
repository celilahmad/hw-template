package hw08;

public class Dog extends Pet {

    Species species;

    public Dog(String nickName, int age) {
        super(nickName, age);
        this.species=Species.DOG;
    }

    @Override
    public void respond() {
        System.out.println("Dog is responding: huaw huaw!");
    }

    @Override
    public void foul() {
        System.out.println("Make home dirty");
    }

    @Override
    public String toString() {
        return species + "{" +
                "nickName='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", habbits=" + getHabbits().toString() +
                '}';
    }
}
