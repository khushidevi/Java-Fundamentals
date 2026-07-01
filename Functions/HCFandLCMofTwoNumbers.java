import java.util.*;

public class HCFandLCMofTwoNumbers {
      public static void hcfAndLcm(int a, int b) {
        int hcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        int lcm = (a * b) / hcf;
        System.out.println("HCF: " + hcf);
        System.out.println("LCM: " + lcm);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        hcfAndLcm(num1, num2);
    }
}
