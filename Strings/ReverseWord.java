package Strings;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        System.out.print("Reversed Words: ");

        for (int i = 0; i < words.length; i++) {

            for (int j = words[i].length() - 1; j >= 0; j--) {
                System.out.print(words[i].charAt(j));
            }

            System.out.print(" ");
        }

        sc.close();
    }
}