import java.util.*;
public class BetterApproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        printFibonacciSeries(n);
        sc.close();
    }
    
    public static void printFibonacciSeries(int n){
       int first =0;
       int second =1;
       
       System.out.print(first+" "+second);


       for(int i=2; i<=n; i++){
        int third=first+second;
        System.out.print(" "+third);
        first=second;
        second=third;
       }
    }
    

}
