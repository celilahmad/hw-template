package hw05;


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
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass())
            return false;
        Family family = (Family) obj;
        return (this.mother.equals(family.mother) && this.father.equals(family.father));
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }



    public Human[] addChild(Human h) {
        int x = 1;
        Human[] chil;
        chil = new Human[x];
        chil[x - 1] = h;
        if (x != 1) {
            for (int i = 0; i < x - 1; i++) {
                chil[i] = children[i];
            }
        }
        x++;
        setChildren(chil);
        return children;
    }

    public Human[] deleteChild(Human del) {
        Human[] newArray = new Human[children.length - 1];

        for (int i = 0, j = 0; i < children.length; i++) {
            if (children[i] != del) {
                newArray[j++] = children[i];

            }
        }
        setChildren(newArray);
        return children;
        //System.out.println(Arrays.toString(children));
    }


    public void countFamily() {
        int familySize = children.length + 2;
        System.out.println("Family size is " + familySize);
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

  /*  @Override
    public String toString() {
        return "Family{" +
                "children=" + Arrays.toString(children) +
                '}';
    }*/

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
