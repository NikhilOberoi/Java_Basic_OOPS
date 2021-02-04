package Constructor_Concept;

public class ConstructorWithThisKeyword {
	String Name = "Hi There";
	int Age;
	
	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Nikhil",26);
		System.out.println("Main Name is :"+obj.Name);
	}
	
	public ConstructorWithThisKeyword(String Name, int Age) {
		
		System.out.println("Local Name is : "+Name);
		Name = "Test Name";
		this.Name = Name;
		this.Age = Age;

		System.out.println("Candidate Name is : "+Name+" and Age is :"+Age);		
	}
	
	public ConstructorWithThisKeyword(int Name, int Age) {
		
	}
	
}
