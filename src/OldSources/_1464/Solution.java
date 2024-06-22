package OldSources._1464;

public class Solution {

	public static void main(String[] args) {
		// int[] nums = { 3, 4, 5, 2 };
		// int[] nums = { 1, 5, 4, 5 };
		int[] nums = { 3, 7 };
		System.out.println(maxProduct(nums));
	}

	private static int maxProduct(int[] nums) {
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				max = Math.max(max, (nums[i] - 1) * (nums[j] - 1));
			}
		}
		return max;
	}

}
