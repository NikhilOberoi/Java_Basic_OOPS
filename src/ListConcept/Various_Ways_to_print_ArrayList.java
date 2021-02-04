package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Various_Ways_to_print_ArrayList {
	
	public static void main(String [] args) {
		ArrayList <String> AL = new ArrayList<String>();
		
		AL.add("Test1");
		AL.add("Test2");
		AL.add("Test3");
		AL.add("Test4");
		
		// using java 8 with for each loop and lambda expression:
		System.out.println("printing Array Using java 8 with for each loop and lambda expression");
		AL.forEach( data -> {
			System.out.println(data);
		});
		
		// using Iterator:-
		System.out.println("Printing using Iterator");
		Iterator <String> IT = AL.iterator();
		while (IT.hasNext()) {
			String data = IT.next();
			System.out.println(data);
		}
		
		// using for each loop:
		System.out.println("Printing using for each loop OR Advance for loop");
		for(String data : AL) {
			System.out.println(data);
		}
		
		// using iterator and java 8 lambda and forEachRemaining() method..
		System.out.println("printing using iterator and java 8 lambda and forEachRemaining() ");
		Iterator <String> IT_Remaining = AL.iterator();
		IT_Remaining.forEachRemaining(data ->{
			System.out.println(data);
		});
		
		// using for loop with order/index:
		System.out.println("printing using for loop with order/index");
		for(int i = 0; i<AL.size(); i++) {
			System.out.println(AL.get(i));
		}
		
		// using a listIterator to traverse in both the directions:
		System.out.println("printing using a listIterator to traverse in both the directions");
		ListIterator<String> LI = AL.listIterator(AL.size());
		System.out.println("printing desending order using next meythod of List Iterator");
		
		while (LI.hasPrevious()){
			String data = LI.previous();
			System.out.println(data);
		}
		
		// another way to print using listIterator..
		System.out.println("printing asending order using next meythod of List Iterator");
		while(LI.hasNext()) {
			System.out.println(LI.next());
		}
		
		System.out.println("printing mix order using List Iterator");
		
		while(LI.hasNext()) {
			String data = LI.previous();
			System.out.println(data);
		}
//		System.out.println("printing mix order using List Iterator part 2");
//		while (LI.hasPrevious()){
//			String data = LI.next(); // this will throw null pointer exception
//			System.out.println(data);
//		}
	}

}
