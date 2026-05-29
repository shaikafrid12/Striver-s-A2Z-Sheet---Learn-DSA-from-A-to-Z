import java.util.Scanner;

public class BruteForceApproach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int visited[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            visited[i]=0;
        }
        for(int i=0;i<n;i++){
            if(visited[i]==1) continue;

            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                    visited[j]=1;
                }
            }
            if(visited[i]==0){
                System.out.println(arr[i]+" : "+count);
                visited[i]=1;
            }
        }
        sc.close();
    }
}
