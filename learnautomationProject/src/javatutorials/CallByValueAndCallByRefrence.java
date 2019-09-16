package javatutorials;

class CallByValueAndCallByRefrence {

	public static void main(String[] args) {
		
		CallByValueAndCallByRefrence obj=new CallByValueAndCallByRefrence();
		//obj.TestSum(10, 20);
		
		int x=10;
		int y=20;
		obj.TestSum(x, y);//Call By value or pass by value
		
		
	}
	
	
	
	public int TestSum(int a,int b) {
		a=30;
		b=40;
		int c=a+b;
		return c;
	}

}
