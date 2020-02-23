package hw08;


import java.util.*;


public class Family {

    private Human mother;
    private Human father;
    private List<Human> children = new ArrayList<>();
    private Set<Pet> pet = new HashSet<>();

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
        return (this.mother == family.mother && this.father == family.father);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void finalize() throws Throwable {

        System.out.println("Finalize method called. Deleting!!!");
    }

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
        finalize();

        return getChildren();

    }

    public List<Human> delChild(int del) throws Throwable {

        getChildren().remove(del);

        finalize();

        return getChildren();
    }


    public void countFamily() {
        int familySize = children.size() + 2;
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
                ", children=" + children.toString() +
                ", pet=" + pet +
                '}';
    }

}
