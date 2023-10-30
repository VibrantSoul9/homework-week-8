package homework_week8_jignaLoladia;

import java.util.Scanner;

public class Programme_3_FindVowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphbet: ");
        // convert to lowercase for easy comparison
        String input = scanner.nextLine().toLowerCase();
        if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
            char ch = input.charAt(0);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Input letter is Vowel");
            } else {
                System.out.println("Input letter is Consonant");
            }
        } else {
            System.out.println("Error: Not a single alphabet character.");
        }
        scanner.close();
    }

}
