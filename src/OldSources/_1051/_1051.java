package OldSources._1051;

import java.util.Arrays;

public class _1051 {

	public static void main(String[] args) {
		int[] heights = { 1, 1, 4, 2, 1, 3 };
		System.out.println(hightChecker(heights));
	}

	private static int hightChecker(int[] heights) {
		int[] compare = heights.clone();
		Arrays.sort(compare);

		int count = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != compare[i]) {
				count++;
			}
		}
		return count;
	}

}
