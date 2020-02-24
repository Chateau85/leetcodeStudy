package _344;

public class _344 {

	public static void main(String[] args) {
		// char[] s = { 'h', 'e', 'l', 'l', 'o' };
		char[] s = { 'H', 'a', 'n', 'n', 'a', 'h' };
		reverseString(s);
	}

	private static void reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		while (true) {
			if (s.length % 2 == 0) {
				if (left > right) {
					break;
				}
			} else {
				if (left == right) {
					break;
				}
			}

			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left++;
			right--;

		}
	}

}
