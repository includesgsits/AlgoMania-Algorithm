#include <bits/stdc++.h>

using namespace std;

int algo(int arr[], int n){
	int m1 = 0;
	int m2 = 0;
	for(int i=0; i<n; i++){
		m2 += arr[i];
		m2 = max(m2,0);
		m1 = max(m1,m2);
	}
	return m1;
}

int main(){
	int n;
	cin >> n;
	int arr[n];
	for(int i=0; i<n; i++)
		cin >> arr[i];
	cout << algo(arr,n) << endl;
}
