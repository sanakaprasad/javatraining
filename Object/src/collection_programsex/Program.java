package collection_programsex;

import java.util.LinkedList;
/**
 * 
 * @author Prasad
 * This is to demo the use of linkedlist form java.util.LinkedList
 */

public class Program {
public static void main(String[] args) {
	//Create linkedlist object
	LinkedList  LS = new LinkedList();
	//Add some test items
	LS.add(20);
	LS.add(60);
	LS.add("Hello");
	
	//Clear list
	LS.clear();

	//Add some real items
	LS.add("Koti");
	LS.add("Prasad");
	LS.add("Ratana");
	LS.add("Harika");
	System.out.println("LinkedList:"+LS);
	
	LinkedList myLS = (LinkedList) LS.clone();
	
	myLS.add("Java");
	
	System.out.println("Before New list:"+myLS);
	System.out.println("Removed an item:"+myLS.removeLast());
	System.out.println("After New list:"+myLS);

	
}
}