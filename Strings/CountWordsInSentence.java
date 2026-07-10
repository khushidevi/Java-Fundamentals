package Strings;

import java.util.Scanner;

public class CountWordsInSentence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();

        int count=1;

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                  count++;
            }
        }
        System.out.println("Number of words in the sentence is: "+ count);
        sc.close();

    }
}

