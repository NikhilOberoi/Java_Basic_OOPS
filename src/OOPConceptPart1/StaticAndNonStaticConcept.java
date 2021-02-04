package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	String Name = "Nikhil"; //Non-Static Global Variables
	static int Age = 25;// Static Global Variables
	
	public static void main(String[] args) {
		
	// How to call Static Methods and Variables
		System.out.println(Age); // We can call Static Var directly
		Static();// We can call Static Methods Directly or with Class Name.
		StaticAndNonStaticConcept.Static();
	
	// How to call non-Static Methods
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.Name); // To Call Non-Static Variables and Method we need class object.
		obj.nonStatic();
		obj.nonStatic(10);
		
	// can we access a static method with object reference? Yes, but this is not a good practice.
		obj.Static(1);
		
	}
	
	// Non-static Method
	public void nonStatic() {
		System.out.println("This is non-static Method");
	}
	
	public void nonStatic(int i) {
		System.out.println("int non static method overloaded");
	}
	// Static Method
	public static void Static() {
		System.out.println("This is Static Method");
	}
	public static void Static(int i) {
		System.out.println("This is Static Method with method overloading : "+i);
	}
	
}
