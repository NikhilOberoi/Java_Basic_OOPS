package OOPConceptPart1;

public class LocalVsGlobalVariables {
	String Name = "Nikhil";
	int Age = 25;
	
	public static void main(String[] args) {
		int i = 10;
		int a = 20;
		// Local Variables doesn't need any object to access.
		System.out.println(i);
		
		// Global OR Class Variables need Class Object access such Variables.
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.Name);
	}
	public void sum() {
		int i = 15;
		int j = 25;
	}
}
