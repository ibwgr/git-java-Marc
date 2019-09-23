package Base;

import Prog1Tools.IOTools;

public class Aufg4_3 {
    public static void main(String[] args) {

        boolean fertig;
        int auswahl, jahr, monat, tag, stunde;
        String[][][][] Termine = new String [10][12][][];

        for (jahr = 0; jahr < Termine.length; jahr++) {
            for (monat = 0; monat < Termine[jahr].length; monat++) {
                switch (monat) {
                    case 0: Termine[jahr][monat] = new String [31][24];
                    case 1: Termine[jahr][monat] = new String [28][24];
                    case 2: Termine[jahr][monat] = new String [31][24];
                    case 3: Termine[jahr][monat] = new String [30][24];
                    case 4: Termine[jahr][monat] = new String [31][24];
                    case 5: Termine[jahr][monat] = new String [30][24];
                    case 6: Termine[jahr][monat] = new String [31][24];
                    case 7: Termine[jahr][monat] = new String [31][24];
                    case 8: Termine[jahr][monat] = new String [30][24];
                    case 9: Termine[jahr][monat] = new String [31][24];
                    case 10: Termine[jahr][monat] = new String [30][24];
                    case 11: Termine[jahr][monat] = new String [31][24];
                }
            }
        }

        Termine[0][1] = new String [29][24];
        Termine[4][1] = new String [29][24];
        Termine[8][1] = new String [29][24];

        for (jahr = 0; jahr < Termine.length; jahr++) {
            for (monat = 0; monat < Termine[jahr].length; monat++) {
                for (tag = 0; tag < Termine[jahr][monat].length; tag++) {
                    for (stunde = 0; stunde < Termine[jahr][monat][tag].length; stunde++)
                        Termine[jahr][monat][tag][stunde] = "";
                }
            }
        }

        fertig = false;

        while (!fertig) {
            System.out.println();
            System.out.println("1 = neuer Eintrag");
            System.out.println("2 = Termine ausgeben");
            System.out.println("3 = Programm beenden");
            auswahl = IOTools.readInteger("Ihre Auswahl: ");

            switch (auswahl) {
                case 1:
                    jahr = IOTools.readInt("Welches Jahr (2020 - 2029): ");
                    jahr = jahr - 2020;
                    if (jahr < 0 || jahr > 9) {
                        System.out.println("Fehler: Unzulaessige Eingabe fuer Jahr!");
                        break;
                    }

                    monat = IOTools.readInteger("Welchen Monat (1 - 12): ");
                    monat = monat - 1;
                    if (monat < 0 || monat > 11) {
                        System.out.println("Fehler: Unzulaessige Eingabe für Monat!");
                        break;
                    }

                    tag = IOTools.readInteger("Welchen Tag (1 - " + Termine[jahr][monat].length + "): ");
                    tag = tag - 1;
                    if (tag < 0 || tag > Termine[jahr][monat].length) {
                        System.out.println("Fehler: Unzulaessige Eingabe für Tag!");
                        break;
                    }

                    stunde = IOTools.readInteger("Welche Stunde (0 - 23): ");
                    if (stunde < 0 || stunde > 24) {
                        System.out.println("Fehler: Unzulaessige Eingabe für Stunde!");
                        break;
                    }

                    Termine[jahr][monat][tag][stunde] = IOTools.readLine("Eintrag: ");
                break;

                case 2:
                    jahr = IOTools.readInt("Welches Jahr (2020 - 2029): ");
                    jahr = jahr - 2020;
                    if (jahr < 0 || jahr > 9) {
                        System.out.println("Fehler: Unzulaessige Eingabe fuer Jahr!");
                        break;
                    }

                    monat = IOTools.readInteger("Welchen Monat (1 - 12): ");
                    monat = monat - 1;
                    if (monat < 0 || monat > 11) {
                        System.out.println("Fehler: Unzulaessige Eingabe für Monat!");
                        break;
                    }

                    tag = IOTools.readInteger("Welchen Tag (1 - " + Termine[jahr][monat].length + "): ");
                    tag = tag - 1;
                    if (tag < 0 || tag > Termine[jahr][monat].length) {
                        System.out.println("Fehler: Unzulaessige Eingabe für Tag!");
                        break;
                    }

                    System.out.println("Termine am " + tag + "." + monat + "." + jahr + ": ");
                    for (stunde = 0; stunde < Termine[jahr][monat][tag].length; stunde++) {
                        System.out.println(stunde + ": " + Termine[jahr][monat][tag][stunde]);
                    }
                break;

                case 3:
                    fertig = true;
                    System.out.println("adee merci tgau....");

                default:
                    System.out.println("Fehler: Unzulaessige Eingabe!");
            }
        }
    }
}
