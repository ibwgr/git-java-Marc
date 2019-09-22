package Base;

import Prog1Tools.IOTools;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class Aufg3_31 {
    public static void main(String[] args) {

        short d;
        long b = 0;
        int m = 1;

        d = IOTools.readShort(" Dezimalzahl: ");
        while (d > 100 | d < 0) {
            System.out.println(d);
            d = IOTools.readShort("Let's try this again: ");
        }

        while(d > 0) {
            b += d % 2 * m;
            d /= 2;
            m *= 10;
        }

        System.out.println("als Binaerzahl: " + b);

    }
}
