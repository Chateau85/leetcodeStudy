package OldSources._414;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _414 {

	public static void main(String[] args) {
		// int[] nums = { 3, 2, 1 };
		// int[] nums = { 2, 2, 3, 1 };
		// int[] nums = { 1, 1, 2 };
		// int[] nums = { 1, 1, 1 };
		int[] nums = { 1, 2, 2, 5, 3, 5 };
		System.out.println(thirdMax(nums));
	}

	private static int thirdMax(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		List<Integer> list = new ArrayList<Integer>();
		for (int num : nums) {
			if (!list.contains(num)) {
				list.add(num);
			}
		}

		if (list.size() == 2) {
			return Math.max(list.get(0), list.get(1));
		} else if (list.size() == 1) {
			return list.get(0);
		}

		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1 < o2 ? 1 : -1;
			}
		});

		return list.get(2);
	}

}
