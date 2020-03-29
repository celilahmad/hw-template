package hw13.Pet;

import java.util.Set;

public class Dog extends Pet {

    public Dog(String nickName, int age, Set<String> habbits) {
        super(nickName, age, habbits);
        this.species= Species.DOG;
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
        return "species="+species +
                " nickname='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", trickLevel=" + getTrickLevel() +
                ", habbits=" + getHabbits().toString()+"\n";
    }
}
