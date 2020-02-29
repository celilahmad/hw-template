package hw08;

public class RoboCat extends Pet {

    Species species;

    public RoboCat(String nickName, int age) {
        super(nickName, age);
        this.species=Species.UNKNOWN;
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
                ", habbits=" + getHabbits().toString() +
                '}';
    }
}
