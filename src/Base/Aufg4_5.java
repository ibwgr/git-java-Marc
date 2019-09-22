package Base;

import Prog1Tools.IOTools;

public class Aufg4_5 {
    public static void main(String[] args) {

        int n = IOTools.readInt("Wie gross soll das magische Quadrat werden (zw. 2 und 10): ");
        while (n < 2 | n > 10) {
            n = IOTools.readInteger("Falsche Eingabe, bitte nochmals: ");
        }

        int[][] quadrat = new int[n][n];
        int zeile = n / 2;
        int spalte = (n / 2) + 1;

        for (int i = 1 ; i < (n*n); i++) {
            quadrat[zeile][spalte] = i;
            spalte++;
            zeile--;

            if (zeile < 0) {
                zeile = n -1;
            }
            if (spalte == n) {
                spalte = 0;
            }
            if (quadrat[zeile][spalte] != 0) {
                zeile++;
                spalte++;

                if(zeile == n) {
                    zeile = 0;
                }
                if (spalte == n) {
                    spalte =0;
                }
            }
        }
        for (int i = 0; i < quadrat.length; i++) {
            for (int j = 0; j < quadrat[i].length; j++) {
                if (quadrat[i][j] < 10) {
                    System.out.print(" " + quadrat[i][j] + " ");
                } else {
                    System.out.print(quadrat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
