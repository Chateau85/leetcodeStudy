package OldSources._1337;

import java.util.Arrays;
import java.util.Comparator;

public class _1337 {

	public static void main(String[] args) {
		int[][] mat = { { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 0 }, { 1, 0, 0, 0, 0 }, { 1, 1, 0, 0, 0 }, { 1, 1, 1, 1, 1 } };
		int k = 3;

		kWeakestRows(mat, k);
	}

	private static int[] kWeakestRows(int[][] mat, int k) {
		int[][] result = new int[mat.length][2];
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			count = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == 1) {
					count++;
				}
			}
			result[i][0] = i;
			result[i][1] = count;
		}
		Arrays.sort(result, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1], o2[1]);
			}
		});

		int[] arr = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = result[i][0];
		}
		return arr;
	}

}
