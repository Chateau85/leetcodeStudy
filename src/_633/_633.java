package _633;

import java.util.HashSet;

public class _633 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int c = 5;
		// int c = 3;
		// int c = 1000;
		int c = 10000;
		System.out.println(judgeSquareSum(c));
	}

	private static boolean judgeSquareSum(int c) {
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i <= Math.sqrt(c); i++) {
			set.add(i * i);
			if (set.contains(c - i * i))
				return true;
		}
		return false;
	}

}