// Program to find the largest among three numbers using functions and average of three numbers

import java.util.*;

public class LargestAmongThreeNumbers {
     public static void largest(int a, int b, int c) {
        if (a >= b && a >= c)
            System.out.println(a + " is the largest number.");
        else if (b >= a && b >= c)
            System.out.println(b + " is the largest number.");
        else
            System.out.println(c + " is the largest number.");
    }
    
    public static void average(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average of three numbers: " + avg);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();
        sc.close();
        largest(num1, num2, num3);
        average(num1, num2, num3);
    }
    
}
