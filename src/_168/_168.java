package _168;

public class _168 {

	public static void main(String[] args) {
		//int n = 1;
		// int n = 28;
		//int n = 701;
		// int n = 52;
		 int n = 703;
		System.out.println(convertToTitle(n));
	}

	private static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 0) {
			n--;
			sb.insert(0, (char) ('A' + n % 26));
			n /= 26;
		}
		return sb.toString();
	}

}
