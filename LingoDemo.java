package VoorbereidingHerexamen.h3.Lingo2;

import java.util.Scanner;

public class LingoDemo {
    public static void main(String[] args) {
        Lingo2 lingo = new Lingo2();

        while(lingo.spelen()){
            lingo = new Lingo2();
        }
    }
}

