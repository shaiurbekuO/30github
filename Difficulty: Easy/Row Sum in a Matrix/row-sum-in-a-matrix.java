//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
    public static int[] rowSum(int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=0; j<m; j++){
                sum += mat[i][j];
            }
            arr[i] = sum;
        }
        
        return arr;
    }
}

//{ Driver Code Starts.

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }
            Solution sln = new Solution();
            int ans[] = sln.rowSum(mat);
            for (int i = 0; i < n; i++) System.out.print(ans[i] + " ");
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends