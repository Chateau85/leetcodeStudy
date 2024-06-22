package OldSources._1295;

public class _1295 {

	public static void main(String[] args) {
		// int[] nums = { 12, 345, 2, 6, 7896 };
		int[] nums = { 555, 901, 482, 1771 };
		System.out.println(findNumbers(nums));
	}

	private static int findNumbers(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if ((nums[i] >= 10 && nums[i] <= 99) || (nums[i] >= 1000 && nums[i] <= 9999) || nums[i] == 100000) {
				count++;
			}
		}
		return count;
	}

}
