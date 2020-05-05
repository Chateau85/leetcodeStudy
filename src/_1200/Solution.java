package _1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// int[] arr = { 4, 2, 1, 3 };
		// int[] arr = { 1, 3, 6, 10, 15 };
		int[] arr = { 3, 8, -10, 23, 19, -4, -14, 27 };
		List<List<Integer>> listList = minimumAbsDifference(arr);
	}

	private static List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		// [-14, -10, -4, 3, 8, 19, 23, 27]
		int minAbs = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length - 1; i++) {
			minAbs = Math.min(minAbs, arr[i + 1] - arr[i]);
		}

		List<List<Integer>> list = new ArrayList<List<Integer>>();

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i + 1] - arr[i] == minAbs) {
				list.add(Arrays.asList(arr[i], arr[i + 1]));
			}
		}

		return list;
	}

}
