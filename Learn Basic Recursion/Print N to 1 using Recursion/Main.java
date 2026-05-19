import java.util.Scanner;

public class Main {
    public static void print(int i){
        if(i<1) return;
        System.out.print(i+" ");
        print(i-1); 
    }

    public static void printBacktracking(int n){
        if(n<1) return;
        printBacktracking(n-1);
        System.out.print(n+" ");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        System.out.println();
        System.out.println("Using Backtracking");
        printBacktracking(n);
        sc.close();
    }
}
