package Strings;

import java.util.Scanner;

public class CheckRotationOfString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not rotations.");
        } else {

            String temp = str1 + str1;

            int i, j;

            for (i = 0; i <= temp.length() - str2.length(); i++) {

                for (j = 0; j < str2.length(); j++) {

                    if (temp.charAt(i + j) != str2.charAt(j)) {
                        break;
                    }

                }

                if (j == str2.length()) {
                    System.out.println("Strings are rotations.");
                    break;
                }
            }

            if (i > temp.length() - str2.length()) {
                System.out.println("Strings are not rotations.");
            }
        }

        sc.close();
    }
}
