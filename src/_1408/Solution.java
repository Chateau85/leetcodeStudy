package _1408;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// String[] words = { "mass", "as", "hero", "superhero" };
		// String[] words = { "leetcode", "et", "code" };
		String[] words = { "blue", "green", "bu" };
		List<String> result = stringMatching(words);
	}

	private static List<String> stringMatching(String[] words) {
		HashSet<String> set = new HashSet();
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (words[i].length() < words[j].length()) {
					if (words[j].contains(words[i])) {
						set.add(words[i]);
					}
				}
			}
		}

		List<String> resultList = new LinkedList<>();
		resultList.addAll(set);
		return resultList;
	}

}
