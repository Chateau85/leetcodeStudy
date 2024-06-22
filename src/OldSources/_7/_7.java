package OldSources._7;

public class _7 {

	public static void main(String[] args) {
		int x = 123;
		System.out.println(reverse(x));
	}

	private static int reverse(int x) {
		int result = 0;
		while (x != 0) {
			int tail = x % 10;
			int number = result * 10 + tail;
			if ((number - tail) / 10 != result) {
				return 0;
			}
			result = number;
			x /= 10;
		}
		return result;
	}

}
