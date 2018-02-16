public class TreeStructure {
	TreeNode root;
	//tt - this is the insert function which calls to the recursive node insert function
	public void insert(String first, String last, String email, String phone) {
		if (root == null) {
			root = new TreeNode(first, last, email, phone);
		}else {
			root.insert(first, last, email, phone);
		}
	}
	//tt - this is the lookup function which calls to the recursive node lookup function
	public TreeNode lookup (String first, String last) {
		if (root == null) {
			System.out.println("not found");
		}else {
			return root.lookup(first, last);
		}
		return null;
	}
	//tt - this is the delete function which calls to the recursive node delete function
	public void delete(String first, String last) {
		String firstAndLast = first.toUpperCase().concat(last.toUpperCase());
		if (root == null) {
			System.out.println("not found to delete");
		}else {
			if (root.getValue() == firstAndLast) {
				root = null;
			}else {
				root.delete(firstAndLast, null);
			}
		}
	}
}