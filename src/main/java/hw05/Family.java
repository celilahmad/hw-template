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

    public void addChild(Human human){
        for (int i = 0; i<children.length; i++){
            children[i]=human;
        }

    }

    public String deleteChild(int[] human, String deleteChild){
        int[] newArray = new int[children.length-1];

        for (int items : human) {
            if (!deleteChild.equals(items)){
                System.arraycopy(human,1,newArray,0,items);
            }
        }
        return Arrays.toString(newArray);
    }

    public int countFamily(){
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
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}
