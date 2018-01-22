
public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	private String value;
	
	public TreeNode(String first, String last) {
		this.value = first.toUpperCase().concat(last.toUpperCase());; 
	}
	
	public void insert(String first, String last) {
		String firstAndLast = first.toUpperCase().concat(last.toUpperCase());
		if (this.value.compareTo(firstAndLast) < 0) {
			if (left != null) {
				left.insert(first, last);
				System.out.println("1");
			}else {
				left = new TreeNode (first, last);
				System.out.println("2");
			}
		}else if (this.value.compareTo(firstAndLast) > 0) {
			if (right != null) {
				right.insert(first, last);
				System.out.println("3");
			}else {
				right = new TreeNode (first, last);
				System.out.println("4");
			}
		}else {
			this.value = firstAndLast;
			System.out.println("5");
		}
	}

	public TreeNode lookup(String first, String last) {
		String firstAndLast = first.toUpperCase().concat(last.toUpperCase());
		if (this.value.compareTo(firstAndLast) == 0) {
			System.out.println("Found " + this.value);
			return this;
		}
		if (this.value.compareTo(firstAndLast) < 0) {
			if (left == null) {
				System.out.println("not found");
			}else {
				return left.lookup(first, last);
			}
		}else {
			if(right == null) {
				System.out.println("not found");
			}else {
				return right.lookup(first, last);
			}
		}
		return null;
	}
	
	//getters and setters
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}