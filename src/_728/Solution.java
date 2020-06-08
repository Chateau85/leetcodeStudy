package _728;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		int left = 1, right = 22;
		List<Integer> result = selfDividingNumbers(left, right);
		List<Integer> result2 = selfDividingNumbers2(left, right);
		System.out.println(result);
		System.out.println(result2);
	}

	private static List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new LinkedList<>();
		boolean isDivisible = false;
		while (left <= right) {
			char[] charArr = String.valueOf(left).toCharArray();

			for (int i = 0; i < charArr.length; i++) {
				if (charArr[i] - 48 == 0) {
					isDivisible = false;
					break;
				} else {
					if (left % Integer.valueOf(charArr[i] - 48) == 0) {
						isDivisible = true;
					} else {
						isDivisible = false;
						break;
					}
				}
			}
			if (isDivisible) {
				result.add(left);
			}
			left++;
		}
		return result;
	}

	private static List<Integer> selfDividingNumbers2(int left, int right) {
		List<Integer> output = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (isSelfDividingNumber(i)) {
				output.add(i);
			}
		}
		return output;
	}

	private static boolean isSelfDividingNumber(int num) {
		int n = num;
		while ((n % 10) != 0) {
			if (num % (n % 10) == 0) {
				n = n / 10;
			} else {
				return false;
			}
		}

		return n == 0;
	}
}
