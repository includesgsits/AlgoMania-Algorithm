#include<iostream> 
using namespace std; 
void aryy(string str, int zero[]) 
{ 
    int l = str.length(); 
    int end, st, bt; 
    end = st = 0; 
    for (int i = 1; i < l; i++) 
    { 
        if (i > st) 
        { 
            end = st = i; 
            while (st<n && str[st-end] == str[st]) 
                st++; 
            zero[i] = st-end; 
            st--; 
        } 
        else
        { 
            bt= i-end; 
            if (zero[bt] < st-i+1) 
                zero[i] = zero[bt]; 
            else
            { 
                end = i; 
                while (st<n && str[st-end] == str[st]) 
                    st++; 
                zero[i] = st-end; 
                st--; 
            } 
        } 
    } 
} 
void see(string str1, string str2) 
{ 
    string same = str2 + "$" + str1; 
    int l = same.length(); 
    int zero[l]; 
    aryy(same, zero); 
    for (int i = 0; i < l; i++) 
    { 
        if (zero[i] == str2.length()) 
            cout << i - str2.length() -1 << endl; 
    } 
} 