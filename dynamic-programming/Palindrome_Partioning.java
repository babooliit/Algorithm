/**
 * Created by Hemant on 29-09-2016.
 */
public class Palindrome_Partioning {
    public static void main(String[] args){
        String s = "abcbm";
        int result = palindromePartioning(s);
        System.out.println("Minimum number of cuts required: "+ result);
    }
    static int palindromePartioning(String s){
        int n = s.length();
        int t[][] = new int[n][n];
        for(int i=0;i<n;i++){
            t[i][i] = 0;
        }
        int l = 1;
        while(l<n){
            int i = 0;
            int j = l;
            while(i<n && j<n) {
                if (isPalindrome(s, i, j)) {
                    t[i][j] = 0;
                } else {
                    int min = n;
                    for (int k = i; k < j; k++) {
                        int x = t[i][k] + t[k + 1][j];
                        if (x < min) {
                            min = x;
                        }
                    }
                    t[i][j] = 1 + min;
                }
                i++;
                j++;
            }
         l++;
        }
        return t[0][n-1];
    }
    static  boolean isPalindrome(String str, int r, int t) {
        while(r < t) {
            if (str.charAt(r) != str.charAt(t)) {
                return false;
            }
            r++;
            t--;
        }
        return true;
    }
}
