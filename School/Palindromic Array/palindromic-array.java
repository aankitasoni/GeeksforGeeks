//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           {
                  //add code here.
                  for (int i =0; i < n; i++){
                      if (a[i] != ispalindrome(a[i])){
                          return 0;
                      }
                  }
                  return 1;
           }
           public static int ispalindrome(int p){
              int sum = 0;
              while (p > 0){
                  int a = p % 10;
                  sum = sum *10 + a;
                  p /= 10;
              }
              return sum;
           }
}