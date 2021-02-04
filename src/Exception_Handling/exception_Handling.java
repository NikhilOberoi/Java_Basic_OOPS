package Exception_Handling;

public class exception_Handling {
	public static void main(String[] args) {
		// uncaught exceptions
		// int a = 9/0; // it will throw Airthmatic exception
		// System.out.println(a);

		// caught exception
//		Thread.sleep(2000); // for this we need to add throws keyword with main method with exception type -
							// IntrruptedException
		
		// to ignore such errors use try catch block
		
		try {
			int a = 9/0;
			System.out.println(a);
			System.out.println("try block");
		}
		catch(ArithmeticException e) { // describe exception type
			System.out.println(e.getMessage());
			System.out.println("catch block");
			e.printStackTrace();// we can also use this to print errors and to trace errors at particular line of class.
		}
		System.out.println(" program run with exceptions");

	}

}
