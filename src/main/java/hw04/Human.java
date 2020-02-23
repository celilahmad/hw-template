package hw04;

public class Human {

    private String name;
    private String surname;
    private int yearOfBirth;
    private int iq = (int)(Math.random()*100+1);
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule = new String[7][1];



    public Human(){}

    public Human(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
    }

    public Human(String name, String surname, int yearOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int yearOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public String isFeed(boolean feedTime){
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


    }


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

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + yearOfBirth +
                ", iq=" + iq +
                ", mother=" + mother.getName() + " " + mother.getSurname() +
                ", father=" + father.getName() + " " +father.getSurname() + "," + "\n" +
                "pet=" + pet +
                '}';
    }
}
