
public class FibonacciNumbers {
	
	static long fib(int n){
		long t[] = new long[n+1];
		t[0] = 0;
		t[1] = 1;
		for(int i=2;i<=n;i++){
			t[i] = t[i-1]+t[i-2];
		}
		return t[n];
		
	}

	public static void main(String[] args) {
		int n = 9;
		System.out.println(fib(n));

	}

}
