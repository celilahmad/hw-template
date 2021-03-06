package hw04;

import java.util.Arrays;

public class Pet {

    private String species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String[] habbits;

    public Pet(){}

    public Pet(String species, String nickName) {
        this.species = species;
        this.nickName = nickName;
    }

    public Pet(String species, String nickName, int age, String[] habbits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;

        this.habbits = habbits;
    }

    public void eat(){
        System.out.println("I'm eating");
    }

    public void respond(){
        System.out.println("Hello, owner. I am - " + getNickName() + ". I miss you!");
    }

    public void foul(){
        System.out.println("I need to cover up");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
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

    public String[] getHabbits() {
        return habbits;
    }

    public void setHabbits(String[] habbits) {
        this.habbits = habbits;
    }

    @Override
    public String toString() {
        return species +"{" +
                "nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habbits=" + Arrays.toString(habbits) +
                '}';
    }
}
