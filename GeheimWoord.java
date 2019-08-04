package VoorbereidingHerexamen.h3.Lingo2;

import java.util.Random;

public class GeheimWoord {
    String geheimWoord;
    String [] geheimewoorden = {"pizza", "geluk", "poker", "fiets", "toren", "schip"};

    public String randomWoord(){
        Random r = new Random();
        int randomNummer = r.nextInt(geheimewoorden.length);
        geheimWoord = geheimewoorden[randomNummer];
        //System.out.println(geheimWoord);
        return geheimWoord;
    }

}
