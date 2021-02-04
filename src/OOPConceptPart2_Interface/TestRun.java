package OOPConceptPart2_Interface;

public class TestRun {

	public static void main(String[] args) {
		
		System.out.println("This is min Balance Variable from USBank : "+USBank.Min_Bal);
		
		//we can't change the value of Interface Variable - as it is final in nature.
//		USBank.Min_Bal = 200;
		
		HSBC_Bank HSBC = new HSBC_Bank();
		HSBC.credit();
		HSBC.debit();
		HSBC_Bank.educationLoan();
		HSBC.mutualFund();
		HSBC.carLoan();
		
		// Here we can achive Dynamic Polymorphism With Interfaces.
		// Child class Object can be refer by the Parent Interface Reference.
		
		USBank USb = new HSBC_Bank();
		USb.credit();
		USb.debit();
		USb.transferMoney();
//		USb.carLoan(); ----> Such Methods can't be access as they are not the part of methods, available in Parent OR Interface.
	}
}
