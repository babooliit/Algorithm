
public class RodCuttingProblem {
	 public static void main(String[] args){
		 int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
	     int size = arr.length;
	     System.out.println("Maximum Obtainable Value is "+
	                         cutRod(arr, size));
	 }
	 static int cutRod(int[] arr, int n){
		 int t[][] = new int[n][n+1];
		 for(int i=0;i<=n;i++){
			 t[0][i] = arr[0]*i;
		 }
		 
		 for(int i=1;i<n;i++){
			 for(int j=0;j<=n;j++){
				 if(j >= i+1){
					 t[i][j] = Math.max(t[i][j-(i+1)]+arr[i], t[i-1][j]);
				 }
				 else{
					 t[i][j] = t[i-1][j];
				 }
			 }
		 }
		 return t[n-1][n];
	 }

}
