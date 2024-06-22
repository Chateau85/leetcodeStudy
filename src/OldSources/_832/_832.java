package OldSources._832;

public class _832 {

	public static void main(String[] args) {
		// int[][] A = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
		int[][] A = { { 1, 1, 0, 0 }, { 1, 0, 0, 1 }, { 0, 1, 1, 1 }, { 1, 0, 1, 0 } };

		flipAndInvertImage(A);
	}

	private static int[][] flipAndInvertImage(int[][] A) {
		int left = 0;
		int right = A.length - 1;
		int lines = 0;
		while (true) {
			int temp = A[lines][left];
			A[lines][left] = A[lines][right];
			A[lines][right] = temp;

			left++;
			right--;

			if (left > right) {
				lines++;
				left = 0;
				right = A.length - 1;
			}

			if (lines == A.length) {
				break;
			}
		}

		lines = 0;
		int index = 0;
		while (true) {
			if (A[lines][index] > 0) {
				A[lines][index]--;
			} else {
				A[lines][index]++;
			}
			index++;
			if (index == A[lines].length) {
				lines++;
				index = 0;
			}
			if (lines == A.length) {
				break;
			}
		}
		return A;
	}

}
