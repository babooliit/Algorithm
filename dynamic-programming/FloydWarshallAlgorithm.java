
public class FloydWarshallAlgorithm {
	static final int INF= 9999;
	public void floydWarshall(int[][] graph){
		int v = graph[0].length;
		int dist[][] = new int[v][v];
		dist = graph.clone();
		for(int k=0;k<v;k++){
			for(int i=0;i<v;i++){
				for(int j=0;j<v;j++){
					dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);					
				}
			}
		}
		printDistance(dist);
	}
	
	public void printDistance(int [][] dist){
		int v = dist.length;
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
				if(dist[i][j]!= INF){
					System.out.printf("%3d ",dist[i][j]);
				}
				else{
					System.out.print("INF ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		/* Let us create the following weighted graph
        10
     (0)------->(3)
     |         /|\
     5 |          |
     |          | 1
     \|/         |
     (1)------->(2)
        3           */
     int graph[][] = { {0,   5,  INF, 10},
                       {INF, 0,   3, INF},
                       {INF, INF, 0,   1},
                       {INF, INF, INF, 0}};
     FloydWarshallAlgorithm a = new FloydWarshallAlgorithm();

     // Print the solution
     a.floydWarshall(graph);

	}

}
