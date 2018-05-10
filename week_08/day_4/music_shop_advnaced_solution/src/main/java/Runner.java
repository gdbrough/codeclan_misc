import db.DBHelper;
import models.Guitar;
import models.MusicBook;
import models.MusicStand;
import models.Piano;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Guitar guitar1 = new Guitar("Fender", "black", 6, 150, 200);
        DBHelper.saveOrUpdate(guitar1);

        Guitar guitar2 = new Guitar("Rickenbacker", "white", 4, 125, 150);
        DBHelper.saveOrUpdate(guitar2);

        Piano piano1 = new Piano("Steinway", "black", 2500, 3500);
        DBHelper.saveOrUpdate(piano1);

        MusicBook musicBook1 = new MusicBook("Nice Tunes", 10, 12);
        DBHelper.saveOrUpdate(musicBook1);

        MusicStand musicStand1 = new MusicStand("black", 20, 25);
        DBHelper.saveOrUpdate(musicStand1);

        List foundGuitars = DBHelper.getAll(Guitar.class);

        Guitar foundGuitar = DBHelper.find(Guitar.class, guitar2.getId());
        Piano foundPiano = DBHelper.find(Piano.class, piano1.getId());
        MusicBook foundBook = DBHelper.find(MusicBook.class, musicBook1.getId());
        MusicStand foundStand = DBHelper.find(MusicStand.class, musicStand1.getId());

    }

}