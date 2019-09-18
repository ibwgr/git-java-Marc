package Base;

public class Aufg3_20 {
    public static void main(String[] args) {
        for (int i = 1; i < 9; i++) {
            for (int j = i; j < i +8; j++) {
                if (j < 9) {
                    System.out.print(j + "  ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
