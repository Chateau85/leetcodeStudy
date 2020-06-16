package _100;

public class Solution {

	public static void main(String[] args) {
		TreeNode first = new TreeNode(1);
		first.left = new TreeNode(2);
		first.right = new TreeNode(3);

		TreeNode second = new TreeNode(1);
		second.left = new TreeNode(2);
		second.right = new TreeNode(3);
		boolean result = isSameTree(first, second);
		System.out.println(result);
	}

	private static boolean isSameTree(TreeNode first, TreeNode second) {
		if (first != null && second != null) {
			return (first.val == second.val && isSameTree(first.left, second.left)
					&& isSameTree(first.right, second.right));
		} else if (first != null) {
			return false;
		} else if (second != null) {
			return false;
		}
		return true;
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}