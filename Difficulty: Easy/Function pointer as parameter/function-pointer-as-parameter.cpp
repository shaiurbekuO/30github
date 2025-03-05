//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends

//Back-end complete function Template for C++
#include <stdio.h>

int add(int a, int b) {
    return a + b;
}


int mul(int a, int b) {
    return a * b;
}


int compute(int a, int b, int (*func)(int, int)) {
    return func(a, b); 
}


//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;

    while (t--) {
        int a, b;
        cin >> a >> b;
        string s;
        cin >> s;
        if (s == "add()") {
            cout << compute(a, b, &add) << endl;
        } else {
            cout << compute(a, b, &mul) << endl;
        }
    }

    return 0;
}
// } Driver Code Ends