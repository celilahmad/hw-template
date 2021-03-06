package hw11.Entity;

import hw11.Pet.Pet;

import java.util.List;


public class Family {

    private int id;
    private Human mother;
    private Human father;
    private List<Human> children;
    private List<Pet> pet;
    private Pet pets;


    public Family() {

    }

    public Family(int id, Human mother, Human father) {
        this.id = id;
        this.mother = mother;
        this.father = father;
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Family(int id, Human mother, Human father, List<Human> children) {
        this.id = id;
        this.mother = mother;
        this.father = father;
        this.children = children;

    }

    public Family(int id, Human mother, Human father, List<Human> children, List<Pet> pets) {
        this.id = id;
        this.mother = mother;
        this.father = father;
        this.children = children;
        this.pet=pets;

    }


    public List<Human> addChild(Human h) {

        children.add(h);
        return children;
    }


    public List<Human> deleteChild(Human del) throws Throwable {
        getChildren().remove(del);
        return getChildren();

    }

    public List<Human> deleteChild(int del) throws Throwable {
        getChildren().remove(del);
        return getChildren();
    }


    public int countFamily() {
        int familySize = children.size() + 2;
        return familySize;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
            this.children = children;

    }

    public List<Pet> getPet() {
        return this.pet;
    }

    public void setPet(List<Pet> pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{ID:"+ id +
                " mother=" + mother +
                ", father=" + father +
                ", children=" + children +
                " pets=" + pet +
                '}';
    }

}
