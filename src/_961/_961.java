package _961;

import java.util.HashSet;

public class _961 {

	public static void main(String[] args) {
		//int[] A = { 1, 2, 3, 3 };
		//int[] A = {2,1,2,5,3,2};
		int[] A = {5,1,5,2,5,3,5,4};
		System.out.println(repeatedNTimes(A));
	}

	private static int repeatedNTimes(int[] A) {
		int result = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (set.contains(A[i])) {
				result = A[i];
				break;
			} else {
				set.add(A[i]);
			}
		}
		return result;
	}

}
