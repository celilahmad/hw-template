package hw08;

public class Fish extends Pet {

    Species species;

    public Fish(String nickName, int age) {
        super(nickName, age);
        this.species=Species.FISH;
    }

    @Override
    public void respond() {
        System.out.println("Fish can't respond sorry!");
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
