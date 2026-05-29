import java.util.HashMap;
import java.util.Scanner;

public class OptimalApproach {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                System.out.println(arr[i]+" : "+map.get(arr[i]));
                map.remove(arr[i]);
            }
        }

        
        sc.close();
    }
}
