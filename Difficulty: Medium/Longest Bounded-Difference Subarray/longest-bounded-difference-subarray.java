//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

class Solution {
    public ArrayList<Integer> longestSubarray(int[] arr, int x) {
        Deque<Integer> minq = new ArrayDeque<>();
        Deque<Integer> maxq = new ArrayDeque<>();
        int st = 0, end = 0;
        int ansLen = 0;
        int ansSt = 0, ansEnd = 0;

        for (int i = 0; i < arr.length; i++) {
            end = i;

            while (!maxq.isEmpty() && arr[maxq.getLast()] < arr[i]) {
                maxq.removeLast();
            }
            maxq.addLast(i);

            while (!minq.isEmpty() && arr[minq.getLast()] > arr[i]) {
                minq.removeLast();
            }
            minq.addLast(i);

            while (arr[maxq.getFirst()] - arr[minq.getFirst()] > x) {
                st++;
                while (!minq.isEmpty() && minq.getFirst() < st) {
                    minq.removeFirst();
                }
                while (!maxq.isEmpty() && maxq.getFirst() < st) {
                    maxq.removeFirst();
                }
            }

            if (end - st + 1 > ansLen) {
                ansLen = end - st + 1;
                ansSt = st;
                ansEnd = end;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = ansSt; i <= ansEnd; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}


//{ Driver Code Starts.
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.longestSubarray(arr, k);

            // Print the result as a space-separated string
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after printing the results
            System.out.println("~");
        }
    }
}

// } Driver Code Ends