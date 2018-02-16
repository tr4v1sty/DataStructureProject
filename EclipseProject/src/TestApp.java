public class TestApp {

	public static void main(String[] args) {

		System.out.println("TESTING THE TREE DATA STRUCTURE BELOW");
		System.out.println();
		
		TreeStructure myTS = new TreeStructure();
		myTS.insert("Bob", "Smith", "bsmith@somewhere.com" , "555-235-1111");
		myTS.insert("Jane", "Williams", "jw@something.com" , "555-235-1112");
		myTS.insert("Mohammed", "al-Salam", "mas@someplace.com" , "555-235-1113");
		myTS.insert("Pat", "Jones", "pjones@homesweethome.com" , "555-235-1114");
		myTS.insert("Billy", "Kidd", "billy_the_kid@nowhere.com" , "555-235-1115");
		myTS.insert("H.", "Houdini", "houdini@noplace.com" , "555-235-1116");
		myTS.insert("Jack", "Jones", "jjones@hill.com" , "555-235-1117");
		myTS.insert("Jill", "Jones", "jillj@hill.com" , "555-235-1118");
		myTS.insert("John", "Doe", "jdoe@somedomain.com" , "555-235-1119");
		myTS.insert("Jane", "Doe", "jdoe@somedomain.com" , "555-235-1120");
		myTS.lookup("Pat", "Jones");
		myTS.lookup("Billy", "Kidd");
		myTS.delete("John", "Doe");
		myTS.insert("Test", "Case", "Test_Case@testcase.com" , "555-235-1121");
		myTS.insert("Nadezhda", "Kanachekhovskaya", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru" , "555-235-1122");
		myTS.insert("Jo", "Wu", "wu@h.com" , "555-235-1123");
		myTS.insert("Millard", "Fillmore", "millard@theactualwhitehouse.us" , "555-235-1124");
		myTS.insert("Bob", "vanDyke", "vandyke@nodomain.com" , "555-235-1125");
		myTS.insert("Upside", "Down", "upsidedown@rigTSsideup.com" , "555-235-1126");
		myTS.lookup("Jack", "Jones");
		myTS.lookup("Nadezhda", "Kanachekhovskaya");
		myTS.delete("Jill", "Jones");
		myTS.delete("John", "Doe");
		myTS.lookup("Jill", "Jones");
		myTS.lookup("John", "Doe");
		
		System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
		System.out.println();System.out.println();System.out.println();System.out.println("TESTING THE HASH TABLE DATA STRUCTURE BELOW");
		System.out.println();
		
		MyHashTable myHT = new MyHashTable();
		myHT.insertion("Bob", "Smith", "bsmith@somewhere.com" , "555-235-1111");
		myHT.insertion("Jane", "Williams", "jw@something.com" , "555-235-1112");
		myHT.insertion("Mohammed", "al-Salam", "mas@someplace.com" , "555-235-1113");
		myHT.insertion("Pat", "Jones", "pjones@homesweethome.com" , "555-235-1114");
		myHT.insertion("Billy", "Kidd", "billy_the_kid@nowhere.com" , "555-235-1115");
		myHT.insertion("H.", "Houdini", "houdini@noplace.com" , "555-235-1116");
		myHT.insertion("Jack", "Jones", "jjones@hill.com" , "555-235-1117");
		myHT.insertion("Jill", "Jones", "jillj@hill.com" , "555-235-1118");
		myHT.insertion("John", "Doe", "jdoe@somedomain.com" , "555-235-1119");
		myHT.insertion("Jane", "Doe", "jdoe@somedomain.com" , "555-235-1120");
		myHT.lookup("Pat", "Jones");
		myHT.lookup("Billy", "Kidd");
		myHT.deletion("John", "Doe");
		myHT.insertion("Test", "Case", "Test_Case@testcase.com" , "555-235-1121");
		myHT.insertion("Nadezhda", "Kanachekhovskaya", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru" , "555-235-1122");
		myHT.insertion("Jo", "Wu", "wu@h.com" , "555-235-1123");
		myHT.insertion("Millard", "Fillmore", "millard@theactualwhitehouse.us" , "555-235-1124");
		myHT.insertion("Bob", "vanDyke", "vandyke@nodomain.com" , "555-235-1125");
		myHT.insertion("Upside", "Down", "upsidedown@rightsideup.com" , "555-235-1126");
		myHT.lookup("Jack", "Jones");
		myHT.lookup("Nadezhda", "Kanachekhovskaya");
		myHT.deletion("Jill", "Jones");
		myHT.deletion("John", "Doe");
		myHT.lookup("Jill", "Jones");
		myHT.lookup("John", "Doe");
	}
}
