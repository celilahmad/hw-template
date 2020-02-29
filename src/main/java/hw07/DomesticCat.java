package hw07;

import java.util.Arrays;

public class DomesticCat extends Pet {

    Species species;

    public DomesticCat(String nickName, int age, String[] habbits) {
        super(nickName, age, habbits);
        this.species=Species.DOMESTICCAT;
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
        return species + "{" +
                "nickName='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", habbits=" + Arrays.toString(getHabbits()) +
                '}';
    }
}
