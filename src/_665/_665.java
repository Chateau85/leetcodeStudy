package _665;

public class _665 {

	public static void main(String[] args) {
		// int[] nums = { 4, 2, 3 };
		// int[] nums = { 4, 2, 1 };
		int[] nums = { 3, 4, 2, 3 };
		checkPossibility(nums);
	}

	private static boolean checkPossibility(int[] nums) {
		int cnt = 0;
		for (int i = 1; i < nums.length && cnt <= 1; i++) {
			if (nums[i - 1] > nums[i]) {
				cnt++;
				if (i - 2 < 0 || nums[i - 2] <= nums[i])
					nums[i - 1] = nums[i];
				else
					nums[i] = nums[i - 1];
			}
		}
		return cnt <= 1;
	}

}
