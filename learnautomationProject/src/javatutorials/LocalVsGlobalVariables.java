package javatutorials;

public class LocalVsGlobalVariables {
	
	
	String name="Tom";//gloabl variables or class variables-scope is through out the program
	int age=25;//to access global variable create object of class
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10;//Local Variable for main method
		System.out.println(i);
		//System.out.println(name);//cannot access as name is Global variable-only access after creating object
		
		LocalVsGlobalVariables obj=new LocalVsGlobalVariables();//created Object to access global variables
		
		System.out.println(obj.age);
		System.out.println(obj.name);
	}
	public void sum() {
		
		//these 3 also are Local Variables of sum method
		int i=10;
		int j=20;
		int age=25;
		System.out.println(j);
		
	}
	
	
	

}
