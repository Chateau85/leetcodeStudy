package _83;

import java.util.HashSet;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		ListNode result = deleteDuplicates(head);
		while (result != null) {
			System.out.print(result.val + " ");
			result = result.next;
		}
	}

	public static ListNode deleteDuplicates(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode curr = head;
		ListNode chead = curr;
		while (curr.next != null) {
			if (curr.val == curr.next.val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return chead;
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}