package OldSources._709;

public class _709 {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(toLowerCase(str));
	}

	private static String toLowerCase(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] + 32);
			}
		}
		return new String(arr);
	}

}
