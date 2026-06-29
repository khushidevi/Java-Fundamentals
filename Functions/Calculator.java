import java.util.*;

public class Calculator {

       public static void add(int a,int b){
        int sum=a+b;
        System.out.println("Sum of "+a+" and "+b+" is: "+sum);
       }

       public static void subtract(int a,int b){
        int diff=a-b;
        System.out.println("Difference of "+a+" and "+b+" is: "+diff);
       }

       public static void multiply(int a,int b){
        int product=a*b;
        System.out.println("Product of "+a+" and "+b+" is: "+product);
       }

       public static void divide(int a,int b){
        if(b==0){
            System.out.println("Division by zero is not allowed.");
            return;
        }
        int quotient=a/b;
        System.out.println("Quotient of "+a+" and "+b+" is: "+quotient);
       }
       public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        for(;;){
            System.out.println("Choose an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    add(a,b);
                    break;
                case 2:
                    subtract(a,b);
                    break;
                case 3:
                    multiply(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    System.out.println("Thank you for using the calculator. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
       }
}
