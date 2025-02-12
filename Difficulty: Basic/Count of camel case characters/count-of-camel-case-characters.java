//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countCamelCase (s));
        
System.out.println("~");
}
        
    }
}

// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countCamelCase (String s){
         int count = 0;
         
         char[] charArray = s.toCharArray(); 
         for(char ch : charArray){
             if (Character.isUpperCase(ch)) {
                count++;
            }
         }
         return count;
    }
}