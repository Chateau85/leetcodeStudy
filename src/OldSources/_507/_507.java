package OldSources._507;

public class _507 {

	public static void main(String[] args) {
		// int num = 28;
		int num = 14;
		System.out.println(checkPerfectNumber(num));
	}

	private static boolean checkPerfectNumber(int num) {
		if (num == 1) {
			return false;
		}

		int sum = 0;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum += i + num / i;
			}
		}
		sum++;

		return sum == num;
	}

}
