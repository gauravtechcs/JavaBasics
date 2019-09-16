package OOPSConcept;

public class Bmw extends Car1 {// has-a-Relation

	
	public void Start() {//Overrridden method
		System.out.println("BMW strt");
	}
	
	//when same method present in parent and child class with same name and parameter is called methos overriding
	public void Stop() {//Over Ridden Method
		System.out.println("BMW Stop");
	}

	public void CarTheft() {//Over Ridden Method
		System.out.println("BMW Thaft");
	}
	
	
}
