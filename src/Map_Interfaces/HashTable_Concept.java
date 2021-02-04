package Map_Interfaces;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

import com.sun.xml.xsom.impl.scd.Iterators.Map;
public class HashTable_Concept {
	public static void main(String[] args) {
		Hashtable<String, String >ht = new Hashtable<String, String>();
		ht.put("A","Nikhil");
		ht.put("B","Selenium");
		ht.put("C" ,"Test");
		
		System.out.println(ht.size()); // getting size of hash table;
		System.out.println("Hash Table ht contents are : "+ht);
		
		System.out.println("ht hashcode is " + ht.hashCode());
		
		if(ht.contains("Nikhil"))
			System.err.println("Value matched");

		// deleting keys from hash table..
		System.out.println("Before removing ht is :");
		System.out.println(ht);
		ht.remove("C");
		System.out.println("After removing C in ht is :");
		System.out.println(ht);
		
		// Clone hash table:
		
		Hashtable <String, String> ht1 = new Hashtable<String,String>();
		ht1 =  (Hashtable<String, String>) ht.clone();
		System.out.println("After cloning ht1 is :- "+ht1);
		
		Hashtable <String,String> ht2 = new Hashtable<String,String>();
		ht2=ht;
		System.out.println("Hash Code of equilent hashtable ht2 is :- "+ ht2.hashCode());
		System.out.println("Hash Code of similar hash table ht is :- "+ ht.hashCode());
		
		// print all the values from hash table ht2 using Elemuration -- elements()
		
		Enumeration <String> e =  ht2.elements();
		while (e.hasMoreElements()) {
			System.out.println("Elements are :- "+e.nextElement());
		}
		
		// Print all using entity set.
		Set<Entry<String, String>> a = ht2.entrySet();
		System.out.println("Set view is :- "+a);
		}
		
		
	}
	

