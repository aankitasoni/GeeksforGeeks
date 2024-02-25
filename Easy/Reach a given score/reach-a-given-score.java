//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        while(t > 0)
        {
            int n = in.nextInt();
            Geeks obj = new Geeks();
            System.out.println(obj.count(n));
            t--;
        }
    }
}
// } Driver Code Ends


// Complete this function!

class Geeks {
    public long count(int n) {
        // Add your code here.
         int arr[] = new int[]{3,5,10};
        long dp[][] = new long[arr.length+1][n+1];
        for(long[] row : dp) {
			Arrays.fill(row, -1);
		}
        long ans = findWay(arr,dp,n,arr.length-1);
        return ans;
    }
    public static long findWay(int arr[],long dp[][],int sum,int pos){
        
        if(sum==0){
            return dp[pos][sum] = 1;
        }
        if(sum<0 || pos<0){
            return 0;
        }
        if(dp[pos][sum] != -1){
            return dp[pos][sum];
        }
        
        
        return dp[pos][sum] = findWay(arr,dp,sum-arr[pos],pos) + findWay(arr,dp,sum,pos-1);
    }
}