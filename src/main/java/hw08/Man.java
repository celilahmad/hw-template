package hw08;

public class Man extends Human {

    public Man(String name, String surname, int yearOfBirth) {
        super(name, surname, yearOfBirth);
    }

    public void repairCar() {
        System.out.println(getName() + " repairing car!");
    }

    @Override
    public void greetPet() {
        System.out.println("Man greeting pet");
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                '}';
    }
}
