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
                if(poging.charAt(x) == antwoord.charAt(x)){
                    System.out.print("1");
                    if(poging.charAt(x) == antwoord.indexOf(x)){
                        System.out.print("3");
                    }
                }
            }


        }
        while (!poging.equals(antwoord));
    }

}