package homework_week8_jignaLoladia;

import java.util.Scanner;
// write a program to input a number to check if its armstron number or not
// Armstrong number is the number where digits of numbers cube and sum is same
//exam. 370 = 3*3*3=27, 7*7*7=343, 343 add 27= 3
public class Programme_10_ArmstrongNumber {
    public static void main(String[] args) {
        int n,arm = 0,rem,c;
        System.out.println("Enter any number:");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        c = n;
        r.close();
        while(n > 0) {
            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }
        if (c == arm) {
            System.out.println("Armstrong Numebr");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}


