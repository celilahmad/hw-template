package hw12.Entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname, long yearOfBirth, int iq) {
        super(name, surname, yearOfBirth, iq);
    }

    public Woman(String name, String surname, long yearOfBirth, int iq, HashMap<String, String> schedule) {
        super(name, surname, yearOfBirth, iq, schedule);
    }

    public void makeUp() {
        System.out.println(getName() + " doing makeup");
    }

    @Override
    public void greetPet() {
        System.out.println("Woman greeting pet");
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
        return
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", yearOfBirth='" + birthYear() + '\'' +
                ", iq=" + getIq() +
                ", schedule=" + getSchedule()
                ;
    }
}
