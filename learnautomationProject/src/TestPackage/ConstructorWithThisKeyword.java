package TestPackage;

public class ConstructorWithThisKeyword {

	
	//this keyword to initialize the global or class variable with the current value of constructor we use this keyword
	//Class variable or Global Variable:
	String name;
	int age;
	int rollnumber1;
	
	//2 parameter constructor
public ConstructorWithThisKeyword(String name,int age,int rollnumber) {
	this.name=name;//name global variable= name local variable
	this.age=age;//age global variable=age local variable
	rollnumber1=rollnumber;//can be done by setting different name in global and local variable without using this keyword
	System.out.println(name);
	System.out.println(age);
	System.out.println(rollnumber);
		
	}
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj= new ConstructorWithThisKeyword("Tom", 28,29);


	}

}
