package OldSources._700;

public class _700 {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.right.right = new TreeNode(3);

		System.out.println(searchBST(root, 2));

	}

	private static TreeNode searchBST(TreeNode root, int val) {
		if (root == null)
			return root;

		if (root.val == val) {
			return root;
		} else {
			if (val < root.val) {
				root = searchBST(root.left, val);
			} else {
				root = searchBST(root.right, val);
			}
		}
		return root;
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}