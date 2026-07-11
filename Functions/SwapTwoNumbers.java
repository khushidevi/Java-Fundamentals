//We can swap by using a temporary variable also.[temp=num1, num1=num2, num2=temp]

import java.util.Scanner;

//This is swapping without using temporary variable.

public class SwapTwoNumbers{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("Before Swapping:");
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After Swapping:");
        System.out.println("First Number = " + num1);
        System.out.println("Second Number = " + num2);

        sc.close();
    }
}
