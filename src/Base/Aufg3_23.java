package Base;

import Prog1Tools.IOTools;

public class Aufg3_23 {
    public static void main(String[] args) {
        int a = IOTools.readInteger("Gib mir ein a-Wert: ");
        int b = IOTools.readInteger("Gib mir ein b-Wert: ");
        int c = IOTools.readInteger("Gib mir ein c-Wert: ");
        int d = IOTools.readInteger("Gib mir ein d-Wert: ");
        int bigest = a;

        if (b > bigest) {
            bigest = b;
        }
        if (c > bigest) {
            bigest = c;
        }
        if (d > bigest) {
            bigest = d;
        }

        System.out.println("Die grösste Zahl ist: " + bigest);
    }
}
