//Binary to Decimal and Decimal to Binary Conversion

import java.util.*;

public class DecimalToBinary {

    public static void decimalToBinary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            binary.insert(0, n % 2);
            n /= 2;
        }
        System.out.println("Binary representation is: " + binary.toString());
    }

    public static void binaryToDecimal(int n) {
        int decimal = 0, power = 0;
        while (n > 0) {
            decimal += (n % 10) * Math.pow(2, power);
            n /= 10;
            power++;
        }
        System.out.println("Decimal representation is: " + decimal);
    }   

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int decimal = sc.nextInt();
        decimalToBinary(decimal);
        System.out.println("Enter a binary number: ");
        int binary = sc.nextInt();
        binaryToDecimal(binary);
        sc.close();
    }
}
