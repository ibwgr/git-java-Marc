package Base;

import Prog1Tools.IOTools;

public class Aufg3_19 {
    public static void main(String[] args) {
        int n = IOTools.readInteger("Gib mir ein Wert: ");
        double i = 3;
        double result;

        while (i < 2 * n) {
            result = 1 / (2 * i + 1);
            System.out.println(result);
            i++;
        }

        for (double j = 3; j < 2 * n; j++) {
            result = 1 / (2 * j + 1);
            System.out.println(result);
        }

        i = 3;

        do {
            result = 1 / (2 * i + 1);
            System.out.println(result);
            i++;
        } while (i < 2 * n);
    }
}
