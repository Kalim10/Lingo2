package VoorbereidingHerexamen.h3.Lingo2;

import java.util.Scanner;

public class Lingo2 {
    private String poging = " ";
    private Scanner input = new Scanner(System.in);
    private String antwoord = GeheimWoord.randomWoord();
    private int counter = 0;


    public boolean spelen() {
        System.out.println("Lingo");
        System.out.println("1 = letter juist en positie juist");
        System.out.println("3 = letter juist maar positie onjuist");
        System.out.println("0 = letter onjuist en positie onjuist");
        System.out.println("eerste letter staat al voor je klaar:");
        do {
            System.out.println();
            System.out.println(antwoord.charAt(0));
            poging = input.nextLine();
            for (
                    int x = 0; x < antwoord.length(); x++)
            {
                    int checken = checken(poging, x);
                    System.out.print(checken);
            }

            counter++;
        }
        while (
                counter < 5 &&
                        !poging.equals(antwoord)
        );

        if (counter == 5) {
            System.out.println("\nHelaas! ");
            return false;
        } else {
            System.out.println("\nGefeliciteerd!");
            return true;
        }
    }

    private int checken(String input, Integer antwoordIndex) {
        final char gecheckteLetter = antwoord.charAt(antwoordIndex);

        if (
                input.length() > antwoordIndex &&
                        input.charAt(antwoordIndex) == antwoord.charAt(antwoordIndex)
        ) {
            return 1;
        }

        if (input.contains(String.valueOf(gecheckteLetter))) {
            return 3;
        }

        return 0;
    }
}
