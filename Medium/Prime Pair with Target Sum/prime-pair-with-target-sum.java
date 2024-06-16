//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.ArrayList;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.getPrimes(n);

            IntArray.print(res);
        }
    }
}

// } Driver Code Ends


// import java.util.ArrayList;

class Solution {
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        boolean[] prime = new boolean[n + 1];
        for(int i = 2; i<=n; ++i){
            prime[i] = true;
        }
        
        for(int i = 2; i * i <= n; ++i){
            if(prime[i]){
                for(int j = i * i; j<= n; j += i){
                    prime[j] = false;
                }
            }
        }
        
        
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 2; i <= n; ++i){
            if(prime[i] && prime[n - i]){
                res.add(i);
                res.add(n - i);
                return res;
            }
        }
        
            res.add(-1);
            res.add(-1);
        
        return res;
    }
}