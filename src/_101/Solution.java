package _101;

public class Solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);

		System.out.println(isSymmetric(root));
	}

	private static boolean isSymmetric(TreeNode root) {
		return root == null || isSymmetricCheck(root.left, root.right);
	}

	private static boolean isSymmetricCheck(TreeNode left, TreeNode right) {
		if (left == null || right == null) {
			return left == right;
		}
		if (left.val != right.val) {
			return false;
		}
		return isSymmetricCheck(left.left, right.right) && isSymmetricCheck(left.right, right.left);
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