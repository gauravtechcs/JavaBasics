package javatutorials;

public class Car {
int model;//Global Variable
int wheel;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new Car() is the object of car
		//copy of these 2 global variables will be given to each object
		//If create 100 object,100 copy will be created for each Object
		Car a=new Car();
		Car b=new Car();
		Car c=new Car();
		
		a.model=2015;
		a.wheel=4;
		
		b.model=2014;
		b.wheel=4;
		
		c.model=2016;
		c.wheel=4;
		
		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.wheel);

		
		
		
		
	}

}
