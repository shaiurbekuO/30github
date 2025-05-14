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

            System.out.println(ob.countAndSay(n));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";
        
        String prev = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder curr = new StringBuilder();
            int count = 1;
            for (int j = 1; j < prev.length(); j++) {
                if (prev.charAt(j) == prev.charAt(j - 1)) {
                    count++;
                } else {
                    curr.append(count).append(prev.charAt(j - 1));
                    count = 1;
                }
            }
            curr.append(count).append(prev.charAt(prev.length() - 1));
            prev = curr.toString();
        }
        return prev;
        
    }
}
