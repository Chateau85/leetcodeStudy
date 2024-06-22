package OldSources;

import java.util.LinkedList;
import java.util.Stack;

public class Test1 {

	public static void main(String[] args) {
		int[] A = { 1, 4, -1, 3, 2 };
		// int[] A = { 0, 0, 0, 0, 0 };
		// int[] A = { -1 };
		System.out.println(solution(A));

		String s = "13 DUP 4 POP 5 DUP + DUP + -";
		// String s = "5 6 + -";
		// String s = "3 DUP 5 - -";
		// String s = "POP";
		System.out.println(solution2(s));

		int N = 11;
		System.out.println(solution3(N));
	}

	private static int solution(int[] a) {
		LinkedList<Node> list = new LinkedList<>();
		for (int i = 0; i < a.length; i++) {
			Node node = new Node(a[i], false);
			list.add(node);
		}

		int length = 1;
		int index = a[0];
		while (true) {
			Node n = list.get(index);
			index = n.value;
			length++;
			if (index == -1) {
				break;
			}
		}
		return length;
		/*
		 * LinkedList<OldSources.Node> list = new LinkedList<>(); for (int i = 0; i < A.length;
		 * i++) { OldSources.Node node = new OldSources.Node(A[i], false); list.add(node); }
		 * 
		 * boolean isVisitedNode = false; int start = A[0]; int value = 0; while
		 * (!isVisitedNode) { OldSources.Node n = list.get(start); if (!n.visited) { n.visited =
		 * true; } else { isVisitedNode = true; value = n.value; } } return value;
		 */
	}

	private static int solution3(int N) {
		if (0 <= N && N <= 1000) {
			long result = calcRecursive(11, N);
			int[] arr = new int[10];
			while (result != 0) {
				arr[(int) (result % 10)]++;
				result = result / 10;
			}
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0)
					count++;
			}
			return count;
		} else {
			return -1;
		}
	}

	private static long calcRecursive(int i, int n) {
		if (n == 0) {
			return 1;
		} else {
			long t = calcRecursive(i, n / 2);
			if (n % 2 == 0)
				return t * t;
			else
				return t * t * i;
		}

	}

	private static int solution2(String S) {
		String[] strArr = S.split(" ");
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equalsIgnoreCase("dup")) {
				if (st.size() > 0) {
					st.push(st.peek());
				} else {
					return -1;
				}
			} else if (strArr[i].equals("+")) {
				if (st.size() > 1) {
					int temp1 = st.pop();
					int temp2 = st.pop();
					st.push(temp1 + temp2);
				} else {
					return -1;
				}
			} else if (strArr[i].equals("-")) {
				if (st.size() > 1) {
					int temp1 = st.pop();
					int temp2 = st.pop();
					st.push(temp1 - temp2);
				} else {
					return -1;
				}
			} else if (strArr[i].equalsIgnoreCase("pop")) {
				if (st.size() > 0) {
					st.pop();
				} else {
					return -1;
				}
			} else if (0 <= Integer.parseInt(strArr[i]) && Integer.parseInt(strArr[i]) <= 2000) {
				st.push(Integer.parseInt(strArr[i]));
			} else {
				return -1;
			}
		}
		return st.pop();
	}

}

class Node {
	int value;
	boolean visited;

	public Node(int value, boolean visited) {
		this.value = value;
		this.visited = visited;
	}

}