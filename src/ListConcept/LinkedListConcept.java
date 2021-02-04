package ListConcept;
import java.util.LinkedList;
import java.util.Iterator;


public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList <String> ll = new LinkedList<String>();
		int ll_size;
		
		// to add in linked list
		ll.add("One");
		ll.add("Two");
		ll.add("Three");
		
		
		ll_size = ll.size();
		System.out.println("Size of Linked List is : "+ll_size);
		
		// To add Data at first in Linked List
		ll.addFirst("Nikhil");
		// To add Data at Last Position in Linked List:
		ll.addLast("Oberoi");
		
		ll_size = ll.size();
		System.out.println("Size of Linked List is : "+ll_size);
		
		System.out.println("Linked List elements are :"+ll);
		
		// To get the element on specific Position OR by index value:
		System.out.println("Linked List elements are :"+ll.get(3));
		
		// To get first and Last element in Linked List:
		System.out.println("First Element in linked List : "+ll.getFirst());
		System.out.println("Last Element in Lonked List is : "+ll.getLast());
		
		// Similarly we can remove elements from Linked List.
		// To remove first and Last Element from Linked List
		ll.removeFirst();
		ll.removeLast();
		ll.remove(0);
		
		System.out.println("Linked List elements are :"+ll);
		
		ll_size = ll.size();
		System.out.println("Size of Linked List is : "+ll_size);
		
		// To print each elements
		
		//for loop
		for(int i=0;i<ll_size;i++){
			System.out.println("Elemet is : "+ll.get(i));
		}
		
		// Advance for loop"
		for(String str : ll) {
			System.out.println("Advace loop elements are : "+str);
		}
		
		//using Iterator
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			String Val = it.next();
			System.out.println("Iterator elements : "+Val);
		}
		
		// using while loop
		int flag = 0;
		while(ll_size>flag) {
			System.out.println(ll.get(flag));
			flag++;
		}
	}
}