package hw11.Pet;

public class RoboCat extends Pet {

    public RoboCat(String nickName, int age) {
        super(nickName, age);
        this.species= Species.ROBOCAT;
    }

    @Override
    public void respond() {
        System.out.println("Robot is responding: blaw blaw!");
    }

    @Override
    public String toString() {
        return species +
                " nickName=" + getNickName() + '\'' +
                ", age=" + getAge()
                //", habbits=" + getHabbits().toString() +
                ;
    }
}
