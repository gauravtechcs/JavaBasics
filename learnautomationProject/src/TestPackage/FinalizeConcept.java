package TestPackage;

public class FinalizeConcept {
	
	public void finalize() {
		
		System.out.println("Finalize method");
	}

	public static void main(String[] args) {
		
//finialize keyword is used to cleanup processing of object
		//finalize is a method
		//just  befre garbage collectore finalize method will be called automatically for cleaning
		
		FinalizeConcept f1=new FinalizeConcept();
		FinalizeConcept f2=new FinalizeConcept();
		
		f1=null;//we creating blank object-no one refeering these objects
		f2=null;//we creating blank object-no one refeering these objects
		//In this case garbage collector will come & it destroy these objects just like in  C++ we have destructor
		
		//if no object refrence is there gaarbage collector eill be called to free space in memory

	System.gc();//this method will call Garbage collectore
	System.out.println("garbage collector called");
	}

}
