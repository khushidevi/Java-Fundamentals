package Strings;

import java.util.Scanner;

public class CountOccurenceOfCharacter{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        System.out.println("Character Occurrences:");

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // Skip spaces
            if (ch == ' ') {
                continue;
            }

            // Check if character has already been counted
            int j;
            for (j = 0; j < i; j++) {
                if (ch == str.charAt(j)) {
                    break;
                }
            }

            // If character already exists before, skip it
            if (j != i) {
                continue;
            }

            int count = 0;

            // Count occurrences
            for (int k = 0; k < str.length(); k++) {
                if (ch == str.charAt(k)) {
                    count++;
                }
            }

            System.out.println(ch + " : " + count);
        }

        sc.close();
    }
}