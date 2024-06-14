//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    static String armstrongNumber(int n) {
        // code here
        char c[] = String.valueOf(n).toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++){
            sum += Math.pow(c[i] - '0', 3);
        }
        if (sum == n){
            return "true";
        }
        return "false";
    }
}