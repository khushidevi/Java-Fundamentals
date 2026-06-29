import java.util.*;
public class FibonacciSeries {
       public static void fibonacci(int n){
             int a=0,b=1,c;
             System.out.print("Fibonacci Series: "+a+" "+b);
             for(int i=2;i<n;i++){
                 c=a+b;
                 System.out.print(" "+c);
                 a=b;
                 b=c;
            }
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of terms in Fibonacci series: ");
            int n=sc.nextInt();
            fibonacci(n);
        }
}
