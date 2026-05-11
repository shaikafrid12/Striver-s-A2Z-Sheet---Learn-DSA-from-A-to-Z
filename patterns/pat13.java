import java.util.Scanner;

public class pat13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=1;
        for(int i=1;i<n+1;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
