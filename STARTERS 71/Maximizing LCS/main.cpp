// https://www.codechef.com/problems/MAXLCS?tab=statement

#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here
	int t; cin >> t;
	while(t--){
	    int n; cin >> n;
	    string rev; cin >> rev;
	    string str = rev;
	    reverse(str.begin(), str.end());
	    vector<vector<int>> dp(n+1, vector<int>(n+1, 0));
	    for(int i = 1;i <= n;i++){
	        for(int j = 1;j <= n;j++){
	            if(str[i-1] != rev[j-1])
	                dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
	            else
	                dp[i][j] = dp[i-1][j-1] + 1;
	        }
	    }
	    cout << dp[n][n]/2 << '\n';
	}
	return 0;
}
