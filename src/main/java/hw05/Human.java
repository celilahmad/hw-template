package hw05;

import java.util.Arrays;

public class Human {

    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq = (int)(Math.random()*100+1);
    private String[][] schedule = new String[7][2];
    private Family family;

    public Human(){

    }

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;

        schedule[0][0] = "Sunday";
        schedule[0][1] = "Do the hommeworks";

        schedule[1][0] = "Monday";
        schedule[1][1] = "Go to course; Watch film";

        schedule[2][0] = "Tuesday";
        schedule[2][1] = "Go to course; Play football";

        schedule[3][0] = "Wednesday";
        schedule[3][1] = "Go to course; Play video games";

        schedule[4][0] = "Thursday";
        schedule[4][1] = "Go to course; Go out with friends";

        schedule[5][0] = "Friday";
        schedule[5][1] = "Go to course; Visit grandpa";

        schedule[6][0] = "Saturday";
        schedule[6][1] = "Relax whole day";

    }

    public Human(String name, String surname, int yearOfBirth, int iq) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iq = iq;


    }

    /*public String isFeed(boolean feedTime){
        //pet.setTrickLevel((int)(Math.random()*100+1));
        if (feedTime==false){
            if (pet.getTrickLevel()>50){
                System.out.println("Trick level: " + pet.getTrickLevel());
                return "Hm... I will feed " + pet.getNickName();
            }else{
                System.out.println("Trick level: " +pet.getTrickLevel());
                return "I think " + pet.getNickName() + " is not hungry.";
            }
        }else{
            return "Feeding";
        }


    }*/

    public void greetPet(Pet pet){
        System.out.println("Hello, "+ pet.getNickName());
    }

    public void describePet(Pet pet){
        int sly = pet.getTrickLevel();
        StringBuilder s =new StringBuilder();
        if (sly>50){
            s.append("very sly");
        }else if(sly<50) {
            s.append("almost not sly");
        }
        System.out.println("I have a " + pet.getSpecies() + ", he is " + pet.getAge() + " years old"
                + ", he is " + s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }



    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", iq=" + iq +
                //", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
