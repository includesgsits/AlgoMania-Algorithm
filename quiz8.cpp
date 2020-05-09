#include <bits/stdc++.h> 
using namespace std;
  
void subalgo(char* a, int x, int* arr) 
{ 
    
    int l= 0; 
  
    arr[0] = 0; 
  
    
    int i = 1; 
    while (i < x) { 
        if (a[i] == j[l]) { 
            l++; 
            arr[i] = l; 
            i++; 
        } 
        else 
        { 
            
            if (l != 0) { 
                l = arr[l - 1]; 
  
                 
            } 
            else 
            { 
                arr[i] = 0; 
                i++; 
            } 
        } 
    } 
} 
  

void algo(char* a, char* b) 
{ 
    int x = strlen(a); 
    int y = strlen(b); 
  
   
    int arr[x]; 
  
  
    subalgo(a, x, arr); 
  
    int i = 0; 
    int j = 0;  
    while (i < y) { 
        if (a[j] == b[i]) { 
            j++;  i++; 
        } 
  
        if (j == x) { 
            cout<<i-j<<" "; 
            j = arr[j - 1]; 
        } 
  
     
        else if (i < y && a[j] != b[i]) { 
            
            if (j != 0) 
                j = arr[j - 1]; 
            else
                i = i + 1; 
        } 
    } 
} 
  


  

