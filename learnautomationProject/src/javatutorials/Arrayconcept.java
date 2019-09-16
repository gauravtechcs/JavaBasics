package javatutorials;

public class Arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//DisAdvantage:
		//size is fixed in array
		//It stores only similar data types values--
		//if declaring integer-storing int only,same way for String,boolean
		//1.size is fixed:static Array:To overcome this problem we use Collection:dynamic Array-Arraylist
		//2.It stores only similar datatype to Overcome this we use:Object Array
		

		int i[]=new int [3];
		i[0]=10;
		i[1]=20;
		i[2]=40;
		System.out.println(i.length);
		System.out.println(i[2]);
		
		for (int j=0;j<i.length ;j++) {
			System.out.println("Value of each row is "+ i[j]);
		}
		
		String s[]=new String [3];
	
		
		s[0]="HareKrshna";
		s[1]="Govind";
		s[2]="Radharani";
		System.out.println(s.length);
		
		for(int j = 0;j<s.length;j++) {
		System.out.println("value is"+s[j]);
		//Object Array used to store Different datatype values
		
		Object obj[]=new Object[6];
		obj[0]="text";
		obj[1]="london";
		obj[2]=12.33;
		obj[3]=25;
		obj[4]='M';
		
		System.out.println(obj[1]);
		
		
		
		
		
		int m[]=new int [5];
		m[0]=100;
		m[2]=200;
		m[1]=500;
		m[2]=800;
		System.out.println("length of array is " +m.length );
		
		for(int k=0;k<m.length;k++) {
			
			System.out.println("Value at each Index" + m[k]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}}
