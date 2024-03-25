//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            ArrayList<String> result = ob.NBitBinary(n);
            for(String value  : result){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        // code here
         ArrayList<String> result = new ArrayList<>();
            validateAndAdd(1,"1",result,1,N);
            return result;
    }
    
    void validateAndAdd(int diff,String s, ArrayList<String> result,int length,int N){
        if(length==N){
            if(diff>=0){
                 result.add(s);
            }
               return;
        }
        
        validateAndAdd(diff+1,s+"1",result,length+1,N);
        if(diff-1>=0){
             validateAndAdd(diff-1,s+"0",result,length+1,N);
        }
    }
}