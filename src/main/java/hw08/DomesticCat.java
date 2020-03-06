package hw08;

public class DomesticCat extends Pet {

    public DomesticCat(String nickName, int age) {
        super(nickName, age);
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
                ", habbits=" + getHabbits().toString() +
                '}';
    }
}
