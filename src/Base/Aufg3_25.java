package Base;

import Prog1Tools.IOTools;

public class Aufg3_25 {
    public static void main(String[] args) {

        int z, quersumme = 0;

        do {
            z = IOTools.readInteger(" Gib mir eine Zahl zwischen 1 und 9'999: ");
        } while (z < 0 && z > 9999);

        System.out.print(" Die Quersumme ergibt sich zu: ");

        while (z > 0) {
            int ausgabe = z % 10;
            quersumme += ausgabe;
            z /= 10;
            if (z == 0) {
                System.out.print(ausgabe + " = ");
            } else {
                System.out.print(ausgabe + " + ");
            }
        }
        System.out.println(quersumme);
    }
}
