package VoorbereidingHerexamen.h3.Lingo2;

import java.util.Random;

public class GeheimWoord {
    static String geheimWoord;
    static String [] geheimewoorden = {"pizza", "geluk", "poker", "fiets", "toren", "schip"};

    static String randomWoord(){
        Random r = new Random();
        int randomNummer = r.nextInt(geheimewoorden.length);
        geheimWoord = geheimewoorden[randomNummer];
        //System.out.println(geheimWoord);
        return geheimWoord;
    }

}
