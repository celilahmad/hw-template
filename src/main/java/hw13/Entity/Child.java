package hw13.Entity;

import java.util.Date;
import java.util.HashMap;

public class Child extends Human {

    public Child(String gender, String name, String surname) {
        super(gender, name, surname);
    }

    public Child(String gender,String name, String surname, long yearOfBirth, int iq) {
        super(gender, name, surname, yearOfBirth, iq);
    }

    public Child(String gender,String name, String surname, long yearOfBirth, int iq, HashMap<String, String> schedule) {
        super(gender, name, surname, yearOfBirth, iq, schedule);
    }

    @Override
    public String birthYear(){
        long birth = this.getYearOfBirth();
        Date date = new Date(birth);
        String format = formatter.format(date);
        return format;
    }

    @Override
    public String toString() {
        return getGender() + ":" +
                " name='" + getName() + '\'' +
                        ", surname='" + getSurname() + '\'' +
                        ", yearOfBirth='" + birthYear() + '\'' +
                        ", iq=" + getIq() +
                        ", schedule=" + getSchedule() +
                        "\n";
    }
}
