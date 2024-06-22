package OldSources._1021;

public class _1021 {

	public static void main(String[] args) {
//		String s = "(()())(())";
//		String result = "()()()";
		String s = "(()())(())(()(()))";
		String result = "()()()()(())";
		System.out.println(result.equals(ermoveOuterParentheses(s)));
	}

	private static String ermoveOuterParentheses(String s) {
		StringBuilder sb = new StringBuilder();
		int outerRemoved = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' && outerRemoved++ > 0)
				sb.append(s.charAt(i));
			if (s.charAt(i) == ')' && outerRemoved-- > 1)
				sb.append(s.charAt(i));
		}

		return sb.toString();
	}

}
