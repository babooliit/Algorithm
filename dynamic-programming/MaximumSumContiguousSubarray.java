
public class MaximumSumContiguousSubarray {
	static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max = a[0];
        int t[] = new int[size];
        t = a.clone();
 
        for (int i = 1; i < size; i++)
        {
            t[i] = Math.max(t[i], t[i-1]+ a[i]);
            max = Math.max(max, t[i]);
        }
        return max;
    }

	public static void main(String[] args) {
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));

	}

}
