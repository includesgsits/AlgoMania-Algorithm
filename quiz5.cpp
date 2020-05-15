#include <bits/stdc++.h>
 
using namespace std;
#define fastio ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
#define ll long long
#define pb push_back
#define MOD 1000000007
#define ull unsigned long long
#define rep(j, n) for(int in = j;in<n;in++) 
#define foj(z, n) for(int j = z;j<n;j++)
#define FO(j, n) for(int i = j;i<=n;i++)

int main()
{
    fastio;
    
   	int t;
   	cin>>t;
   	while(t--) {
		int n;
		cin>>n;
		
		int a[n];
		rep(0, n) cin>>a[in];
		
		int max = 0, min = INT_MAX;
		
		int c = 1;
		
		for(int i = 1;i<n;i++) {
			if(a[i] - a[i-1] <= 2) {
				c++;
			}
			else {
				if(c > max) max = c; 
				c = 1;
			}
		}
		
		if(a[1] - a[0] > 2) min = 1;
		else if(a[8] - a[0] > 2) min = 1;
		else {
			
			for(int i = 0;i<n-1;i++) {
				c = 1;
				while(a[i+1] - a[i] > 2) {
					c++;
				}
				if(c < min) min = c;
			}
		}
		
		cout<<min<<" "<<max<<"\n";
	}
	

return 0; 
}
