package _581;

import java.util.Arrays;

public class _581 {

	public static void main(String[] args) {
		int[] nums = { 2, 6, 4, 8, 10, 9, 15 };
		System.out.println(findUnsortedSubarray(nums));
	}

	private static int findUnsortedSubarray(int[] nums) {
		int n = nums.length;
		int[] compare = nums.clone();
		Arrays.sort(compare);

		int left = 0;
		while (left < n && nums[left] == compare[left]) {
			left++;
		}

		int right = nums.length - 1;
		while (right > left && nums[right] == compare[right]) {
			right--;
		}
		return right - left + 1;
	}

}
