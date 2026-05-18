import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int revnum=0;
        while(n>0){
            int x=n%10;
            revnum=revnum*10+x;
            n/=10;
        }
        if(temp==revnum){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome");
        }
sc.close();
    }
}
