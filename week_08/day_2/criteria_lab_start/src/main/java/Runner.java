import db.DBHelper;
import models.Child;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Child liesl = new Child("Liesl", 16, "Soprano");
        Child friedrich = new Child("Friedrich", 14, "Tenor");
        Child louisa = new Child("Louisa", 13, "Contralto");
        Child kurt = new Child("Kurt", 11, "Tenor");
        Child brigitta = new Child("Brigitta", 10, "Soprano");
        Child marta = new Child("Marta", 7, "Mezzo-Soprano");
        Child gretl = new Child("Gretl", 5, "Soprano");

        DBHelper.save(liesl);
        DBHelper.save(friedrich);
        DBHelper.save(louisa);
        DBHelper.save(kurt);
        DBHelper.save(brigitta);
        DBHelper.save(marta);
        DBHelper.save(gretl);

        List<Child> listOfAllChildren = DBHelper.getAll(Child.class);

        Child foundNamedChild = DBHelper.getChildByName(Child.class, kurt.getName());

        List<Child> listOfAllChirdrenByAge = DBHelper.getAllOrderedByAge(Child.class);

        List<Child> listOfAllSopranoChildren = DBHelper.getAllSopranoChildren(Child.class, liesl.getRange());

        friedrich.setAge(15);
        friedrich.setRange("Bass");
        DBHelper.save(friedrich);

        Child checkFriedrich = DBHelper.getChildByName(Child.class, friedrich.getName());

        List<Child> childrenUnderTen = DBHelper.getAllChildrenUnderTen(Child.class);

        Child oldestChild = DBHelper.getOldestChild(Child.class);

        Child youngestChild = DBHelper.getYoungestChild(Child.class);

        Double averageAge = DBHelper.getAverageAge(Child.class);

        Long totalAge = DBHelper.getTotalAge(Child.class);

    }
}
