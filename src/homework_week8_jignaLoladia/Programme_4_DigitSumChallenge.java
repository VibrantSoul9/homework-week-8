package homework_week8_jignaLoladia;
//Write a method with the name sumDigits that has one int parameter called number.
//If the parameter is >= 10 then the method should process the number and return sum of all digits,
//otherwise return -1 to indicate an invalid value.
//The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
//negative numbers, so also return -1 for negative nu
public class Programme_4_DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125)); // Should print 8
        System.out.println(sumDigits(1));  // Should print -1
        System.out.println(sumDigits(52)); // Should print 7
        System.out.println(sumDigits(-123)); // should print -1
    }
    public static int sumDigits(int number) {
        if (number < 10) {
            return -1; // invalid value
        }
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; // get the least significant digit
            sum += digit;
            number /= 10;
            // Discard the least significant digit
        }
        return sum;
        }
    }

