package Strings;

import java.util.Scanner;

public class CheckSubstring {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String str = sc.nextLine();

        System.out.print("Enter the substring: ");
        String sub = sc.nextLine();

        int i, j;

        for (i = 0; i <= str.length() - sub.length(); i++) {

            for (j = 0; j < sub.length(); j++) {

                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }

            }

            if (j == sub.length()) {
                System.out.println("Substring found.");
                break;
            }
        }

        if (i > str.length() - sub.length()) {
            System.out.println("Substring not found.");
        }

        sc.close();
    }
}