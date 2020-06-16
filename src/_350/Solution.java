package _350;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
//		int[] nums1 = { 1, 2, 2, 1 };
//		int[] nums2 = { 2, 2 };
		int[] nums1 = { 4, 9, 5 };
		int[] nums2 = { 9, 4, 9, 8, 4 };

		System.out.println(intersect(nums1, nums2));
	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : nums1) {
			int freq = map.getOrDefault(i, 0);
			map.put(i, freq + 1);
		}
		List<Integer> list = new LinkedList<>();
		for (int i : nums2) {
			if (map.get(i) != null && map.get(i) > 0) {
				list.add(i);
				map.put(i, map.get(i) - 1);
			}
		}
		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
