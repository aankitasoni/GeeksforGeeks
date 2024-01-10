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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        String s = Integer.toBinaryString(N);
        int count1 = 0;
        int ans = 0;
        for (int i =0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                count1++;
                ans = s.length() - i;
            }
        }
        if (count1 == 1) {
            return ans;
        }
        return -1;
    }
};