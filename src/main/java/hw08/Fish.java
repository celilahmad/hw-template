package hw08;

import java.util.Set;

public class Fish extends Pet {

    Species fishy = Species.FISH;

    public Fish(String nickName, int age) {
        super(nickName, age);
    }

    @Override
    public void respond() {
        System.out.println("Fish can't respond sorry!");
    }

    @Override
    public String toString() {
        return fishy + "{" +
                "nickName='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", habbits=" + getHabbits().toString() +
                '}';
    }
}
