package Constructor_Concept;

import java.util.ArrayList;
import java.util.Iterator;


public class ConstructorConcept {

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(1000);
	}
	
	public ConstructorConcept(){
		System.out.println("this is no arg constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("This is one perametrized constructor "+ i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("This is two perametrized Constructor "+i+j);
	}
}
