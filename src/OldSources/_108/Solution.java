package OldSources._108;

public class Solution {

	public static void main(String[] args) {
		int[] nums = { -10, -3, 0, 5, 9 };
		sortedArrayToBST(nums);
		System.out.println();
	}

	private static TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0) {
			return null;
		}
		return getTreeNode(nums, 0, nums.length - 1);
	}

	private static TreeNode getTreeNode(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		int middle = start + (end - start) / 2;
		TreeNode n = new TreeNode(nums[middle]);
		n.left = getTreeNode(nums, start, middle - 1);
		n.right = getTreeNode(nums, middle + 1, end);
		return n;
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