package OldSources._804;

import java.util.HashSet;

public class _804 {

	public static void main(String[] args) {
		String[] words = { "gin", "zen", "gig", "msg" };
		System.out.println(uniqueMorseRepresentations(words));
	}

	private static int uniqueMorseRepresentations(String[] words) {
		String[] arr = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
				"-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

		HashSet<String> set = new HashSet<String>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words[i].length(); j++) {
				sb.append(arr[words[i].charAt(j) - 97]);
			}
			set.add(sb.toString());
			sb.setLength(0);
		}
		return set.size();
	}

}
