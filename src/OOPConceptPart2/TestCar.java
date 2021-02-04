package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		// Static POlymorphism -- Compile-Time Polymorphism.
		BMW B = new BMW(); // Can access Child Class Methods as well as Parent Class methods.
		B.start();
		B.security();
		B.stop();
		B.Refuel();
		B.engine(); // Here we are accessing Grand Parent function/methods 
		
		System.out.println("---------------------------------\n");
		
		Car C = new Car();
		C.start();
		C.stop();
		C.Refuel();
		
		System.out.println("---------------------------------\n");
		
		// Child class object can be referred by parent class reference variable -- Dynamic Polymorphism OR Run-Time polymorphism.
		Car C1 = new BMW(); // Can access all the parent class methods but only common methods from child class.
		C1.start();
		C1.stop();
		C1.Refuel();
		//C1.security();
		
		
		
	}
	
}
