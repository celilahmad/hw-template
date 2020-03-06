package hw07;

import java.util.Arrays;

public class Fish extends Pet {

    public Fish(String nickName, int age, String[] habbits) {
        super(nickName, age, habbits);
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
                ", habbits=" + Arrays.toString(getHabbits()) +
                '}';
    }
}
