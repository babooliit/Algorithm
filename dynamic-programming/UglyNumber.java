
public class UglyNumber {
	static int getNthUglyNo(int n){
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		int nextUgly = 1;
		int nextMultipleOf2 = 2;
		int nextMultipleOf3 = 3;
		int nextMultipleOf5 = 5;
		int ugly[] = new int[n];
		ugly[0] = 1;
		
		for(int i=1;i<n;){
			nextUgly = Math.min(Math.min(nextMultipleOf2, nextMultipleOf3), nextMultipleOf5);
			ugly[i] = nextUgly;
			if(nextUgly == nextMultipleOf2){
				i2++;
				nextMultipleOf2 = ugly[i2]*2;
			}
			if(nextUgly == nextMultipleOf3){
				i3++;
				nextMultipleOf3 = ugly[i3]*3;
			}
			if(nextUgly == nextMultipleOf5){
				i5++;
				nextMultipleOf5 = ugly[i5]*5;
			}
			ugly[i++] = nextUgly;
		}
		return nextUgly;	
		
	}

	public static void main(String[] args) {
		
		int no = getNthUglyNo(150);
		System.out.println("150th Ugly Number is "+no);
		
	}

}
