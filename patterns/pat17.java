import java.util.Scanner;

public class pat17 {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

         for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Increasing characters
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch+" ");
            }

            // Decreasing characters
            for (char ch = (char)('A' + i - 2); ch >= 'A'; ch--) {
                System.out.print(ch+" ");
            }

            System.out.println();
        }
    }
}