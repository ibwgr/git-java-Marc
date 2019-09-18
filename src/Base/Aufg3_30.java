package Base;

import Prog1Tools.IOTools;

public class Aufg3_30 {
    public static void main(String[] args) {

        System.out.println("Willkommen beim Zahlenraten.");
        System.out.println("Ich denke mir eine Zahl zwischen 1 und 100 aus. Rate mal welche das ist!");

        int geheimeZahl = (int) (99 * Math.random() + 1);
        int gerateneZahl;
        int versuch = 1;

        do {
            gerateneZahl = IOTools.readInteger(versuch + ". Versuch: ");

            if (gerateneZahl < geheimeZahl) {
                System.out.println("Meine Zahl ist grösser!");
                versuch++;
            }
            if (gerateneZahl > geheimeZahl) {
                System.out.println("Meine Zahl ist kleiner!");
                versuch++;
            }
        }
        while (geheimeZahl != gerateneZahl);

        System.out.println("Yeah! Du hast meine Zahl beim " + versuch + ". Versuch erraten! Ganz grosse Klasse!");
    }
}
