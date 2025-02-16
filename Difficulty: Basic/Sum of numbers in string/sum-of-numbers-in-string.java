//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        while (t-- > 0) {
            String s = br.readLine();

            Solution obj = new Solution();

            System.out.println(obj.findSum(s));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends




class Solution {
    // Function to calculate sum of all numbers present in a string.
    public static int findSum(String s) {
        int count = 0;
        StringBuilder numbers = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                numbers.append(ch); 
            } else {
                if (numbers.length() > 0) { 
                    count += Integer.parseInt(numbers.toString());
                    numbers.setLength(0);
                }
            }
        }
        if (numbers.length() > 0) {
            count += Integer.parseInt(numbers.toString());
        }
        
        return count;
    }
}