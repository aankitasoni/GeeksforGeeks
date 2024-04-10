//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // function to convert a given Gray equivalent n to Binary equivalent.
    public static int grayToBinary(int n) {
        
        // Your code here
           String gray = Integer.toBinaryString(n);
        String binary = binaryToGray(gray);
        int val = Integer.parseInt(binary, 2); // Convert binary string to integer with radix 2
        return val;
    }
    
    public static String binaryToGray(String binary) {
        StringBuilder gray = new StringBuilder();
        gray.append(binary.charAt(0));
        for (int i = 1; i < binary.length(); i++) {
            gray.append((binary.charAt(i) ^ gray.charAt(i - 1)));
        }
        return gray.toString();
        
    }
       
}



//{ Driver Code Starts.

class GFG {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();//testcases
		while(t-->0){
		    int n = sc.nextInt();//initializing n
		    
		    Solution obj = new Solution();
		    
		    //calling grayToBinary() function
		    System.out.println(obj.grayToBinary(n));
		}
	}
}

// } Driver Code Ends