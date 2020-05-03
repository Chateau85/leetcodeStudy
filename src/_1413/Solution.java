package _1413;

public class Solution {

	public static void main(String[] args) {
		int[] nums = { -3, 2, -3, 4, 2 };
		System.out.println(minStartValue(nums));
	}

	private static int minStartValue(int[] nums) {
		int minimumSum = nums[0];

		int left = 0, right = 0;
		int sum = nums[0];
		while (true) {
			sum = Math.min(minimumSum, minimumSum + nums[right]);
			if (sum > minimumSum) {
				minimumSum = sum;
			}
			right++;
			if (right == nums.length) {
				left++;
				right = 0;
			}

			if (left == nums.length) {
				break;
			}
		}
		return minimumSum;
	}

}
