package hw08;

import java.util.Arrays;
import java.util.Set;

public class DomesticCat extends Pet {

    Species caty = Species.DOMESTICCAT;

    public DomesticCat(String nickName, int age) {
        super(nickName, age);
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
                ", habbits=" + getHabbits().toString() +
                '}';
    }
}
