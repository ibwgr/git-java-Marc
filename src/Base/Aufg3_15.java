package Base;

import Prog1Tools.IOTools;

public class Aufg3_15 {

    public static void main(String[] args) {
        int eingabe;
        int secProMinute = 60;
        int secProStunde = secProMinute*60;
        int secProTag = secProStunde*24;
        int secProJahr = secProTag*365;

        int secunden, minuten, stunden, tage, jahre;

        System.out.println("Gebe eine Anzahl Secunden an: ");
        eingabe = IOTools.readInteger();

        jahre = eingabe / secProJahr;
        eingabe = eingabe % secProJahr;
        tage = eingabe / secProTag;
        eingabe = eingabe % secProTag;
        stunden = eingabe / secProStunde;
        eingabe = eingabe % secProStunde;
        minuten = eingabe / secProMinute;
        eingabe = eingabe % secProMinute;
        secunden = eingabe % secProMinute;

        System.out.println("Dies entspricht: " + jahre + " Jahren, " + tage + " Tage, " + stunden + " Stunden,  " + minuten + " Minuten und " + secunden + "Secunden");

    }
}
