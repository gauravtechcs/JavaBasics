package javatutorials;

public class StaticAndNonStaticConcept {
//Global variable:scope of global variable	
	String name="Tom";//Non Static Global Variable will be available across all the functions with same consitions
	static int age=25;//Static Global Variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//How to call Static Method and Variable?
		//1.direct Calling
		//2.Calling by Classname
		
		sum();//1.Direct Calling
		 StaticAndNonStaticConcept.sum();//2.Calling by ClassName
		 
		 
		 //How to call Non Static Method & variable?
		 StaticAndNonStaticConcept obj=new StaticAndNonStaticConcept();
		 obj.sum();//Non Static method calling by creating Object
		 obj.sendMail();//Non Static method calling by creating Object
		System.out.println(obj.name);
		
		//can I access Static method by object refrence-yes we can access but not a good practise
		obj.sum();//but 1 warning will come
		 
	}
	public void sendMail() {
		
		System.out.println("Send mail method");
	}
	
	public static void sum() {//Static Method
		
		System.out.println("Sum Method");
		
		
	}
}
