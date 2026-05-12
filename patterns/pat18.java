import java.util.Scanner;

public class pat18 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();

        for (int i = 0; i < n; i++) {

        

            // Print characters
            for (char ch = (char)('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            //print space after characters
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}