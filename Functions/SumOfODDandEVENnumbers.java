// Program to find the sum of odd and even numbers from 1 to n and sum of n numbers

import java.util.*;

public class SumOfODDandEVENnumbers {
    public static void sumOfOddAndEven(int n) {
        int sumOdd = 0, sumEven = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("Sum of odd numbers: " + sumOdd);
        System.out.println("Sum of even numbers: " + sumEven);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        sumOfOddAndEven(num);
        sumOfN(num);
    }
    public static void sumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of first " + n + " numbers: " + sum);
    }
}