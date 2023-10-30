package homework_week8_jignaLoladia;

public class Programme_6_NumberTriangle {
    public static void main(String[] args) {
        //declare how many rows in triangle
        int numRows = 10;
        // increase the number with each row
        //as we declare total rows 10 it will only reach upto 10
        for (int i = 1; i<= numRows; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
