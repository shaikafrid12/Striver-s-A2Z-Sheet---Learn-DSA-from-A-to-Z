import java.util.*;

public class Main {

    public static void printName(String s,int count,int n) {
       if(count ==n) return;

       System.out.println(s);

       printName(s, count+1, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        printName(s, 0, n);
        scanner.close();

    }
}