package _1422;

public class Solution {

	public static void main(String[] args) {
		String s = "01110111000";
		// String s = "00111";
		// String s = "1111";
		// String s = "00";
		// String s = "11";
		// String s = "01";
		// String s = "10";
		System.out.println(maxScore(s));
		System.out.println(maxScoreOthers(s));
	}

	private static int maxScore(String s) {
		String left, right;
		int leftZeroes = 0, rightOnes = 0;
		int maxValue = 0;
		for (int i = 1; i < s.length(); i++) {
			left = s.substring(0, i);
			right = s.substring(i, s.length());
			for (int j = 0; j < left.length(); j++) {
				if (left.charAt(j) == '0') {
					leftZeroes++;
				}
			}
			for (int j = 0; j < right.length(); j++) {
				if (right.charAt(j) == '1') {
					rightOnes++;
				}
			}
			if (maxValue < leftZeroes + rightOnes) {
				maxValue = leftZeroes + rightOnes;
			}
			leftZeroes = 0;
			rightOnes = 0;
		}
		return maxValue;
	}

	private static int maxScoreOthers(String s) {
		int leftZeroes = 0, rightOnes = 0, maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0')
				leftZeroes++;
			else
				rightOnes++;
			if (i != s.length() - 1)
				maxValue = Math.max(leftZeroes - rightOnes, maxValue);
		}
		return maxValue + rightOnes;
	}

}
