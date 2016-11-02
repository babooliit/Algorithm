
public class PartitionProblem {
	public static boolean findPartition(int[] a){
		int n = a.length;
		int sum = 0;
		for(int i=0;i<n;i++){
			sum += a[i];
		}
		if(sum%2 != 0){
			return false;
		}
		
		boolean t[][] = new boolean[n][sum/2+1];
		for(int i=1;i<=sum/2;i++){
			if(a[i] != i){
				t[0][i] = false;
			}
			else{
				t[0][i] = true;
			}
		}
		t[0][0] = true;
		for(int i=1;i<n;i++){
			for(int j=0;j<=sum/2;j++){
				if(a[i] > j){
					t[i][j] = t[i-1][j];
				}
				else{
					t[i][j] = t[i-1][j] || t[i-1][j-a[i]];
				}
			}
		}
		return t[n-1][sum/2];		
	}

	public static void main(String[] args) {
		int arr[] = {3, 1, 1, 2, 2,1};
        int n = arr.length;
        if (findPartition(arr) == true)
            System.out.println("Can be divided into two subsets of equal sum");
        else
            System.out.println("Can not be divided into two subsets of equal sum");
	}

}
