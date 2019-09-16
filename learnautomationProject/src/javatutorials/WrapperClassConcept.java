package javatutorials;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="100";//100 is not integer consider as string
		
		System.out.println(s+20);
		
		//Data Conversion from String to Integer
int i=		Integer.parseInt(s);//Integer--Wrapper Class
System.out.println(i);
System.out.println(i+20);
//Wrapper classes are used for data conversion
//Integr,Double,Character,Boolean wrapper classes


//String to Double Conversion:

String y="12.33";
double d=Double.parseDouble(y);
System.out.println(d+40);

//String to Boolean Conversion

String z="true";
Boolean b=Boolean.parseBoolean(z);

System.out.println(z+b);

//int to String Conversion

int j=200;
System.out.println(j+20);

String r = String.valueOf(j);//"200"
System.out.println(r+20);

//String to Integer
String u="100A";//It should  be pure integer or numeric value
int m=Integer.parseInt(u);//lang.NumberFormatException: For input string: "100A"
		
		
	}

}

