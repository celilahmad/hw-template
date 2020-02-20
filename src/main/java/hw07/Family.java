package hw07;


import java.util.Arrays;

public class Family {

    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family() {
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;

    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    int k = 0;

    public Human[] addChild(Human child) {

        Human[] childe = new Human[k];
        for (int i = k; i < childe.length; i++) {
            childe[i] = child;

        }
        k++;
        this.children = new Human[k];

        this.children = childe.clone();
        return children;
    }

    public void deleteChild(Human human) {
        Human[] newArray = new Human[children.length - 1];
        int k = 0;

        for (int i = 0; i < children.length - 1; i++) {
            if (children[i] == human) {
                continue;
            } else {
                newArray[i] = children[i];
                k++;
            }
        }
        //children=new Human[k];
        children = newArray.clone();

        System.out.println(Arrays.toString(children));
    }

    public int countFamily() {
        return children.length + 2;
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

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Family{" +
                "children=" + Arrays.toString(children) +
                '}';
    }

    /*@Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }*/
}
