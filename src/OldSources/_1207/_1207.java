package OldSources._1207;

import java.util.HashSet;
import java.util.Iterator;

public class _1207 {

	public static void main(String[] args) {
		//int[] arr = { 1, 2, 2, 1, 1, 3 };
		//int[] arr = {1,2};
		int[] arr = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
		System.out.println(uniqueOccurrences(arr));
	}

	private static boolean uniqueOccurrences(int[] arr) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		int[] result = new int[set.size()];
		int index = 0;
		for (Iterator<Integer> it = set.iterator(); it.hasNext();) {
			result[index] = it.next();
			index++;
		}

		int[] count = new int[set.size()];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (arr[i] == result[j]) {
					count[j]++;
				}
			}
		}
		set.clear();
		for (int i = 0; i < count.length; i++) {
			if (set.contains(count[i])) {
				return false;
			}
			set.add(count[i]);
		}
		return true;
	}

}
