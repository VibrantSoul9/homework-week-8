package homework_week8_jignaLoladia;

public class Programme_13_SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int number1, int number2) {
        if ((number1 < 10 || number1 >99) || (number2 < 10 || number2 > 99)) {
            return false;
        }
        int digit1 = number1 % 10;
        int digit2 = number2 % 10;
        int tens1 = number1 / 10;
        int tens2 = number2 / 10;

        return (digit1 == digit2 || digit1 == tens2 || tens1 == digit2 || tens1 == tens2);
    }
}

