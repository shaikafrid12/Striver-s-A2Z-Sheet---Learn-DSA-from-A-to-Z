import java.util.*;
public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(printFibonacciSeries(n));
        sc.close();
    }
    
    public static int  printFibonacciSeries(int n){
        if(n<=1) return n;
        int first=printFibonacciSeries(n-1);
        int second=printFibonacciSeries(n-2);
        return first+second;
        
    }
}
