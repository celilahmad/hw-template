package hw12.Pet;

import java.util.Set;

public class Fish extends Pet {

    public Fish(String nickName, int age, Set<String> habbits) {
        super(nickName, age, habbits);
        this.species= Species.FISH;
    }

    @Override
    public void respond() {
        System.out.println("Fish can't respond sorry!");
    }

    @Override
    public String toString() {
        return "species="+species +
                " nickname='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", habbits=" + getHabbits().toString()+"\n";
    }
}
