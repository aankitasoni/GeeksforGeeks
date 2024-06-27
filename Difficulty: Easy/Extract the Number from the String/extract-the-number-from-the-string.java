//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        long ans = -1;
    
        String s[] = sentence.split(" ");
        for (int i =0; i < s.length; i++){
            try{
                long num = Long.parseLong(s[i]);
                if (corr(num) == true){
                    continue;
                }
                ans = Math.max(num, ans);
            } 
            catch(Exception e){
                continue;
            }
        }
        return ans;
    }
    
    boolean corr(long n){
         while(n > 0){
            if(n % 10 == 9){
                return true;
            }
            n /= 10;
        }
        return false;
    }
}