package hw10.Entity;

import hw10.Pet.Pet;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.*;


public class Human {

    private String name;
    private String surname;
    private long birthDateInMillis;
    private int iq = (int) (Math.random() * 100 + 1);
    private Map<String, String> schedule = new HashMap<>();
    private Family family;

    public Human() {

    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
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
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        long now = calendar.getTimeInMillis();
        long bithdate = this.birthDateInMillis;

        Date date1 = new Date(now);
        String dateNow = formatter.format(date1);

        String array2[]= dateNow.split("/");
        int dayNow= Integer.parseInt(array2[0]);
        int montNow = Integer.parseInt(array2[1]);
        int yearNow = Integer.parseInt(array2[2]);


        Date date = new Date(bithdate);
        String birt = formatter.format(date);

        String array3[]= birt.split("/");
        int dayBirth= Integer.parseInt(array3[0]);
        int montBirth = Integer.parseInt(array3[1]);
        int yearBirth = Integer.parseInt(array3[2]);

        int yearAge;
        int yearMonth;
        int yearDay;

        yearAge= yearNow-yearBirth;

        if (montNow-montBirth<0){
            yearAge--;
            yearMonth=montBirth+montNow;
        }else{
            yearMonth=montNow+montBirth;
        }

        if (dayNow-dayBirth<0){
            yearMonth--;
            yearDay=30-(montBirth-montNow);
        }else{
            yearDay = dayNow-dayBirth;
        }

        return String.format( "%d years %d months %d days old!", yearAge, yearMonth, yearDay);
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

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\''
                 + ", age='" + describeAge()+"\n";
    }
}
