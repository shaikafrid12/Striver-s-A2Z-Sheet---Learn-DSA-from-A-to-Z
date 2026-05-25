import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=fact(n);
        System.out.println(total);
        sc.close();
    }

    public static int fact(int n){
        if(n==0) return 1;

        return n*fact(n-1);
    }
}
