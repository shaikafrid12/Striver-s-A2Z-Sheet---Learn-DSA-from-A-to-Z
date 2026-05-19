import java.util.*;

public class Main {
    public static void printNums(int i,int n){
        if(i>n) return;
        System.out.print(i+" ");
        printNums(i+1,n);
    }

    public static void blacktracking(int i,int n){
        if(i>n) return;

        blacktracking(i+1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        blacktracking(1,n);
        sc.close();
    }
}
