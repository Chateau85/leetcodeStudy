package OldSources._206;

public class _206 {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);

		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;

		ListNode result = reverseList(l1);
		System.out.println(result);
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode newHead = reverseList(head.next);

		head.next.next = head;
		head.next = null;

		return newHead;

	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}