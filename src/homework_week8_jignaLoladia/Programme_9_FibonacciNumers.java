package homework_week8_jignaLoladia;

public class Programme_9_FibonacciNumers {
    public static void main(String[] args) {
        //Generate the first 8 numbers of fibonacci series
        int n= 8;
        //first two numbers in fibonacchi is 1 and 1 as you add 0 + 1 for first number and 1 +1 for second number
        int first = 1, second = 1;
        System.out.print(first + " " + second + " ");
        // for 3rd number in fibonacci you add first and second number
        // for 4th number in fibonacci you add second and third number and so on
        // int will start form 3 upto 8 as total number to print is 8
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
