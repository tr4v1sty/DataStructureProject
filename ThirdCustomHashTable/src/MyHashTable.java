
public class MyHashTable {
	
	 private final static int NUMBUCKET = 13;
	 
	 MyHashNode[] table;
	 
	 MyHashTable() {
		 table = new MyHashNode[NUMBUCKET];
		 
		 for (int x = 0; x <table.length;x++) {
			 table[x] = null;
//			 System.out.println(x);
		 }	 
	 }
	 
	 public void insertion(String first, String last, 
				String email, String phone) {
		 String firstAndLast = first.toUpperCase().concat(last.toUpperCase());
		 int hash = Math.abs((firstAndLast).hashCode());
		 if(table[hash%table.length] == null) {
			 table[hash%table.length] = new MyHashNode(first, last, email, phone);
			 
			 //Collision detection and resolution
		 }else if (table[hash%table.length] != null){
			 if (table[0] == null) {
				 table[0] = new MyHashNode(first, last, email, phone);
			 }else if (table[((hash+1)%table.length)] == null) {
			 table[((hash+1)%table.length)] = new MyHashNode(first, last, email, phone);
			 }else if (table[((hash+2)%table.length)] == null) {
				 table[((hash+2)%table.length)] = new MyHashNode(first, last, email, phone);
			 }else if (table[((hash+3)%table.length)] == null) {
				 table[((hash+3)%table.length)] = new MyHashNode(first, last, email, phone);
			 }else if (table[((hash+4)%table.length)] == null) {
				 table[((hash+4)%table.length)] = new MyHashNode(first, last, email, phone);
			 }else if (table[((hash+5)%table.length)] == null) {
				 table[((hash+5)%table.length)] = new MyHashNode(first, last, email, phone);
			 }else if (table[((hash+6)%table.length)] == null) {
				 table[((hash+6)%table.length)] = new MyHashNode(first, last, email, phone);
			 }else if (table[((hash+7)%table.length)] == null) {
				 table[((hash+7)%table.length)] = new MyHashNode(first, last, email, phone);
			 }else if (table[((hash+8)%table.length)] == null) {
				 table[((hash+8)%table.length)] = new MyHashNode(first, last, email, phone);
			 }
		 }
	 }
	 
	 public void printAll() {
		 for (MyHashNode x : table){
			 if(x != null) {
				 System.out.println(x.getFirstName());
			 }
		 }
	 }
	 
//	 public void deletion(String first, String last) {
//		 lookup
//	 }
	 
	 public MyHashNode lookup(String first, String last) {
		 String firstAndLast = first.toUpperCase().concat(last.toUpperCase());
		 int hash = Math.abs((firstAndLast).hashCode());
		 if(table[hash%table.length] != null) {
			 System.out.println("Lookup successful for " + table[hash%table.length].getFirstAndLast());
			 return table[(hash+8)%table.length];
		 }else if(table[((hash+1)%table.length)] != null){
			 return table[hash+8%table.length];
		 }else if(table[((hash+2)%table.length)] != null){
			 return table[hash+8%table.length];
		 }else if(table[((hash+3)%table.length)] != null){
			 return table[hash+8%table.length];
		 }else if(table[((hash+4)%table.length)] != null){
			 return table[hash+8%table.length];
		 }else if(table[((hash+5)%table.length)] != null){
			 return table[hash+8%table.length];
		 }else if(table[((hash+6)%table.length)] != null){
			 return table[hash+8%table.length];
		 }else if(table[((hash+7)%table.length)] != null){
			 return table[hash+7%table.length];
		 }else{
			 return table[hash+8%table.length];
		 }
	 }

}
