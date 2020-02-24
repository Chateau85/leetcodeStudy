package _929;

import java.util.HashSet;

public class _929 {

	public static void main(String[] args) {
		// String[] emails = { "test.email+alex@leetcode.com",
		// "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com" };
		String[] emails = { "testemail@leetcode.com", "testemail1@leetcode.com", "testemail+david@lee.tcode.com" };
		numUniqueEmails(emails);
	}

	private static int numUniqueEmails(String[] emails) {
		String[] temp = new String[emails.length];
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < emails.length; i++) {
			int atIndex = emails[i].indexOf('@');
			if (emails[i].contains("+")) {
				int plusIndex = emails[i].indexOf('+');
				temp[i] = emails[i].substring(0, plusIndex);
			} else {
				temp[i] = emails[i].substring(0, atIndex);
			}
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < temp[i].length(); j++) {
				if (temp[i].charAt(j) != '.') {
					sb.append(temp[i].charAt(j));
				}
			}
			sb.append(emails[i].substring(atIndex, emails[i].length()));
			set.add(sb.toString());
		}
		return set.size();
	}

}
