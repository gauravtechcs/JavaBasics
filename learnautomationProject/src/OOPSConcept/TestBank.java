package OOPSConcept;

public class TestBank {

	public static void main(String[] args) {
	System.out.println("minimum Balance is"+ USBank.min_bal);
	//USBank.min_bal=200;//We cannnot change as its value is static And final Variable

		
		//USBank b1 =new USBank();//get error Cannot instantiate the type USBank
		          //USBank is interface-Cannot create object of US Bank
		//This is Compile time or Static Polymorphism as 3 Overrideen methods we r using from USBank in HSBC Bank
		HSBCBank hs =new HSBCBank();
		hs.credit();
		hs.debit();
		hs.homeloan();
		hs.educationloan();
		hs.transfermoney();
		
		
		//Dynamic Polymorphism is down we r doing
		//Child class object can be reffered by parent Interface Refrence Variable
		
		USBank u=new HSBCBank();
		u.debit();
		u.credit();
		u.transfermoney();
		//Only and only overridden method can be called-cannot access educationloan(),Homeloan() methods
		
		
	}
	
	//Lets create one more Interface BrazilBank
	

}
