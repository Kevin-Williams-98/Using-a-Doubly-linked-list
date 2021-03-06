package dll;

import java.util.NoSuchElementException;

public class Test {

	public static void main(String[] args) {
		
		
		DoubleLinkedList<Integer> dll = new DoubleLinkedList<Integer>();
		
		dll.addToRear(10);
		dll.addToRear(20);
		dll.addToRear(30);
		System.out.println(dll.toString());
		while(dll.size() > 0)
			System.out.println("removing from front " + dll.removeFromFront());
		
	
		
		try{
			dll.removeFromFront();
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("error removing from front" + ex.getMessage());
		}
		
		
		dll.addToFront(10);
		dll.addToFront(20);
		dll.addToFront(30);
		
	
		//
		System.out.println(dll);
		
		System.out.println("Reverse is :");
		System.out.println(dll.reverseString());
		System.out.println(dll);
		dll.removeFromRear();
		
		//System.out.println( "this is test " + dll.toString());
		
		System.out.println("Getting item at pos 1: " + dll.get(1));
		
		try{
			System.out.println("Getting item at pos 4: " + dll.get(4));
		}
		catch(NoSuchElementException ex)
		{
			System.out.println("error " + ex.getMessage());
		}
		
		System.out.println("Using iterator");
		
	

	}

}
