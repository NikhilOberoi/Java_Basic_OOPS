package OOPConceptPart2;

public class RandD {
	static String TestData = "15000.0";
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		RandD.waitFormilliseconds();

	}
	
	 public static String waitFormilliseconds() throws InterruptedException{
			  
		 
		  int DataLength = TestData.length();
		  String[] TData = TestData.split("\\.");
//		  String TData = TestData.substring(0,DataLength-2 );
		  System.out.println(TData[0]);
		 int time = Integer.parseInt(TData[0]);
		 
		 //int time = Integer.parseInt(TestData);
			  System.out.println("Before Wait");
//			  Thread.sleep(time);
			  System.out.println("After Wait");
			  
		  return "Pass";
		 }

}
