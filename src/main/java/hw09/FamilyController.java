package hw09;

import hw09.Entity.Family;
import hw09.Entity.Human;

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
        System.out.println("Family index number " + i + " deleting!");
        System.out.println("Remaining families:");
        for (Family f : familyService.deleteFamily(i)) {
            System.out.println(f);
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
}
