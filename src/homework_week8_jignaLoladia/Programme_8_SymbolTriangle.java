package homework_week8_jignaLoladia;

public class Programme_8_SymbolTriangle {
    // Display right angle triangle of @ using nexted for loops
    public static void main(String[] args) {
        // declare no of rows
        int rows = 5;
        // increase by 1 each row
        for (int i =1; i<=rows; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
