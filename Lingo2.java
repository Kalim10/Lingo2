package VoorbereidingHerexamen.h3.Lingo2;

import java.util.Scanner;

public class Lingo2 {
    String poging = " ";
    String antwoord;
    Scanner input = new Scanner(System.in);
    GeheimWoord woord = new GeheimWoord();
    //woord.randomWoord();
    String antwoord1 = woord.randomWoord();


    public void spelen() {
        System.out.println("Lingo");

        do {
            System.out.println();
            System.out.println(antwoord1.charAt(0));
            poging = input.nextLine();
            // System.out.println(poging);
            //System.out.println();
            for (int x = 0; x < antwoord1.length(); x++) {
                int checken = checken(poging.charAt(x));
                //System.out.print(checken);
            }

        }
        while (!poging.equals(antwoord));
    }

    private int checken(char letter) {
        //String antwoord = woord.randomWoord();
        for (int x = 0; x < antwoord1.length(); x++) {
            if (letter == antwoord1.charAt(x)) {
                System.out.print("1");
                return 1;
                
            }
        }
        System.out.print("0");
        return 0;
    }
}