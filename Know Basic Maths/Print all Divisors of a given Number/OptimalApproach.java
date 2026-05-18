import java.util.*;
public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                arr.add(i);
                if(i*i!=n){
                    arr.add(n/i);
                }
            }
        }
        Collections.sort(arr);
        System.out.println(arr);
        sc.close();
    }
}
