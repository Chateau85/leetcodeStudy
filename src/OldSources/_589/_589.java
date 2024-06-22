package OldSources._589;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _589 {

	public static void main(String[] args) {
		Node root = new Node(1);
		preorder(root);
	}

	private static List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;

		Stack<Node> st = new Stack<>();
		st.add(root);

		while (!st.empty()) {
			root = st.pop();
			list.add(root.val);
			for (int i = root.children.size() - 1; i >= 0; i--) {
				st.add(root.children.get(i));
			}
		}
		return list;
	}
}

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
}