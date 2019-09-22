package Base;

import Prog1Tools.IOTools;

public class Aufg4_4 {
    public static void main(String[] args) {

        int n = IOTools.readInt("Wie viele Zahlen willst du sortieren?");
        int count;
        int[] zahlen = new int[n];

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Zahl: ");
            count = IOTools.readInteger();
            zahlen[i -1] = count;
        }

        java.util.Arrays.sort(zahlen);

        for (int zahl : zahlen) {
            System.out.print(zahl + " ");
        }
    }
}
