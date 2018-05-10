import db.DBHelper;
import models.Guitar;
import models.Piano;

public class Runner {

    public static void main(String[] args) {

        Guitar guitar1 = new Guitar("Fender", "black", 6, 150, 200);
        DBHelper.save(guitar1);

        Guitar guitar2 = new Guitar("Rickenback", "white", 4, 125, 150);
        DBHelper.save(guitar2);

        Piano piano1 = new Piano("Steinway", "black", 2500, 3500);
        DBHelper.save(piano1);

    }

}
