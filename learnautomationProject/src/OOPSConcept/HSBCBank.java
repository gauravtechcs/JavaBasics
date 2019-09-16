package OOPSConcept;

public class HSBCBank implements USBank,BrazilBank {//We are achieving multiple Inheritence
	//called a is-a-relationship (Interface in class Relationship)
	
	//If class(HSBCBank) implementing any Interface(USBank) than its mandatory to define or override all the methods of Inteface
	//all 3 Methods from USBank needs to define in Implements method
	//We never give method body in Interface but give in Implemented class
	//Always all methods needs to be implemented from  USBank to HSBC Bank
	//will get error if we not define all 3 methods of Interface
	public void credit () {
	System.out.println("HSBC Credit");
	}
	
    public void debit() {
    	System.out.println("HSBC Debit");
    }
    
	public void transfermoney() {
		System.out.println("HSBC TransferMoney");
	}

	public void educationloan() {   //USBANK own Method
		System.out.println("US Bank education LOAN");
	}
	
	public void homeloan() {    //USBANK own Method
		System.out.println("US Bank Home LOAN");
	}

	//Brazilbank method:
	public void  mutualfund() {//overriding from Brazilbank
	System.out.println("Brazilbank method");
		//This is how we are acheiving multiple Inheritence
	}
	
}
