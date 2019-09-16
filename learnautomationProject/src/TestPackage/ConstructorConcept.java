package TestPackage;

public class ConstructorConcept {

	
	//Define some class feature while creating an objects in the form of global variables-we use constructor
	//Looks like a function but not a function
	//name should be same as classname
	//cannot return any value,No void,no static,No return statement
	//Default Constructor"--means with zero Parameter
	//Always hidden constructor is always there-Default Constructor
	
	//constructor always point to the current state of Object
	public ConstructorConcept() {  //Constructor Created-This is default constructor
		
		System.out.println("Default constructor");
		
		
	}
	//Single parameter Constructor:
	public ConstructorConcept(int i) {
		System.out.println("Single parameter constructore");
		System.out.println("The value of i is " +i);
	}
	//Constructor Overloading:same constructor name with multiple parameter
	
	//Double parameter Constructor:
		public ConstructorConcept(int i,int j) {
			System.out.println("Two parameter constructore");
			System.out.println("The value of j is" +j);
		}
	
	//moment  we create an object constructor get called automatically
 
	
	
	public static void main(String[] args) {
		ConstructorConcept obj=new ConstructorConcept();//here default constructor is called
		
		// to call single parameter constructor:
		ConstructorConcept obj1=new ConstructorConcept(10);
		
		//to call two parmeter constructor:
		
		ConstructorConcept obj2=new ConstructorConcept(10,20);

}
}