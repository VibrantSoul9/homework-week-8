package homework_week8_jignaLoladia;
// write a method getEvenDigitSum with one parameter of type int called number
// the method should return the sum of the even digits with the number
public class Programme_11_EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(24681357));
        System.out.println(getEvenDigitSum(-12345));
        System.out.println(getEvenDigitSum(0));
    }
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int evenDigitSum = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenDigitSum += digit;
            }
            number /= 10;
        }
        return evenDigitSum;
    }
 }
