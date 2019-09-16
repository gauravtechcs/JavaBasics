package TestPackage;

import javax.management.RuntimeErrorException;

public class FinallyConcept {
	
	//Its a reserved keyword
	//finally is a block
	//Always use with try catch block
	//finally-block always execute after try catch block
	//whatever exception is coming code under finally will surely run
	//It doesnot matter if exception come or not Finally block always execute
	//even after catching wrong exception,Finally block will work

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();//As method is Static can access directly
		//FinallyConcept.test1();//as Method is static also access by classname refrence
		test2();
		
		division();
	}
//concept 1:Use of finally-when exception is dere
	
	public static void test1() {//make it static so that access test1 method directly by name,classname refrence
		
		try {
			
			System.out.println("Inside test1 method");
			throw new RuntimeException( "test");//deliberately i am throwing some exception like Runtime
		}
		catch (Exception e) {//so try also have catch block-add the catch block also
			System.out.println("inside the catch block");
		}
			
		finally {  //It is a block
			
			
			System.out.println("Inside finally Block");
		}
		
	//Concept2:Use of finally-without Exception
		}
	
	//creating new method
	
	public static void test2() {
		try {
		System.out.println("Inside test2");
	}
		finally {
			System.out.println("finally code in test2 method--concept1");
		}
	}
	
		//Concept 3:Use of finally- Airthmetic exception
		
		public static void division() {
			
			
			int i=10;
			try {
				
				System.out.println("Inside try Block");
				int k=i/0;//cannot divide any value by 0-infinite cannot handle by zero
			}
			
			catch (ArithmeticException e) {//Airthmetic Exception as cannot divide value by 0
				//we know its airthmetic exception so catch as airthmetic exception
				System.out.println("Inside catch block");
				System.out.println("Divide by zero Error");
			}
			finally {
				
			
				System.out.println("Exececute this block even after the Exception");
				
			}
		}
		//Cocept4:Use of finally-when catching exception wrongly
			
		//Interview-If we catch the exception wrongly
	public static void division2() {
		
		int j=20;
		int l=j/0;
		try {
			System.out.println("Inside try block of Division2 Method");
		}
		catch (NullPointerException e) {//we know its Airthmetic exception but putting Null pointer exception
			System.out.println("Inside catch block with wrong exception");
			System.out.println("Divide by zero Error");
			// TODO: handle exception
		}
		finally {
			System.out.println("Execute even we are putting wrong catch");
		}
		
		//even after catching wrong exception,Finally block will work
		
	}
	//Real time Example of finally:
	//if  connected to database and its not retreiving data or some exception coming
	// & Inside finally block we have written closure connection code
	//So we need to close database always that can be carried out by putting closure code in Finally block
	

	
			
		}

