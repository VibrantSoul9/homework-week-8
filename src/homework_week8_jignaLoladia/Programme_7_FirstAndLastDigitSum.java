package homework_week8_jignaLoladia;
//write a method namedsumFirstAndLAstDigit with one parameter of type int called number
public class Programme_7_FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(346));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-6));
    }
    // if the number is negative then the method needs to return -1 to indicate an invalid vlaue
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        // find last digit of parameter number passed in method
        int lastDigit = number % 10;
        while (number >= 10) {
            number /= 10;
        }
        // find the first digit of parameter number passed in method
        int firstDigit = number;
        //add first and last digit of parameter number passed in method
        return firstDigit + lastDigit;
    }
}
