#include <bits/stdc++.h>
 
using namespace std;  

int main()
{
	//length of b should be less than or equal to a
	
	string a, b;
	cin>>a>>b;
	
	vector <int> ans;
	
	int x = b.size();  
    int y = a.size();  
  
    vector <int> c(256, -1); 
  
    for (int i = 0; i < x; i++)  c[(int)b[i]] = i;  
  
    int d = 0; 
    while(d <= (y - x))  {  
        int j = x - 1;  
        while(j >= 0 && b[j] == a[d + j])  j--;  
        if (j < 0)  
        {  
            ans.push_back(d);  
            if((d+x) < y) d += x - c[(int)a[d+x]];
	    else d+=1;
        }
        else d += max(1, j - c[(int)a[d + j]]);  
    }  
    
    for(auto i: ans) cout<<i<<" ";

    cout<<"\n";
return 0; 
}
