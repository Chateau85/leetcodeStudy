package OldSources._561;

import java.util.Arrays;

public class _561 {

	public static void main(String[] args) {
		int[] nums = { 1, 4, 3, 2 };
		System.out.println(arrayPairSum(nums));
	}

	private static int arrayPairSum(int[] nums) {
		int size = nums.length;
		Arrays.sort(nums);

		int sum = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			if (i == size) {
				break;
			} else {
				sum += nums[i];
			}
		}
		return sum;
	}

}
