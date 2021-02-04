package ListConcept;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		//Static Array with size 3
		int a[] = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 1000;
		
		// Dynamic Array -- ArrayList
		// 1. Can contain duplicate elements.
		// 2. Maintains Insertion Order.
		// 3. Synchronized
		// 4. Allows Random access.
		ArrayList non_gen = new ArrayList(); // this is non generic array List - as we haven't defined the arrayList type.
		ArrayList <String> ar = new ArrayList<String>(); // we used generic here as we defined the arrayList type (String)
		ar.add("Nikhil");
		ar.add("Oberoi");
//		ar.add(12);  // not allowed as the ArrayList type is String
		
		non_gen.add("This is non generic");
		non_gen.add(100);
		
		System.out.println("Size of the array is : "+ar.size());
		System.out.println("Element at index 0 is : "+ar.get(0));
		
		System.out.println("Non-gen at index 0 is "+non_gen.get(0));
		System.out.println("Non-gen at index 0 is "+non_gen.get(1));
		
		// Creating Employee class object references.
		
		Employee emp1 = new Employee("Nikhil", 23 , "Tester");
		Employee emp2 = new Employee("Prat", 24 , "QA");
		
		// Create an Object (Employee) type Array List
		
		ArrayList <Employee> emp = new ArrayList <Employee> ();
		emp.add(emp1);
		emp.add(emp2);
		
		// iterator to traverse the values :
		
		Iterator<Employee> IT = emp.iterator();
		while(IT.hasNext()) {
			Employee E = IT.next();
			System.out.println(E.Name);
			System.out.println(E.Age);
			System.out.println(E.Dept);
		}	
	}
}
