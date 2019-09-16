package TestPackage;

public class B extends A{
	
	// default constructor
	public B() {
		//super(10);//used to call parent class constructor-which we want to call specically
		super(10,20);//at once we can can have only 1 super statement
		System.out.println("Child class Constructor");
	}
	
	public static void main(String[] args) {
		
		B obj=new B();
		
		//Before coming in B constructor it will check parent default constructor:
			//Parent constructor will be called first than child constructor
	//	so if class extends parent class-Parent class constructor is called first
		
		
		//when using super keyword-Default constructor will not called instead the constructor which called by super will be called
	}
}
//super keyword should be written always inside child class
//super keyword should be always first statements
//if we want to call all constructor of parent class in child class-will create more constructor of  object of child
//cannot have 2 super keyword in 1 constructor-it is a first statement always