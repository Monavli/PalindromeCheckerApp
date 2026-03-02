import java.util.Scanner;

public class PalindromeCheckerApp {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String input = scanner.nextLine();

            String reversed = "";

            // Iterate from last character to first
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }

            boolean isPalindrome = input.equalsIgnoreCase(reversed);

            System.out.println("Reversed text: " + reversed);
            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();
        }
    }
}