import java.util.Arrays;

public class MinimumNumbersOfJumps {
	
	public static int minJumps(int [] a){
		int n = a.length;
		int t[] = new int[n];
		Arrays.fill(t, Integer.MAX_VALUE);
		t[0] = 0;
		for(int i=1;i<n;i++){
			int min = Integer.MAX_VALUE;
			for(int j=0;j<i;j++){
				if(j+a[j] >= i){
					if(t[j] < min){
						min = t[j];
					}
				}
			}
			t[i] = 1+ min;
		}
		return t[n-1];
	}

	public static void main (String[] args) {
		int arr[] = {2,3,1,1,2,4,2,0,1,1};
	    System.out.println("Minimum number of jumps to reach end is  "+ minJumps(arr));	    
	}

}

