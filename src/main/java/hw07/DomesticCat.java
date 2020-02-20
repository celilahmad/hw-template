package hw07;

import java.util.Arrays;

public class DomesticCat extends Pet {

    Species caty = Species.DOMESTICCAT;

    public DomesticCat(String nickName, int age, String[] habbits) {
        super(nickName, age, habbits);
    }

    @Override
    public void respond() {
        System.out.println("Cat is responding: meow meow!");
    }

    @Override
    public void foul() {
        System.out.println("Ate my chicken");
    }

    @Override
    public String toString() {
        return caty + "{" +
                "nickName='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", habbits=" + Arrays.toString(getHabbits()) +
                '}';
    }
}
