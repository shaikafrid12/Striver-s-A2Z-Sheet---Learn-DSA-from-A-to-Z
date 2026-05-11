import java.util.Scanner;

public class pat15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
