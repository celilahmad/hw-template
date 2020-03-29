package hw13.Entity;

import java.util.Date;
import java.util.HashMap;

public final class Man extends Human {

    public Man(String name, String surname, long yearOfBirth, int iq) {
        super(name, surname, yearOfBirth, iq);
    }

    public Man(String name, String surname, long yearOfBirth, int iq, HashMap<String, String> schedule) {
        super(name, surname, yearOfBirth, iq, schedule);
    }

    public void repairCar() {
        System.out.println(getName() + " repairing car!");
    }

    @Override
    public void greetPet() {
        System.out.println("Man greeting pet");
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
