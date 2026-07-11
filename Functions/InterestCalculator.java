import java.util.Scanner;

public class InterestCalculator {

    // Function to calculate Simple Interest
    public static double calculateSI(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Function to calculate Compound Interest
    public static double calculateCI(double principal, double rate, double time) {
        double amount = principal * Math.pow((1 + rate / 100), time);
        return amount - principal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Interest Calculator");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        switch (choice) {

            case 1:
                System.out.println("Simple Interest = " +
                        calculateSI(principal, rate, time));
                break;

            case 2:
                System.out.printf("Compound Interest = %.2f%n",
                        calculateCI(principal, rate, time));
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }
}
