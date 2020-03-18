package hw09;

import hw09.Entity.Family;

public class FamilyController {
    FamilyService familyService;

    public void getAllFamilies(){
        for (Family f: familyService.getAllFamilies()){
            System.out.println(f);
        }

    }

    public void getFamilyByIndex(int i) {
        System.out.println(familyService.getFamilyByIndex(i));
    }

    public void deleteFamily(int i) {
        System.out.println("Family index number " + i + " deleting!");
        familyService.deleteFamily(i);
    }

    public void deleteFamily(Family fam) {
        familyService.deleteFamily(fam);
    }

    public void save(Family fam) {
        familyService.saveFamily(fam);
    }
}
