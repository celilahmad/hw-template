package hw06;


import java.util.Arrays;

public class Human {

    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq = (int) (Math.random() * 100 + 1);
    private String[][] schedule = new String[7][1];
    private Family family;

    public Human() {

    }

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;

    }

    public Human(String name, String surname, int yearOfBirth, int iq) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iq = iq;
    }

    public Human(String name, String surname, int yearOfBirth, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iq = iq;
        this.schedule = schedule;


    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Human human = (Human) obj;
        return (this.name == human.name && this.surname == human.surname && this.family == human.family);
    }

    @Override
    public int hashCode() {
        return this.yearOfBirth;
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
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }
}
