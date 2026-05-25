import java.util.*;
public class OptimalApproach {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        if(isPalindrome(str, 0, str.length()-1)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }
        if(str.charAt(start)!=str.charAt(end)){
            return false;   
        }
        return isPalindrome(str, start+1, end-1);
    }
}
