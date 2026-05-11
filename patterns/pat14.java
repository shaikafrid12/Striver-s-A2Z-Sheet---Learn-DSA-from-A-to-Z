import java.util.Scanner;

public class pat14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<n+1;i++){
            char x='A';
            for(int j=0;j<i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
        sc.close();
    }
}
