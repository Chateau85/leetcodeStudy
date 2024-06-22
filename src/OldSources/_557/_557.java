package OldSources._557;

public class _557 {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		reverseWords(s);
	}

	private static String reverseWords(String s) {
		String[] temp = s.split(" ");
		String[] result = new String[temp.length];
		StringBuilder sb;
		for (int i = 0; i < temp.length; i++) {
			sb = new StringBuilder();
			result[i] = sb.append(temp[i]).reverse().toString();
		}
		sb = new StringBuilder();
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]);
			sb.append(" ");
		}
		String r = sb.toString();
		r = r.substring(0, r.length() - 1);
		return r;
	}

}
