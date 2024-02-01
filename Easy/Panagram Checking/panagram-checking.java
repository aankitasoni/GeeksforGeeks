//{ Driver Code Starts
//Initial template for JAVA

import java.lang.*;
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        boolean ans = true;
        s = s.toLowerCase();
        
        for (char c = 'a'; c <= 'z'; c++){
            if (!s.contains(String.valueOf(c))){
                ans = false;
                break;
            }
        }
        return ans;
    }
}

//{ Driver Code Starts.

class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int t=Integer.parseInt(br.readLine());
	  while(t-->0)
	  {
	    String s=br.readLine().trim();
	    
	    System.out.println(new Solution().checkPangram (s)==true?1:0);
	  }
	  
	 }
}
// } Driver Code Endshttps://media.geeksforgeeks.org/img-practice/prod/courses/5/Web/Content/Clock-4_1706701529.gif