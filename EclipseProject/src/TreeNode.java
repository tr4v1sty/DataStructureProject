
public class TreeNode {
	
	private TreeNode left;
	private TreeNode right;
	private String value;
	private String emailAddress;
	private String phoneNumber;
	//tt - constructor for the TreeNode
	public TreeNode(String first, String last, String email, String phone) {
		this.value = first.toUpperCase().concat(last.toUpperCase());
		this.emailAddress =  email;
		this.phoneNumber = phone;
	}
	//tt - this looks up the most left aka min value
	public String minValue() {
		if (left == null) {
			return value;
		}else {
			return left.minValue();
		}
	}
	//tt - this is the delete function which is recursive
	public void delete(String value, TreeNode parent) {
		if (this.value.compareTo(value) < 0) {
			if (left != null) {
				left.delete(value, this);
			}else {
				System.out.println("Not found for delete");
			}
		}else if (this.value.compareTo(value) > 0) {
			if (right != null) {
				right.delete(value, this);
			}else {
				System.out.println(value + " was not found for delete");
			}
		}else {
			if (left != null && right != null) {
				this.value = right.minValue();
				right.delete(this.value, this);
			}else if(parent.left == this) {
				parent.left = (left != null) ? left : right;
			}else if (parent.right == this) {
				parent.right = (left != null) ? left : right;
			}
		}
	}
	//tt - this is the insert function which is recursive
	public void insert(String first, String last, String email, String phone) {
		String firstAndLast = first.toUpperCase().concat(last.toUpperCase());
		if (this.value.compareTo(firstAndLast) < 0) {
			if (left != null) {
				left.insert(first, last, email, phone);
			}else {
				left = new TreeNode (first, last, email, phone);
			}
		}else if (this.value.compareTo(firstAndLast) > 0) {
			if (right != null) {
				right.insert(first, last, email, phone);
			}else {
				right = new TreeNode (first, last, email, phone);
			}
		}else {
			this.value = firstAndLast;
		}
	}
	//tt - this is the lookup function which is recursive
	public TreeNode lookup(String first, String last) {
		String firstAndLast = first.toUpperCase().concat(last.toUpperCase());
		if (this.value.compareTo(firstAndLast) == 0) {
			System.out.println("Found " + this.value);
			return this;
		}
		if (this.value.compareTo(firstAndLast) < 0) {
			if (left == null) {
				System.out.println(firstAndLast + " was not found");
			}else {
				return left.lookup(first, last);
			}
		}else {
			if(right == null) {
				System.out.println(firstAndLast + " was not found");
			}else {
				return right.lookup(first, last);
			}
		}
		return null;
	}
	
	//tt - getters and setters
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