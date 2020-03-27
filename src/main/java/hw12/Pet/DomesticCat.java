package hw12.Pet;

import java.util.Set;

public class DomesticCat extends Pet {

    public DomesticCat(String nickName, int age, Set<String> habbits) {
        super(nickName, age, habbits);
        this.species= Species.DOMESTICCAT;
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
        return "species="+species +
                " nickname='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", trickLevel=" + getTrickLevel() +
                ", habbits=" + getHabbits().toString()+"\n";
    }
}
