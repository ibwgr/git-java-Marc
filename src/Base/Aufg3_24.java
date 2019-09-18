package Base;

import Prog1Tools.IOTools;

public class Aufg3_24 {
    public static void main(String[] args) {
        String sterne = "";
        int zeilen = IOTools.readInteger("Wie viele Zeilen wünscht du dir?");

        for (int i = 0; i < zeilen; i++) {
            sterne += "*";
            System.out.println(sterne);
        }
    }
}
