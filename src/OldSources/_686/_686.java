package OldSources._686;

public class _686 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "abcd";
		String B = "cdabcdab";
		System.out.println(repeatedStringMatch(A, B));
	}

	private static int repeatedStringMatch(String A, String B) {
		StringBuilder sbA = new StringBuilder();
		int aCount = 0;
		while (sbA.length() < B.length()) {
			sbA.append(A);
			aCount++;
		}
		if (sbA.toString().contains(B))
			return aCount;
		if (sbA.append(A).toString().contains(B))
			return ++aCount;

		return -1;
	}

}
