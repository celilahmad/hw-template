package hw07;

import java.util.Arrays;

public class Fish extends Pet {

    Species fishy = Species.FISH;

    public Fish(String nickName, int age, String[] habbits) {
        super(nickName, age, habbits);
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
                ", habbits=" + Arrays.toString(getHabbits()) +
                '}';
    }
}
