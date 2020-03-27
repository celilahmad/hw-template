package hw11;

import hw11.Entity.Family;
import hw11.Entity.Human;
import hw11.Pet.Pet;

public class FamilyController {
    FamilyService familyService = new FamilyService();


    public void getAllFamilies() {
        if (familyService.getAllFamilies().isEmpty()){
            System.out.println("Not any Family in List");
        }
        for (Family f : familyService.getAllFamilies()) {
            System.out.println(f);
        }

    }

    public void displayAllFamilies() {
        if (familyService.displayAllFamilies().isEmpty()){
            System.out.println("Not any Family in List");
        }
        for (Family f : familyService.displayAllFamilies()) {
            System.out.println(f);
        }

    }

    public void getFamilyByIndex(int i) {
        System.out.println(familyService.getFamilyByIndex(i));
    }

    public void deleteFamily(int i) {
        if (familyService.dao.getAllFamilies().stream().anyMatch(p->p.getId()==i)){
            System.out.println("Family index number " + i + " deleting!");
            System.out.println("Remaining families:");
            for (Family f : familyService.deleteFamily(i)) {
                System.out.println(f);
            }
        }else{
            System.out.println("Not such Family id");
        }

    }

    public void deleteFamily(Family fam) {
        System.out.println("Family deleting\nRemaining families:\n");
        for (Family f : familyService.deleteFamily(fam)) {
            System.out.println(f);
        }
    }

    public void save(Family fam){
        System.out.println("Saving");
        System.out.println(familyService.saveFamily(fam));
    }

    public void getFamiliesBiggerThan(int count) {
        for (Family f : familyService.getFamiliesBiggerThan(count)) {
            System.out.println(f);
        }

    }

    public void getFamiliesLessThan(int count) {
        for (Family f : familyService.getFamiliesLessThan(count)) {
            System.out.println(f);
        }
    }

    public void countFamiliesWithMember(){
        for (Integer i : familyService.countFamiliesWithMember()){
            System.out.println(i);
        }
    }

    public void createNewFamily(Human mother, Human father) {
        Family fam = new Family(mother,father);
        familyService.saveFamily(fam);
        System.out.println(fam);

    }

    public void bornChild(Family newFamily1, String sex) {

        System.out.println("New " + sex + " added to family");
        System.out.println(familyService.addChildToFamily(newFamily1, sex));
    }

    public void adoptChild(Family newFamily1, Human child1) {
        System.out.println(child1 + " adobted to \n" + newFamily1);
        System.out.println("Renewed \n" + familyService.adoptChild(newFamily1, child1));
    }

    public void deleteAllChildrenOlderThan(int i) {
        System.out.println("Deleting children older than " + i);
        for (Family f : familyService.deleteChildrenOlderThan(i)) {
            System.out.println(f);
        }
    }

    public void count() {
        System.out.println("There are " + familyService.count()+ " families in the List");
    }

    public void getPets(int i) {
        for (Pet p : familyService.getPets(i)){
            System.out.println(p);
        }

    }

    public void addPets(int i, Pet pet) {
        System.out.println("New pet added to family");
        System.out.println(familyService.addPets(i, pet));
    }
}
