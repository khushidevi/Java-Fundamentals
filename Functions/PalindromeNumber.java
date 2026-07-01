import java.util.*;

public class PalindromeNumber {
     public static void palindrome(int n) {
        int originalNumber, reverse = 0, remainder;
        originalNumber = n;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            reverse = reverse * 10 + remainder;
            originalNumber /= 10;
        }

        if (reverse == n)
            System.out.println(n + " is a Palindrome number.");
        else
            System.out.println(n + " is not a Palindrome number.");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        palindrome(num);
    }
    
}
