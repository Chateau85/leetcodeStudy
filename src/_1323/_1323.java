package _1323;

public class _1323 {

	public static void main(String[] args) {
		System.out.println(maximum69Number(9669));
	}

	public static int maximum69Number(int num) {
		char[] arr = Integer.toString(num).toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '6') {
				arr[i] = '9';
				break;
			}
		}
		return Integer.parseInt(new String(arr));
	}
}
