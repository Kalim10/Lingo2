package VoorbereidingHerexamen.h3.Lingo2;

import java.util.Scanner;

public class Lingo2 {
    String poging = " ";
    String antwoord;
    Scanner input = new Scanner(System.in);
    GeheimWoord woord = new GeheimWoord();


    public void spelen() {
        System.out.println("Lingo");
        woord.randomWoord();
        String antwoord = woord.randomWoord();
        do {
            System.out.println();
            System.out.println(antwoord.charAt(0));
            poging = input.nextLine();
            // System.out.println(poging);
            //System.out.println();
            for(int x=0; x<antwoord.length();x++){
                int checken = checken(poging.charAt(x));
                //System.out.print(checken);
            }

        }
        while (!poging.equals(antwoord));
    }

    int checken(char letter) {
        String antwoord = woord.randomWoord();
        for (int x = 0; x < antwoord.length(); x++) {
            if (letter == antwoord.charAt(x)) {
                System.out.print("1");
                return 1;
            }
        }
        System.out.print("0");
        return 0;
    }
}