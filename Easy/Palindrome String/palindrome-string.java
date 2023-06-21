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
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        boolean b = true;
        for(int i = 0; i < S.length() ; i++){
            if (S.charAt(i) == S.charAt(S.length()-1-i)){
                continue;
            } else {
                b = false;
            }
        }
        if (b == true){
            return 1;
        } else {
            return 0;
        }
    }
}