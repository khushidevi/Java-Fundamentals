package Strings;

import java.util.Scanner;

public class RemoveDuplicateCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("String after removing duplicates: ");

        for (int i = 0; i < str.length(); i++) {

            int j;

            // Check if character has appeared before
            for (j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    break;
                }
            }

            // Print only if it's the first occurrence
            if (j == i) {
                System.out.print(str.charAt(i));
            }
        }

        sc.close();
    }
}