package Strings;

import java.util.*;

public class LongestWordInSentence {
       public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the sentence: ");
            String str=sc.nextLine();
            String[] words =str.split(" ");

            String longest=words[0];

            for(int i=0;i<words.length;i++){
                if(words[i].length()>longest.length()){
                    longest=words[i];
                }

            }
            System.out.println("Longest word: "+ longest);
            sc.close();
       }
}
