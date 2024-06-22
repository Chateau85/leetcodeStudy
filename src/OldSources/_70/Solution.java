package OldSources._70;

public class Solution {

	public static void main(String[] args) {
		// int n = 2;
		int n = 45;
		System.out.println(climbStairs(n));
	}

	private static int climbStairs(int n) {
		int[] arr = new int[n];
		if (n < 2)
			return 1;

		arr[0] = 1;
		arr[1] = 2;
		for (int i = 2; i < n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[n - 1];
	}

}
