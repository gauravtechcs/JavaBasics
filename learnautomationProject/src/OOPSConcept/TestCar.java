package OOPSConcept;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if method is common in parent and child,Preference given to child class method
		//java say u already have start method in BMW child class so dont call parent class method
		
		//Compile time or Static Polymorphism
		//One to many-Method Overridding-is called Compile time polymorphism
		Bmw b=new Bmw();
		b.Start();
		b.Stop();
		b.Refuel();
		b.Engine();//Inherting Engine method from grandparent-Vehicle
		
		System.out.println("*************");
		
		Car1 c=new Car1() ;//Not allow child Bmw class methods as car1 is parent
		    c.Start();
			c.Refuel();
			c.Stop();
		System.out.println("*********");
			
		Car1 c1=new Bmw();//Child class object can be refferred by Parent class refrence variable called dynamic or Run time polymorphism
	c1.Start();
	c1.Stop();//It will call BMW methods
	//Cannot access c1.TheftSaftey-AS just by child refrence we cannot access
	//As theft method only available in BMW class
	//Only pure BMW object can refer it
	//Also called Top Casting
	
	//Down Casting below:                                     
	
	//Bmw b1=new Car1();//Parents cannot fit in child class-It will give error-Add Cast to BMW
	//To do it we can down cast it like
	//Parent class Object cannot be refferd by child class
	
	Bmw b1=(Bmw) new Car1();//Down Casting 
	
	//Get java.lang.ClassCastException--at compile time java will be execute-compliler will be confused
	}}
	
	
		
		
		
		
		
	
