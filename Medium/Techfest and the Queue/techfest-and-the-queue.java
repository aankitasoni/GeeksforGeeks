//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long a;
            a = Long.parseLong(br.readLine().trim());
            
            
            long b;
            b = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.sumOfPowers(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static long sumOfPowers(long a, long b) {
        long sum = 0;
        for (long i = a; i <= b; i++){
            sum += powersumofprimefac(i);
        }
        return sum;
    }
    
    
    public static long powersumofprimefac(long x){
        long sum =0;
        for (long i =2; i*i <= x; i++){
            while(x%i ==0){
                sum++;
                x = x/i;
            }
            
        }
        if (x != 1){
            sum++;
        }
        
        return sum;
    }
}
        
