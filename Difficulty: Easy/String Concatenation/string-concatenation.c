//{ Driver Code Starts
//Initial Template for C

#include <stdio.h>
#include<string.h>

void concat(char s1[], char s2[]);

int main() 
{
   
   	int t;
   	scanf("%d", &t);
   	while(t--)
   	{
   		char s1[1000], s2[1000];
   	    scanf("%s %s", &s1, &s2);
   		
   		concat(s1, s2);
   	
printf("~%s", "\n");}

    return 0;
}

// } Driver Code Ends


//User function Template for C


void concat(char s1[], char s2[])
{
    strcat(s1, s2); 
    printf("%s\n", s1); 
}
 
