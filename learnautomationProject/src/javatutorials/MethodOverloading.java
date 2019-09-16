package javatutorials;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading obj=new MethodOverloading();//created object to call the Nonstatic methods
	obj.sum();
	obj.sum(20);
	obj.sum(30, 50);//yes main method can be overloadeda
	}
	public static void main(int p) {
	

	}

public static void main(int q,int p) {


}
	
	//duplicate method cannot be created
	//Methods are Independent
	//Method inside method cannot be created
	public void sum() { //O parameter methos
		
		System.out.println("sum method-zero Paarameter");
		
		

	}
public void sum(String s) { //O parameter methos
		
		System.out.println("sum method-zero Paarameter");
		
		

	}

	public void sum(int i) {  //Method Overloading
		
		//System.out.println("sum method-1 Paarameter");
		System.out.println(i);
	}
		public void sum(int k,int j) { //2 Imput parameter
			
			//System.out.println("sum method-zero Paarameter");
			System.out.println(k+j);
		}
	
}




