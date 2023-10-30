package homework_week8_jignaLoladia;
//write a method called isPallindrome with one int parameter called number
//The method need to return a boolean
//it should return true if the number is palindrome number otherwise it should return false
//example input/output
//ispalindrome(-1221)
public class Programme_5_PallindromeNumbers {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(99099));
        System.out.println(isPalindrome(12345));
    }
    // write a method called isPalindrome with one int parameter called number//
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        //find reverse of the given number.
        int reverse = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return originalNumber == reverse;
    }
}
