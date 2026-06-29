import java.util.*;

public class CountDigits {
    public static void count(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        System.out.println("Number of digits is: "+count);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        count(n);
    }
}
