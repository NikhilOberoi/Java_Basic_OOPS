package OOPConceptPart2_Interface;

public class HSBC_Bank implements USBank,RBIRules { // by implementing USBank and RBIRules here we achiving multiple Inheritance
//	This is called - IS-a Relationship (here we are talking about relationship between Interface and class)
//	public static void main(String[] args) {
//		HSBC_Bank HSBC = new HSBC_Bank();
//		HSBC.credit();
//		HSBC.debit();
//		HSBC_Bank.educationLoan();
//	}
	
	public void credit() {
		System.out.println("This is the Credit Method of HSBC Bank");
	}
	
	public void debit() {
		System.out.println("this is the Debit method of HSBC Bank");
	}
								
	public void transferMoney() {
		System.out.println("This is the transferMoney method of HSBC Bank");
	}

	public static void educationLoan() {
		System.out.println("this is the education Loan Method of HSBC Bank");
		
	}
	
	public void carLoan() {
		System.out.println("this is the carLoan Method of HSBC Bank");
	}
	
	public void mutualFund() {
		System.out.println("This is the mutualFund Method defination of HSBC Bank");
	}
}
