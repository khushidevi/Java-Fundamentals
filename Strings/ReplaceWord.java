//We can use built in library function str = str.replace() to do this program but i will do it manually.

package Strings;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String str = sc.nextLine();

        System.out.println("Enter the word to replace:");
        String oldWord = sc.next();

        System.out.println("Enter the new word:");
        String newWord = sc.next();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                words[i] = newWord;
            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);

            if (i != words.length - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}