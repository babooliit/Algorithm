
public class MaximumSizeSquareMatrixWithAll1s {
	/* Not Running */
	public static void main(String[] args) {

		int M[][] =  {{0, 1, 1, 0, 1},        		
				      {1, 1, 0, 1, 0},        
				      {0, 1, 1, 1, 0},        
				      {1, 1, 1, 1, 0},        
				      {1, 1, 1, 1, 1},        
				      {0, 0, 0, 0, 0}};
    
        System.out.println("The maximum size of Square matrix with all 1s is "+ maxSubSquare(M));
	}
	static int maxSubSquare(int [][] M){
		int rows = M.length;
		int coloumns = M[0].length;
		int[][] s = new int[rows][coloumns];
		s = M.clone();
		
		int max = 0;
		
		for(int i=1;i<rows;i++){
			for(int j=1;j<coloumns;j++){
				if(M[i][j] == 1){
					s[i][j] = Math.min(Math.min(s[i-1][j], s[i][j-1]), s[i-1][j-1])+1;
					if(s[i][j] > max){
						max = s[i][j];
					}
				}
				else{
					s[i][j] = 0;
				}
			}
		}
		return max;
		
	}

	

}
