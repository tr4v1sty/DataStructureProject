public class TreeStructure {
	TreeNode root;
	
	
	public void insert(String first, String last) {
		if (root == null) {
			root = new TreeNode(first, last);
		}else {
			root.insert(first, last);
		}
	}
//    public Object get( String key )
//    {
//        return root == null ? null : root.get( key );
//    }
	
	public TreeNode lookup (String first, String last) {
		if (root == null) {
			System.out.println("not found");
		}else {
			return root.lookup(first, last);
		}
		return null;
	}
	
	
	//		TreeNode root = new TreeNode("");
//
//		TreeStructure(){	
//		}
//	
//	public void insert (String first, String last) {
//		String firstAndLast = first.toUpperCase().concat(last.toUpperCase());
//		if(root.value == "") {
//			root = new TreeNode(firstAndLast);
//			System.out.println("Successful");
//		}else if (firstAndLast.compareTo(root.value) == 0) {
//			System.out.println("This is a duplicate");
//		}else if (firstAndLast.compareTo(root.value) >= 0) {
//			if(root.right == null) {
//				root.right = new TreeNode(firstAndLast);
//				System.out.println("Successful2");
//			}else if (firstAndLast.compareTo(root.right.value) >= 0){
//				root.right.right = new TreeNode(firstAndLast);
//			}else if (firstAndLast.compareTo(root.right.value) <= 0){
//				root.right.left = new TreeNode(firstAndLast);
//			}
//		}else if (firstAndLast.compareTo(root.value) <= 0) {
//			if(root.left == null) {
//				root.left = new TreeNode(firstAndLast);
//				System.out.println("Successful3");
//			}else if (firstAndLast.compareTo(root.left.value) >= 0){
//				root.left.right = new TreeNode(firstAndLast);
//			}else if (firstAndLast.compareTo(root.left.value) <= 0){
//				root.left.left = new TreeNode(firstAndLast);
//			}
//		}
//	}
	
	
	
	
}