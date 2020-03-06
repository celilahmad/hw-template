package hw07;

import java.util.Arrays;

public class RoboCat extends Pet {

    public RoboCat(String nickName, int age, String[] habbits) {

        super(nickName, age, habbits);
        this.species=Species.ROBOCAT;

    }

    @Override
    public void respond() {
        System.out.println("Robot is responding: blaw blaw!");
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
