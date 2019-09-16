package LinkConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//If we want LinkedList of string,also can make of Integre
		LinkedList<String> ll=new LinkedList<String>();
//
		
		ll.add("Mohan");
		ll.add("Selenium");
		ll.add("qtp");
		ll.add("RTP");
		ll.add("RFT");
		//to print link list value
		System.out.println("Content of linked list" +ll);
		
		ll.addFirst("Gaurav");//to add any value in starting or at first Location
		System.out.println("Content of Linked List"+ ll);
		
		ll.addLast("Mummy");// to add value in Last
		System.out.println("Content of Linked List"+ ll);
		
		//to get the Values
		
		System.out.println(ll.get(0));//Index-0=Gaurav(as gaurav is in first element)
		
		ll.set(0, "TOM");//here now we changed Gaurav to TOm at first place
		
		System.out.println(ll.get(0));
		
		//Element remove at first and Last element
		ll.removeFirst();
		
	ll.removeLast();
	System.out.println("Content of linked list" +ll);
	
	//to Remove element at 2nd position
	
	ll.remove(2);//qtp removed
	System.out.println("Content of linked list" +ll);
	
		
	
	//how to print all values of linked List:
	//for loop
	
	System.out.println("Using For Loop");
	
	for(int n=0;n<ll.size();n++) {
		System.out.println(ll.get(n));
	}
	
	
	
	//Using Advance For loop:
	//Also called for each loop
	
	System.out.println("****Using Advanced For Loop***");
	for(String str:ll) {
		System.out.println(str);
	}
	
	//Using Iterator:
	
	System.out.println("****Using Iterator****");
	
	Iterator<String> it= ll.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	
	//while loop
	
	int num=0;
	while(ll.size()>num) {
		System.out.println("***Using While LOOP******");
		System.out.println(ll.get(num));
		num++;
	}
	
	
	
	}

}
