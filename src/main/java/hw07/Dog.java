package hw07;

import java.util.Arrays;

public class Dog extends Pet {

    public Dog(String nickName, int age, String[] habbits) {
        super(nickName, age, habbits);
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
                ", habbits=" + Arrays.toString(getHabbits()) +
                '}';
    }
}
