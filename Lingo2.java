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


            for (int i = 0; i < poging.length(); i++) {
                try {
                    int output = getOutput(poging.substring(i, i + 1), i);
                    System.out.print(output);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("\nsorry te veel letters!");
                    break;
                }

            }

            counter++;
        }
        while (
                counter < 5 &&
                        !poging.equals(antwoord)
        );

        if (counter == 5) {
            System.out.println("\nHelaas! te veel pogingen ");
            return false;
        } else {
            System.out.println("\nGefeliciteerd!");
            return true;
        }
    }

    private int getOutput(String inputSubstring, int inputIndex) {
        if (inputIndex > antwoord.length()) {
            throw new IndexOutOfBoundsException("Te veel letters");
        }
        String antwoordLetter = "";
        if (inputIndex < antwoord.length()) {
            antwoordLetter = antwoord.substring(inputIndex, inputIndex + 1);
        }

        if (antwoordLetter.equals(inputSubstring)) {
            return 1;
        }

        if (antwoord.contains(inputSubstring)) {
            return 3;
        }

        return 0;
    }
}