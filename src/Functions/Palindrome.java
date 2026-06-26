package Functions;

public class Palindrome {
    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;
        int num3 = 456;

        System.out.println(num1 + " is palindrome? " + isPalindrome(num1));
        System.out.println(num2 + " is palindrome? " + isPalindrome(num2));
        System.out.println(num3 + " is palindrome? " + isPalindrome(num3));
    }

    public static boolean isPalindrome(int number) {
        // Negative numbers are not palindromes (e.g., -121 reversed is 121-)
        if (number < 0) {
            return false;
        }

        int temp = number;
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;          // Extract the last digit
            reversedNumber = (reversedNumber * 10) + lastDigit; // Append it to the reversed number
            number = number / 10;                // Remove the last digit from the original
        }

        // If the reversed number is equal to the original, it's a palindrome
        return temp == reversedNumber;
    }
}
