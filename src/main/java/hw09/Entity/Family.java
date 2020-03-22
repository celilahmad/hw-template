package hw09.Entity;

import hw09.Pet.Pet;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Family {

    private int id;
    private Human mother;
    private Human father;
    private List<Human> children;
    private List<Pet> pet;
    private Pet pets;
    // private Human child;


    public Family() {

    }
/*
    public Family(Human mother, Human father, Human human) {
        this.mother=mother;
        this.father=father;
        this.child=human;
    }*/


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
/*

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Family family = (Family) obj;
        return (this.mother == family.mother && this.father == family.father);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void finalize(){
        System.out.println("Finalize method called. Deleting!!!");
    }
*/

    int x = 0;


    public List<Human> addChild(Human h) {
        for (int i = x; i < x + 1; i++) {
            children.add(x, h);
        }
        x++;
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

/*    public Pet getPets() {
        return pets;
    }

    public Family setPets(Pet pets) {
        this.pet.add(pets);
        return Family.this;
    }*/

    /*public Human getChild() {
        return child;
    }

    public void setChild(Human child) {
        this.child = child;
    }*/

    public String haveChildren() {
        if (children != null) {
            return ", children=" + children.toString();
        } else {
            return ", No child";
        }
    }
    public String havePets() {
        if (pet != null) {
            return ", pet=" + pet.toString();
        } else {
            return ", No Pet";
        }
    }


    @Override
    public String toString() {
        return "Family{ID:"+ id +
                " mother=" + mother +
                ", father=" + father +
                haveChildren() +
                " pets=" + pet +
                '}';
    }

}
