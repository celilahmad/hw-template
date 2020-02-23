package hw08;

import java.util.Arrays;
import java.util.Set;

public class RoboCat extends Pet {

    Species roby = Species.UNKNOWN;

    public RoboCat(String nickName, int age) {

        super(nickName, age);

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
                ", habbits=" + getHabbits().toString() +
                '}';
    }
}
