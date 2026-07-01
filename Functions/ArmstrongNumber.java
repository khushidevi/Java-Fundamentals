import java.util.*;

public class ArmstrongNumber {
    public static void armstrong(int n) {
        int originalNumber, remainder, result = 0;
        originalNumber = n;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if (result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        armstrong(num);
    }

       
}
