package hw10.Entity;

import hw10.Pet.Pet;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Human {

    private String name;
    private String surname;
    private long birthDateInMillis;
    //private int iq = (int) (Math.random() * 100 + 1);
    private int iq;
    private Map<String, String> schedule;
    private Family family;

    public Human() {

    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Human(String name, String surname, long birthDateInMillis, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDateInMillis = birthDateInMillis;

        this.iq = iq;
    }

    public Human(String name, String surname, long birthDateInMillis) {
        this.name = name;
        this.surname = surname;
        this.birthDateInMillis = birthDateInMillis;

    }

    public Human(String name, String surname, long birthDateInMillis, int iq, HashMap<String, String> schedule){
        this.name = name;
        this.surname = surname;
        this.birthDateInMillis = birthDateInMillis;
        this.iq = iq;
        this.schedule=schedule;

    }


    public String describeAge(){

        return Instant.ofEpochMilli(this.birthDateInMillis).atZone(ZoneId.systemDefault()).
                toLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    }

    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickName());
    }

    public void describePet(Pet pet) {
        int sly = pet.getTrickLevel();
        StringBuilder s = new StringBuilder();
        if (sly > 50) {
            s.append("very sly");
        } else if (sly < 50) {
            s.append("almost not sly");
        }
        System.out.println("I have a " + ", he is " + pet.getAge() + " years old"
                + ", he is " + s);
    }

    public void greetPet() {
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

    public long getYearOfBirth() {
        return birthDateInMillis;
    }

    public void setYearOfBirth(long yearOfBirth) {
        this.birthDateInMillis = yearOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public String birthYear(){
        long birth = this.birthDateInMillis;
        Date date = new Date(birth);
        String format = formatter.format(date);
        return format;
    }


    @Override
    public String toString() {

        return "name='" + name + '\'' +
                ", surname='" + surname + '\''
                 + ", age='" + birthYear() + '\''
                + " iq='" + iq + "\n";
    }
}
