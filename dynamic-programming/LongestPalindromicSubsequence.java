
public class LongestPalindromicSubsequence {
	public static void main(String [] args){
		String s = "geeksforgeeks";
		System.out.println(lps(s));		
	}
	public static int lps(String s){
		int n = s.length();
		int t[][] = new int[n][n];
		int i,j,k;
		k = 1;
		for(i=0;i<n;i++){
			t[i][i] = 1;
		}
		while(k < n){
			i = 0; j = k;
			while(i<n && j<n){
				if(s.charAt(i) == s.charAt(j)){
					t[i][j] = 2 + t[i+1][j-1];
				}
				else{
					t[i][j] = Math.max(t[i+1][j], t[i][j-1]);
				}
				i++;
				j++;
			}
			k++;
		}
		return t[0][n-1];		
	}

}
