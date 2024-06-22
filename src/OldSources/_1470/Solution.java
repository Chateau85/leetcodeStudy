package OldSources._1470;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 2, 5, 1, 3, 4, 7 };
		int n = 3;
		System.out.println(shuffle(nums, n));
	}

	private static int[] shuffle(int[] nums, int n) {
		int[] x = new int[n];
		int[] y = new int[n];
		int[] result = new int[2 * n];
		int xIndex = 0;
		int yIndex = 0;
		for (int i = 0; i < nums.length / 2; i++) {
			x[xIndex] = nums[i];
			xIndex++;
		}
		for (int i = nums.length / 2; i < nums.length; i++) {
			y[yIndex] = nums[i];
			yIndex++;
		}
		int resultIndex = 0;
		for (int i = 0; i < n; i++) {
			result[resultIndex++] = x[i];
			result[resultIndex++] = y[i];
		}
		System.out.println();
		return null;
	}

}
