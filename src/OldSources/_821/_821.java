package OldSources._821;

import java.util.Arrays;

public class _821 {

	public static void main(String[] args) {
		String S = "loveleetcode";
		char C = 'e';

		shortestToChar(S, C);
	}

	private static int[] shortestToChar(String S, char C) {
		if (S == null) {
			return new int[0];
		}
		int[] result = new int[S.length()];
		Arrays.fill(result, S.length());
		int lastSeen = -1;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == C) {
				lastSeen = i;
			}
			if (lastSeen != -1)
				result[i] = Math.abs(i - lastSeen);
		}

		for (int i = S.length() - 1; i >= 0; i--) {
			if (S.charAt(i) == C) {
				lastSeen = i;
			}
			if (lastSeen != -1)
				result[i] = Math.min(result[i], Math.abs(i - lastSeen));
		}
		return result;
	}

}
