/**
 * Created by Hemant on 28-09-2016.
 */
public class LongestBitonicSubsequence {
    public static void main(String args[]){
        int a[] = {1, 11, 2, 10, 4, 5, 2, 1};
        int result = lBS(a);
        System.out.println("Length of LBS for a given String: "+result);
    }
    static int lBS(int [] a){
        int lis[] = new int[a.length];
        int lds[] = new int[a.length];
        int lbs[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            lis[i] = 1;
            lds[i] = 1;
        }
        for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i] > a[j]){
                    lis[i] = Math.max(lis[i],lis[j]+1);
                }
                if(a[i] < a[j]){
                    lds[i] = Math.max(lds[i],lds[j]+1);
                }
            }
        }
        int max = 0;
        for(int i=0;i<a.length;i++){
            lbs[i] = lis[i]+lds[i]-1;
            if(lbs[i] > max){
                max = lbs[i];
            }
        }
        return max;
    }
}
