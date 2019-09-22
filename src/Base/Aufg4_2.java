package Base;

public class Aufg4_2 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3}, b = {1, 2, 3};
        boolean same = true;

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b [i]) {
                    same = false;
                    break;
                }
            }
        } else {
            same = false;
        }
        System.out.println(same);

    }
}
