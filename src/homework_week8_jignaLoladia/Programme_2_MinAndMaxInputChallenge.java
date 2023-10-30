package homework_week8_jignaLoladia;

import java.util.Scanner;

public class Programme_2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstNumber = true;
        while (true) {
            //before user enters the number print message enter number://
            System.out.print("Enter the number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (firstNumber) {
                    min = number;
                    max = number;
                  //if user enters invalid number
                  //break out the loop and print the minimum and maximum number.
                firstNumber = false;
                } else {
                    min = Math.min(min, number);
                    max = Math.max(max, number);
                }
            } else {
                    break;
                }
                scanner.nextLine(); // go to next line charactor
            }
            if (firstNumber) {
                    System.out.println("no valid numbers entered.");
            } else {
            System.out.println("Minimum number entered: "+ min);
            System.out.println("Maximum number entered: " + max);
            }
        scanner.close();
        }
    }

