#include <iostream>
using namespace std;
long long DP[90];

int main(){
    int input, res;
    cin >> input ;
    int n = input-1;

    DP[0] = 1;
    DP[1] = 1;
    DP[2] = 2;
    
    for (int i=3; i<=n; i++){
        DP[i] = DP[i-2] * 2 + DP[i-3];
    }
    
    cout << DP[n] ;
}