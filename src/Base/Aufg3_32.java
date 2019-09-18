package Base;

import Prog1Tools.IOTools;

public class Aufg3_32 {
    public static void main(String[] args) {

        int hoehe = IOTools.readInteger("Jo, sag mal: wie hoch soll der Baum werden?");
        System.out.println("geht klar!");

        for (int j = 0; j <= hoehe; j++) {
            for (int i = 0; i < hoehe - j; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < (j * 2) - 1; i ++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < hoehe - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("I");
    }
}
