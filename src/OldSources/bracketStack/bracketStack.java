package OldSources.bracketStack;

import java.util.Stack;

public class bracketStack {

	public static void main(String[] args) {
		// String s = ")(";
		String s = "(() {)}()";
		System.out.println(bracketCheck(s));
	}

	private static boolean bracketCheck(String s) {
		if (s.charAt(0) == ')' || s.charAt(0) == '}') {
			return false;
		}

		Stack<Character> st = new Stack<>();
		int index = 0;
		while (true) {
			if (s.charAt(index) == '(' || s.charAt(index) == '{') {
				st.push(s.charAt(index));
			} else {
				if (st.isEmpty()) {
					return false;
				}
				if (s.charAt(index) == ')' && st.peek() == '(') {
					st.pop();
				} else if (s.charAt(index) == '}' && st.peek() == '{') {
					st.pop();
				} else {
					return false;
				}
			}
			index++;

			if (index == s.length()) {
				break;
			}
		}
		System.out.println();
		return true;
	}

}
