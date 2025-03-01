//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        while (t-- > 0) {
            String s = in.readLine();

            Solution ob = new Solution();
            out.println(ob.decodeString(s));

            out.println("~");
        }
        out.close();
    }
}
// } Driver Code Ends



class Solution {
    static String decodeString(String s) {
        int n = s.length();
        if (n == 0) return s;

        Stack<Integer> st = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        StringBuilder temp = new StringBuilder();
        int num = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                st.push(num);
                num = 0;
                str.push(temp);
                temp = new StringBuilder();
            } else if (ch == ']') {
                int k = st.pop();
                StringBuilder currentString = str.pop();
                for (int j = 1; j <= k; j++) {
                    currentString.append(temp);
                }
                temp = currentString;
            } else {
                temp.append(ch);
            }
        }
        return temp.toString();
    }
}