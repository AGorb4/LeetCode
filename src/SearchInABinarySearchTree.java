
public class SearchInABinarySearchTree {

	// Given the tree:
	// 4
	// / \
	// 2 7
	// / \
	// 1 3

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}

		@Override
		public String toString() {
			return "TreeNode [val=" + val + ", left=" + left + ", right=" + right + "]";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		System.out.println(searchBST(root, 2));

	}

	private static TreeNode searchBST(TreeNode root, int val) {

		if (root == null) {
			return null;
		}

		if (root.val == val) {
			return root;
		}

		if (root.val > val) {
			return searchBST(root.left, val);
		}
		if (root.val < val) {
			return searchBST(root.right, val);
		}
		
		return null;
	}

	private static TreeNode constructResultNode(TreeNode root) {
		TreeNode resultNode = new TreeNode(root.val);
		TreeNode leftNode = root.left != null ? new TreeNode(root.left.val) : null;
		TreeNode rightNode = root.right != null ? new TreeNode(root.right.val) : null;
		resultNode.left = leftNode;
		resultNode.right = rightNode;
		return resultNode;
	}

}
