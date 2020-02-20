package hw07;

import java.util.Arrays;

public class RoboCat extends Pet {

    Species roby = Species.UNKNOWN;

    public RoboCat(String nickName, int age, String[] habbits) {

        super(nickName, age, habbits);

    }

    @Override
    public void respond() {
        System.out.println("Robot is responding: blaw blaw!");
    }

    @Override
    public String toString() {
        return roby + "{" +
                "nickName='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", habbits=" + Arrays.toString(getHabbits()) +
                '}';
    }
}
