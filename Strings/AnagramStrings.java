package Strings;

import java.util.Scanner;

public class AnagramStrings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
        } else {

            int i, j, count1, count2;

            for (i = 0; i < str1.length(); i++) {

                count1 = 0;
                count2 = 0;

                for (j = 0; j < str1.length(); j++) {
                    if (str1.charAt(i) == str1.charAt(j))
                        count1++;

                    if (str1.charAt(i) == str2.charAt(j))
                        count2++;
                }

                if (count1 != count2) {
                    System.out.println("Not Anagrams");
                    break;
                }
            }

            if (i == str1.length()) {
                System.out.println("Anagrams");
            }
        }

        sc.close();
    }
}