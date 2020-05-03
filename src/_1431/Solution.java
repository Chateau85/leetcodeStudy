package _1431;

import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// int[] candies = { 2, 3, 5, 1, 3 };
		// int extraCandies = 3;
		// int[] candies = { 4, 2, 1, 1, 2 };
		// int extraCandies = 1;
		// int[] candies = { 12, 1, 12 };
		// int extraCandies = 10;
		int[] candies = { 1, 1 };
		int extraCandies = 1;

		List<Boolean> outputs = kidsWithandies(candies, extraCandies);
		for (int i = 0; i < outputs.size(); i++) {
			System.out.print(outputs.get(i) + " ");
		}
	}

	private static List<Boolean> kidsWithandies(int[] candies, int extraCandies) {
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] > maxValue) {
				maxValue = candies[i];
			}
		}

		List<Boolean> list = new LinkedList<Boolean>();
		for (int i = 0; i < candies.length; i++) {
			if (candies[i] + extraCandies >= maxValue) {
				list.add(true);
			} else {
				list.add(false);
			}
		}
		return list;
	}

}
