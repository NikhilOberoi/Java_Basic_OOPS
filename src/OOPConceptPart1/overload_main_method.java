package OOPConceptPart1;

public class overload_main_method {

	public static void main(String [] args) {
		System.out.println("main method of class overload_main_method ");
	}
	
	public static void main(int a) {
		System.out.println("main method with one integer parameter");
	}
	public static void main(String args) {
		System.out.println("another main method");
	}
	
	public static void main(int args [],String a) {
		System.out.println("another main method");
	}
	
}
