package javatutorials;

import java.util.ArrayList;

public class ArraylistConcepts {

	public static void main(String[] args) {
		
	//ArrayList we can add any kind of values in ArrayList	
//DisAdvantage  		
		
		
		ArrayList ar =new ArrayList();
		ar.add(100);  //Index=0 ///Add method used to add values like we use put in hashtables
		ar.add(400); // Index=1
		ar.add(500); //Index=2
		 System.out.println(ar.size());
		 ar.add(900); //Index=3
		 ar.add(800);// Index=4
	
		 System.out.println(ar.size());//Now size become 5
		 //No need to add size-It is Dynamic
		 //store value in for of Index

		 ar.add("Mohan");// Index=5
		 ar.add("Hello");// Index=6
		 ar.add("Maa");// Index=7
		 ar.add("Papa");// Index=8
		 ar.add(600);//index=9
		 
		 System.out.println(ar.size());
	 ar.remove(9);//Index 6 gets removed
		 
	 System.out.println(ar.size());//size will be 1 less as index 9 is removed
	 
		 //System.out.println(ar.get(9));//IndexOutOfBoundsException  as 9thIndex not exist
		 
		 for (int i=0;i<ar.size();i++) {
			 System.out.println("values of Array "+ar.get(i));
		 }
		 
		//If we want to restrict arraylist to make it as Integr or String 
		 ArrayList<Integer> ar1=new ArrayList<Integer>();
		 ar1.add(100);
 // ar1.add("M");//The method add(Integer) in the type ArrayList<Integer> is not applicable for the arguments (String)
		 
		ArrayList<String> ar2= new ArrayList<String>();
		 ar2.add("200");//Only string allowed as we restrict arraylist
		 
	}

}
