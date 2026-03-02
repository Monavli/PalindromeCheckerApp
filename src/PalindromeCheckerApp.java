import java.util.Scanner;

public class PalindromeCheckerApp {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input text: ");
            String input = scanner.nextLine();

            // Normalize input: ignore case
            String normalized = input.toLowerCase();

            // Reverse the string
            String reversed = new StringBuilder(normalized).reverse().toString();

            // Check palindrome
            boolean isPalindrome = normalized.equals(reversed);

            System.out.println("Is it a Palindrome? : " + isPalindrome);

            scanner.close();

    }
}