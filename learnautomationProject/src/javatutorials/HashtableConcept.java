package javatutorials;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hashtable h=new Hashtable();
		
		h.put("A","Test");
		h.put("B","Hello")	;
		h.put("C","World");
		System.out.println(h.size());//Size will be 3
		
		h.put(2,200);
		h.put(3, 400);
		System.out.println(h.size());
		System.out.println(h.get("A"));//To get value available at particular key
		System.out.println(h.get("C"));//Value is World at key 'C'
		
		h.put(3, "Tom");
		System.out.println(h.get(3));
		
		//To restrict the Key value pair like Integer,String:
		
		Hashtable <Integer, String> h1=new Hashtable <Integer,String> ();
		h1.put(10, "Mohan");
		System.out.println(h1.get(10));
		
	}

}
