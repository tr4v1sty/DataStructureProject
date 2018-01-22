public class TreeStructure {
	TreeNode root;
	
	public void insert(String first, String last) {
		if (root == null) {
			root = new TreeNode(first, last);
		}else {
			root.insert(first, last);
		}
	}

	public TreeNode lookup (String first, String last) {
		if (root == null) {
			System.out.println("not found");
		}else {
			return root.lookup(first, last);
		}
		return null;
	}

}