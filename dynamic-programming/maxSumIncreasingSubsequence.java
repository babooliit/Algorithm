/**
 * Created by Hemant on 28-09-2016.
 */
public class maxSumIS {
    public static void main(String[] args){
        int a[] = {1,101,2,3,100,4,5};
        int result = MSIS(a);
        System.out.println("Maximum sum of increasing subsequence in given array is: "+result);

    }

    static int MSIS(int a[]){
        int sum[] = new int[a.length];
        sum = a.clone();
        for(int i=1;i<a.length;i++){
            for(int j=0;j<i;j++){
                if((a[i] > a[j]) && (sum[i] < sum[j]+a[i])){
                    sum[i] = sum[j]+a[i];
                }
            }
        }
        int max = 0;
        for(int x: sum){
            if(x>max){
                max = x;
            }
        }
        return max;
    }

}
