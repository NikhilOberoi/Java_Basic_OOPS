package OOPConceptPart1;

public class Car {
	// Class Variables
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		
		// new Car(); --> this is the object of Car Class.
		// A,B, and C are representing above Object [these are Object Names]
		// New Keyword is use to create the Object
		
		Car A = new Car();
		Car B = new Car();
		Car C = new Car();
		
		A.mod = 2018;
		A.wheel = 4;
		
		B.mod = 2014;
		B.wheel = 3;
		
		C.mod = 2019;
		C.wheel = 2;
		System.out.println("Before Shifting the Refernces");
		
		System.out.println(A.mod);
		System.out.println(A.wheel);
		System.out.println(B.mod);
		System.out.println(B.wheel);
		System.out.println(C.mod);
		System.out.println(C.wheel);
		
		System.out.println("After Shifting the References");
		A=B;
		B=C;
		C=A;
		
		// After Changing the refernces above, now a,c are refering to values of b, and b is reffering to values of C and A has no refernce.
		
		System.out.println("A Mod Value after Shifting "+A.mod);// will display the values from Object Reference B
		// When we change or Update the reference values of C 
		A.mod = 2020;
		System.out.println("A Mod Values after updating the value of C "+A.mod);
		
	}
}
