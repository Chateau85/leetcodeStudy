package OldSources._905;

public class _905 {

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 4 };
		sortArrayByParity(A);
	}

	private static int[] sortArrayByParity(int[] A) {
		int count = A.length;
		int[] result = new int[count];
		int index = 0;
		int evenIndex = 0;
		int oddIndex = 0;
		while (true) {
			if (A[index] % 2 == 0) {
				result[evenIndex] = A[index];
				evenIndex++;
				index++;
			} else {
				index++;
			}

			if (index == count) {
				break;
			}
		}

		index = 0;
		oddIndex = evenIndex;
		while (true) {
			if (A[index] % 2 == 1) {
				result[oddIndex] = A[index];
				oddIndex++;
				index++;
			} else {
				index++;
			}

			if (index == count) {
				break;
			}
		}
		return result;
	}

}
