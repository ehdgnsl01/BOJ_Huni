#include <iostream>
#include <cmath>
using namespace std;

int main(){
    string s;
    int n,res=0;
    cin >> s >> n ;
    for(int i=0;i<s.length();i++){
        if(s[i]>='0' && s[i]<='9'){
            res += ((int)s[i]-48)*pow(n,s.length()-1-i);
        }
        else{
            res += ((int)s[i]-55)*pow(n,s.length()-1-i);
        }
    }
    cout << res;
}