package Base;

import Prog1Tools.IOTools;

public class Aufg3_33 {
    public static void main(String[] args) {

        System.out.println("Gib mir zwei Zahlen und ich prüfe ob diese befreundet sind. Also los:");
        int a = IOTools.readInteger("Gib mir ne Ganzzahl A: ");
        int b = IOTools.readInteger("Gib mir ne Ganzzahl B: ");

        int summeA = 0, summeB = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                summeA += i;
            }
            if (b % i == 0) {
                summeB += i;
            }
        }
        if (a == summeB && b == summeA) {
            System.out.println("Youh krass, " + a + " und " + b + " sind knüppeldick miteinander!");
        } else {
            System.out.println("Nope, die beiden Zahlen " + a + " und " + b + " werden nicht warm miteinander!.");
        }



    }
}
