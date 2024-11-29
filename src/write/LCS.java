package write;

public class LCS {

	public static int findLCS(String s1, String s2) {
		
		int m = s1.length();
		int n = s2.length();
		
		int dp[][] = new int[m+1][n+1];
		
		for(int i=1;i<=m;i++) {
			
			for(int j=1;j<=n;j++) {
				
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}else {
					dp[i][j] = Math.max(dp[i-1][j] , dp[i][j-1]);
				}
			}
		}
	
		return dp[m][n];
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String s1 = "ABCAB";
	     String s2 = "AECB";
	     System.out.println("Length of Longest Common Subsequence: " + findLCS(s1, s2));
	        
	}

}
