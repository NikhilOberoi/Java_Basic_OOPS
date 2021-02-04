package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept_Practice {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		
		for(int i=0; i < ar.size(); i++ ) {
			System.out.println("Normally adding data in ar "+ar.get(i));
		}
		

		System.out.println("**********************************************");
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
//		ar.addAll(ar1);
		for(int i=0; i < ar.size(); i++ ) {
			System.out.println(ar.get(i));
		}

		System.out.println("**********************************************");
		ar1.add(143);
		ar1.addAll(ar);
		for(int i=0; i < ar1.size(); i++ ) {
			System.out.println(ar1.get(i));
		}
		
		System.out.println("**********************************************");
		ar.add(10);
		ar1.removeAll(ar);
		for(int i=0; i < ar1.size(); i++ ) {
			System.out.println(ar1.get(i));
		}
		
		
		
		
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		
		// Using User define method in Array List
		Employee E = new Employee("Nikihl",25,"Testing");
		Employee E1 = new Employee("Vikas",80,"HOD");
		
		// adding values 
		emp.add(E);
		emp.add(E);
		
		// Using Iterator to get the values
		
		Iterator<Employee> EI = emp.iterator();
		while(EI.hasNext()) {
			Employee temp = EI.next();
			System.out.println("Name is : "+temp.Name);
			System.out.println("Age is : "+temp.Age);
			System.out.println("Dept is : "+temp.Dept);
		}
		
		System.out.println("********************* Size *************************");
		int size = emp.size();
		System.out.println(size);
		
		System.out.println(E.Dept);
	}
}
