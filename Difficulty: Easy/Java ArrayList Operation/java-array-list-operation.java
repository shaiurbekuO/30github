//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read number of test cases safely
        String firstLine = br.readLine().trim();
        int t = Integer.parseInt(firstLine);

        while (t-- > 0) {
            ArrayList<Character> clist = new ArrayList<>();

            // Read the whole line for commands
            String q = br.readLine().trim();
            if (q.isEmpty()) continue; // Handle empty input cases

            Geeks obj = new Geeks();
            String[] commands = q.split(" "); // Split commands by spaces

            for (int i = 0; i < commands.length; i += 2) {
                if (commands[i].equals("i") && i + 1 < commands.length) {
                    char c = commands[i + 1].charAt(0);
                    obj.insert(clist, c);
                } else if (commands[i].equals("f") && i + 1 < commands.length) {
                    char c = commands[i + 1].charAt(0);
                    obj.freq(clist, c);
                }
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// Geeks class with functions insert and freq
// insert : to insert element into ArrayList
// freq : function to count frequency of element
class Geeks
{
    // Function to insert element
    public static void insert(ArrayList<Character> clist, char c)
    {
        
        //add c to clist
        clist.add(c);
    }
    
    // Function to count frequency of element
    public static void freq(ArrayList<Character> clist, char c)
    {
     
        if(clist.contains(c))
        System.out.println( Collections.frequency(clist,c));
        else
        System.out.println(-1);
        
    }
}

