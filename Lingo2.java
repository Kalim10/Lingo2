package VoorbereidingHerexamen.h3.Lingo2;

import java.util.Scanner;

public class Lingo2 {
    String poging;
    String antwoord;
    Scanner input = new Scanner(System.in);
    GeheimWoord woord = new GeheimWoord();


    public void spelen() {
        System.out.println("Lingo");
        woord.randomWoord();
        String antwoord = woord.randomWoord();
        do {
            System.out.println(antwoord.charAt(0));
            poging = input.nextLine();
            System.out.println(poging);
            checken(poging.charAt(1));


        }
        while (!poging.equals(antwoord));
    }

    int checken(char letter) {
        for (int x = 1; x < antwoord.length(); x++) {
            if (letter == poging.charAt(x)) {
                System.out.print("(" + poging.charAt(x) + ")");
                return 2;
            }
        }
    return 0;
    }
}