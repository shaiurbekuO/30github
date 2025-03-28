//{ Driver Code Starts
import java.io.*;   // Import IO classes
import java.util.*; // Import utility classes

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Number of test cases
        String line1, line2;

        while (t-- > 0) {
            // Read first array (row sums)
            line1 = br.readLine().trim();
            String[] rowInput = line1.split(" ");
            int[] rowSum =
                Arrays.stream(rowInput).mapToInt(Integer::parseInt).toArray();

            // Read second array (column sums)
            line2 = br.readLine().trim();
            String[] colInput = line2.split(" ");
            int[] colSum =
                Arrays.stream(colInput).mapToInt(Integer::parseInt).toArray();

            // Create copies of the original arrays to pass to the function
            int[] rowSumCopy = Arrays.copyOf(rowSum, rowSum.length);
            int[] colSumCopy = Arrays.copyOf(colSum, colSum.length);

            Solution ob = new Solution();
            int[][] ans = ob.generateMatrix(
                rowSumCopy, colSumCopy); // Get the matrix using the copies

            // Validate the result
            int n = ans.length, m = ans[0].length;
            if (n != rowSum.length || m != colSum.length) {
                System.out.println("false\n~");
                continue;
            }

            // Check row sums
            boolean isValid = true;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < m; j++) {
                    sum += ans[i][j];
                }
                if (sum != rowSum[i]) {
                    isValid = false;
                    break;
                }
            }

            // Check column sums
            if (isValid) {
                for (int j = 0; j < m; j++) {
                    int sum = 0;
                    for (int i = 0; i < n; i++) {
                        sum += ans[i][j];
                    }
                    if (sum != colSum[j]) {
                        isValid = false;
                        break;
                    }
                }
            }

            // Output the result
            if (isValid) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
 public int[][] generateMatrix(int[] rowSum, int[] colSum) {
        // code here
       // public ArrayList<ArrayList<Integer>> generateMatrix(int[] rowSum, int[] colSum) {
        int n=rowSum.length;
        int m=colSum.length;
       // ArrayList<Integer> matrix = new ArrayList<>();
       int mat[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int value=Math.min(rowSum[i],colSum[j]);
                mat[i][j]=value;
                rowSum[i]-=value;
                colSum[j]-=value;
            }
        }
       /* for(int sum:rowSum)
        {
            if(sum!=0)return null;
        }
         for(int sum:colSum)
        {
            if(sum!=0)return null;
        }*/
        return mat;
    }
}