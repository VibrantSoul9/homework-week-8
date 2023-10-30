package homework_week8_jignaLoladia;

public class Programme_14_DiamondPattern {
    public static void main(String[] args) {
        int n = 13;
        int i = 1;
        while (i<= n / 2 + 1) {
            int j = 1;
            while (j <= n /2 + 1 -i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j<= 2 * i -1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = n / 2;
        while (i>= 1) {
            int j = 1;
            while (j <= n / 2 + 1 - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}
