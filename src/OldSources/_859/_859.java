package OldSources._859;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _859 {

	public static void main(String[] args) {
		// String A = "ab"; String B = "ba";
		// String A = "ab", B = "ab";
		// String A = "aa", B = "aa";
		String A = "aaaaaaabc", B = "aaaaaaacb";
		// String A = "abcd", B = "badc";
		// String A = "ab", B = "ba";

		boolean bool = buddyStrings(A, B);
		System.out.println(bool);
	}

	private static boolean buddyStrings(String A, String B) {
		if (A.length() != B.length())
			return false;

		if (A.equals(B)) {
			Set<Character> s = new HashSet<Character>();
			for (char c : A.toCharArray()) {
				s.add(c);
			}
			return s.size() < A.length();
		}

		List<Integer> dif = new ArrayList<Integer>();
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				dif.add(i);
			}
		}
		return dif.size() == 2 && A.charAt(dif.get(0)) == B.charAt(dif.get(1))
				&& A.charAt(dif.get(1)) == B.charAt(dif.get(0));
	}

}
