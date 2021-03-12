package Constructor_Concept;

public class Constructor_Concept_with_Super_Keywords extends ConstructorConcept{
	
	public static void main (String [] args) {
		Constructor_Concept_with_Super_Keywords CCSK = new Constructor_Concept_with_Super_Keywords();
	}
	
	public Constructor_Concept_with_Super_Keywords() {
		super(10);
		ConstructorConcept cp = new ConstructorConcept(10,20);
		System.out.println("This is child class const");
		System.out.println("Nikhil");
	}
}
