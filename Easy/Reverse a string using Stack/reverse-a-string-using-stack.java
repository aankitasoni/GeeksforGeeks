//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

// } Driver Code Ends


class Solution {
    
    public String reverse(String S){
        String s = "";
        Stack<String> st = new Stack<>();
         // st.push(S);
        for (int i=0; i< S.length(); i++ ){
            st.push(String.valueOf(S.charAt(i)));
        }
        for (int i =0; i<S.length(); i++){
            s += st.pop();
        }
       return s;
    }

}