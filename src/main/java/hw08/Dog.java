package hw08;

import java.util.Set;

public class Dog extends Pet {

    Species dogy = Species.DOG;

    public Dog(String nickName, int age) {
        super(nickName, age);
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
        return dogy + "{" +
                "nickName='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", habbits=" + getHabbits().toString() +
                '}';
    }
}
