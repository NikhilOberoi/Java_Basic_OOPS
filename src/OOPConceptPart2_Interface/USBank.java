package OOPConceptPart2_Interface;

public interface USBank {

	int Min_Bal = 100;
	
	public void credit();
	public void debit();
	public void transferMoney();
	
	
	// Only Method declaration.
	// no Method Body - only method prototype.
	// In Interface we can declare the Variables and Variables are Static in Nature by default.
	// Variable Values will not be change
	// non Static Methods can only write in interface
	// no main method in inteface
	// We can't create an object of interface - Abstract in Nature.
	// Interface is abstract in Nature
}
