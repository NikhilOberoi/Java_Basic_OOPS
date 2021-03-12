package OOPConceptPart1;


public class FunctionsInJava {
	// main method ----> is the starting Point of execution
	// the main method is void because we never return any value from this method.
	
	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		
		//Calling noReturn Method with Class Object
		obj.noReturn(); // this will not return anything
		
		// Calling Retuen method with Class Object
		int A = obj.Return(); // this will return an integer Value
		System.out.println(A);
		
		//Calling Devision Method with Class Object
		A = obj.devision(10, 2); // this will pass some values in parameter and then method will return a Value
		System.out.println("A-"+A);
	}
	
	// Non-Static Methods with No-Input and No-Output
	// void here does not return any Value.
	public void noReturn() {
		System.out.println("noReturn method will not returing any thing");
	}
	
	// Non-Static Method With No-Input but Return an Output/Value
	// Return type of this method is = int
	public int Return() {
		System.out.println("Return method will return an integer Value :");
		int a =10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	// Non-Static with Some Input and Output
	// Return type of this method is integer
	public int devision(int a, int b) {
		System.out.println("Division Method is Called");
		int c=a/b;
		return c;
	}
	
}
