package hw09.Entity;

import hw09.Pet.Pet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Family {

    private int id;
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet = new HashSet<>();

    public Family() {
    }

    public Family(int id, Human mother, Human father, List<Human> children) {
        this.id=id;
        this.mother = mother;
        this.father = father;
        this.children=children;

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


    public String countFamily() {
        int familySize = children.size() + 2;
        return "Family size is " + familySize;
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

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + children.toString() +
                ", pet=" + pet +
                '}';
    }

}
