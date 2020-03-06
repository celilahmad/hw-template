package hw07;

import java.util.Arrays;

public abstract class Pet {

    protected Species species;
    private String nickName;
    private int age;
    private int trickLevel = (int) (Math.random() * 100 + 1);
    private String[] habbits;

    public Pet() {
    }

    public Pet(String nickName) {
        this.nickName = nickName;
    }

    public Pet(String nickName, int age, String[] habbits) {
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

    public String[] getHabbits() {
        return habbits;
    }

    public void setHabbits(String[] habbits) {
        this.habbits = habbits;
    }

    @Override
    public String toString() {
        return "{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habbits=" + Arrays.toString(habbits) +
                '}';
    }
}
