package _977;

import java.util.Arrays;

public class _977 {

	public static void main(String[] args) {
		int[] A = { -4, -1, 0, 3, 10 };
		sortedSquares(A);
	}

	private static void sortedSquares(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.pow(A[i], 2);
		}

		Arrays.sort(A);

		System.out.println();
	}

}
