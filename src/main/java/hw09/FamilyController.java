package hw09;

import hw09.Entity.Family;
import hw09.Entity.Human;
import hw09.Pet.Fish;
import hw09.Pet.Pet;

public class FamilyController {
    FamilyService familyService = new FamilyService();


    public void getAllFamilies() {
        for (Family f : familyService.getAllFamilies()) {
            System.out.println(f);
        }

    }

    public void getFamilies() {
        getAllFamilies();
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

    public void save(Family fam) {
        System.out.println("Saving");
        for (Family f : familyService.saveFamily(fam)) {
            System.out.println(f);
        }


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

    public void createNewFamily(Human mother, Human father) {
        Family fam = new Family(mother, father);
        for (Family f : familyService.saveFamily(fam)) {
            System.out.println(f);
        }
    }


    public void bornChild(Family newFamily1, String sex) {
        System.out.println("New " + sex + " added to family");
        System.out.println(familyService.addChildToFamily(newFamily1, sex));
    }

    public void adoptChild(Family newFamily1, Family newFamily, Human child1) {
        System.out.println(child1 + " aborted from " + newFamily + " to " + newFamily1);
        System.out.println(newFamily1 + " renewed");
        System.out.println(familyService.adoptChild(newFamily1,newFamily, child1));
    }

    public void deleteAllChildrenOlderThan(int i) {
        for (Family f : familyService.deleteChildrenOlderThan(i)) {
            System.out.println(f);
        }
    }

    public void count() {
        System.out.println(familyService.count());
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
