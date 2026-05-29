import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(printFibonacciSeries(n));
        sc.close();
    }
    

    public static List<Integer> printFibonacciSeries(int n){
        List<Integer> fibSeries = new ArrayList<>();
        
        for(int i=0; i<=n; i++){
            fibSeries.add(fibonacci(i));
        }
        
        return fibSeries;
    }

    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

}