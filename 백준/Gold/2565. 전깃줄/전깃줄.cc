#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int n, res = 0;
vector <pair<int,int>> line;
int dp[101];

int main(){
    cin >> n ;
    for(int i=0;i<n;i++){
        int a, b;
        cin >> a >> b ;
        line.push_back({ a,b });
    }
    
    sort(line.begin(),line.end());

    for(int i=0;i<n;i++){
        dp[i] = 1;
        for(int j=0;j<i;j++){
            if( line[i].second > line[j].second ){
                dp[i] = max(dp[i],dp[j]+1);
            }
        }
        res = max(res, dp[i]);
    }

    cout << n - res ;
    
    
}