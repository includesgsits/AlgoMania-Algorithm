#include<bits/stdc++.h>
using namespace std;
int main()
{
    int s,n;
    vector<int> vi;
    cin>>s;
    while(s--)
    {
        cin>>n;
       vi.push_back(n);
    }
    s=vi.size();
    int t=0;
    int m1=vi[t];
    int m2=vi[t];
    while(t<s)
    {
        m1=m1>vi[t]?vi[t]:m1;
        m2=m2>vi[t]?m2:vi[t];
        t++;
    }
    int mar=m2-m1+1;
    vector<int> two[mar];
     t=0;
    while(t<s)
    {
    two[vi[t]-m1].push_back(vi[t]);
    t++;
    }

     t=0;
     int one=0;
    while(t<mar)
    {
        vector<int>::iterator same;
        same=two[t].begin();
        while(same!=two[t].end())
        {
            vi[one]=*same;
            one=one+1;
            same++;
        }
        t++;
    }
    return 0;
}
