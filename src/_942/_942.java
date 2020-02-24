package _942;

public class _942 {

	public static void main(String[] args) {
		//String s = "IDID";
		//String s = "III";
		String s = "DDI";
		System.out.println(diStringMatch(s));
	}

	private static int[] diStringMatch(String S) {
		int[] result = new int[S.length() + 1];
		int increase = 0;
		int decrease = S.length();
		int i = 0;
		for (i = 0; i < S.length(); i++) {
			if (S.charAt(i) == 'I') {
				result[i] = increase++;
			} else {
				result[i] = decrease--;
			}
		}

		if (S.charAt(S.length() - 1) == 'I') {
			result[i] = increase;
		} else {
			result[i] = decrease;
		}
		return result;
	}

}
