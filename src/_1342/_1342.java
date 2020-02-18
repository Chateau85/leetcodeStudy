package _1342;

public class _1342 {

	public static void main(String[] args) {
		//int num = 14;
		//int num = 8;
		int num = 123;
		System.out.println(numberOfSteps(num));
	}

	private static int numberOfSteps(int num) {
		int count = 0;
		while (true) {
			if (num % 2 == 0) {
				num = num / 2;
			} else {
				num = num - 1;
			}
			count++;

			if (num == 0) {
				break;
			}
		}
		return count;
	}

}
