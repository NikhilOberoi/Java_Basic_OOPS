package Exception_Handling;

import java.io.IOException;

public class Throw_Keyword {

	public static void main(String[] args) throws IOException {
		
		String Excel_cell_Available_flag = "N";
		String cell_Value = "This . is ?";
		
		System.out.println("Before Try Catch Block");
		try {	
//			if(Excel_cell_Available_flag.equals("N")) { // just to throw an error in case of no cell available in excel.
//				throw new Exception("Cell is not Available");
//			}
			if(cell_Value.contains(".")) {
				throw new IOException("Invalid data in Cell");
			}
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		System.out.println("After Try Catch Block");
	}

}
