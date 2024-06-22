package OldSources._1417;

public class Solution {

	public static void main(String[] args) {
		// String s = "a0b1c2";
		// String s = "leetcode";
		// String s = "1229857369";
		// String s = "covid2019";
		// String s = "ab123";
		String s = "1";
		System.out.println(reformat(s));
	}

	private static String reformat(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}
		StringBuilder sbChar = new StringBuilder();
		StringBuilder sbNum = new StringBuilder();

		int charNumGap = 0;
		for (int i = 0; i < s.length(); i++) {
			if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
				charNumGap++;
				sbChar.append(s.charAt(i));
			} else {
				charNumGap--;
				sbNum.append(s.charAt(i));
			}
		}

		if (-1 <= charNumGap && charNumGap <= 1) {
			StringBuilder sbResult = new StringBuilder();
			int i;
			if (sbChar.length() > sbNum.length()) {
				for (i = 0; i < sbNum.length(); i++) {
					sbResult.append(sbChar.charAt(i)).append(sbNum.charAt(i));
				}
				sbResult.append(sbChar.charAt(i));
			} else if (sbChar.length() < sbNum.length()) {
				for (i = 0; i < sbChar.length(); i++) {
					sbResult.append(sbNum.charAt(i)).append(sbChar.charAt(i));
				}
				sbResult.append(sbNum.charAt(i));
			} else {
				for (i = 0; i < sbChar.length(); i++) {
					sbResult.append(sbNum.charAt(i)).append(sbChar.charAt(i));
				}
			}
			return sbResult.toString();
		} else {
			return "";
		}
	}

}
