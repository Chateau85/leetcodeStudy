package _1290;

public class _1290 {

	public static void main(String[] args) {
		ListNode n = new ListNode(1);
		n.next = new ListNode(0);
		n.next.next = new ListNode(1);

		int result = getDecimalValue(n);
		System.out.println(result);
	}

	private static int getDecimalValue(ListNode head) {
		int ans = 0;
		while (head != null) {
			ans = (ans << 1) | head.val;
			head = head.next;
		}
		return ans;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}