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

/*If we have to reverse word order and not the characters.


public class ReverseWordOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        System.out.print("Reversed Sentence: ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }

        sc.close();
    }
}
*/

/*If we want to reverse the word order as well as characters.


import java.util.Scanner;

public class ReverseWordsAndCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        System.out.print("Output: ");

        // Reverse the order of words
        for (int i = words.length - 1; i >= 0; i--) {

            // Reverse each word
            for (int j = words[i].length() - 1; j >= 0; j--) {
                System.out.print(words[i].charAt(j));
            }

            System.out.print(" ");
        }

        sc.close();
    }
}


*/