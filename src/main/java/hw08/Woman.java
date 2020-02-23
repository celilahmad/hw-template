package hw08;

public class Woman extends Human {

    public Woman(String name, String surname, int yearOfBirth) {
        super(name, surname, yearOfBirth);
    }

    public void makeUp() {
        System.out.println(getName() + " doing makeup");
    }

    @Override
    public void greetPet() {
        System.out.println("Woman greeting pet");
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                '}';
    }
}
