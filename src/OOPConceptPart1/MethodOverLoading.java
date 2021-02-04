package OOPConceptPart1;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading Obj = new MethodOverLoading();
		Obj.sum();
		Obj.sum(1);
		Obj.sum("Nikhil Here");
		Obj.sum("Text 1",1);
		Obj.sum(2,"Text 2");
	}
	// Method Overloading --> When the method name is same but there Parameters and their data types are different with in the same class.
	
	public void sum() {
		System.out.println("This is the method with no Parameters");
	}
	
	public void sum(int i) {
		System.out.println("This is the method with 1 Parameter");
		System.out.println("Value is : "+i);
	}

	public void sum(String Text) {
		System.out.println("Thsi is the same method having 1 Parameter with diffrent Data Types");
		System.out.println("Value is : "+Text);
	}
	
	public void sum(int i, String j) {
		System.out.println("This is the same method having 2 Parameters");
		System.out.println("Values is : "+i+j);
	}
	
	public void sum(String j, int i) {
		System.out.println("This is the same method having 2 Parameters");
		System.out.println("Values is : "+j+i);
	}
	
}
