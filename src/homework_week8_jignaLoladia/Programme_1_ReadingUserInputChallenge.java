package homework_week8_jignaLoladia;

import java.util.Scanner;

public class Programme_1_ReadingUserInputChallenge {
    // use scanner so user can enter the numbers
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        //Continue reading until you have read 10 numbers//
        while (count < 10) {
            //Before the user enters each number print the message Enter number#1.where x represents the count i.e. 1,2,3
            System.out.print("Enter number #" + (count + 1) + ": ");
            //-Use the nextInt() method to get the number and add it to the sum.
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                //-If hasNextInt() returns false, print the message Invalid Number.
                System.out.println("Invalid Number");
            }
            // use the newline character
            scanner.nextLine();
        }
        System.out.println("Sum of the 10 valid numbers is: " + sum);
        scanner.close();
    }
}
