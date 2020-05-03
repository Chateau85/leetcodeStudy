package _475;

public class _475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] houses = { 1, 2, 3 }, heaters = { 2 };
		int[] houses = { 1, 2, 3, 4 }, heaters = { 1, 4 };
		System.out.println(findRadius(houses, heaters));
	}

	private static int findRadius(int[] houses, int[] heaters) {
		int left = 0;
		int right = houses.length - 1;
		int index = 0;
		while (true) {
			if (houses[left] != heaters[index]) {
				left++;
			}
			if (houses[right] != heaters[index]) {
				right--;
			}

			if (left == right) {
				index++;
			}

			if (index == heaters.length) {
				break;
			}
		}
		return 0;
	}

}
