package _1313;

public class _1313 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		decompressRLElist(nums);
	}

	private static int[] decompressRLElist(int[] nums) {
		int[] freq = new int[nums.length / 2];
		int[] val = new int[nums.length / 2];

		int freqIdx = 0;
		int valIdx = 0;
		int size = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				freq[freqIdx] = nums[i];
				freqIdx++;
				size += nums[i];
			} else {
				val[valIdx] = nums[i];
				valIdx++;
			}
		}

		int index = 0;
		int[] result = new int[size];
		int resultIndex = 0;
		while (true) {
			if (index == freq.length) {
				break;
			}
			for (int i = 0; i < freq[index]; i++) {
				result[resultIndex] = val[index];
				resultIndex++;
			}
			index++;
		}
		return result;
	}

}
