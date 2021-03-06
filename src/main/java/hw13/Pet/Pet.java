package hw13.Pet;

import java.util.Set;

public abstract class Pet {

    protected Species species;
    private String nickName;
    private int age;
    private int trickLevel = (int) (Math.random() * 100 + 1);
    private Set<String> habbits;

    public Pet() {
    }

    public Pet(String nickName) {
        this.nickName = nickName;
    }

    public Pet(String nickName, int age) {
        //this.species = species;
        this.nickName = nickName;
        this.age = age;

    }

    public Pet(String nickName, int age, Set<String> habbits) {
        this.nickName = nickName;
        this.age = age;
        this.habbits = habbits;
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public abstract void respond();

    public void foul() {
        System.out.println("I need to cover up");
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setage(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Set<String> getHabbits() {
        return habbits;
    }

    public void setHabbits(Set<String> habbits) {
        this.habbits = habbits;
    }

    @Override
    public String toString() {
        return "species="+species +
                " nickname='" + getNickName() + '\'' +
                ", age=" + getAge() +
                ", trickLevel=" + getTrickLevel() +
                ", habbits=" + getHabbits().toString();
    }
}
