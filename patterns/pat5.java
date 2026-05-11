import java.util.Scanner;

public class pat5 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>0;i--){
            for(int j=1;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }   
}
