package OOPConceptPart1;

public class CallbyValAndCallbyRef {

	int a = 50;
	int b = 60;
	
	public static void main(String[] args) {
		CallbyValAndCallbyRef obj = new CallbyValAndCallbyRef();
		obj.Sum(2,3); // Call By Value or Passing by Value.
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		obj.Swap(obj);// Call by reference
		obj.accessGlobalVar(obj); // call by reference;
		
	}
	
	public int Sum(int a, int b) {
		int c=a+b;
		System.out.println("Sum is : "+c);
		return c;
	}
	
	public int Swap(CallbyValAndCallbyRef z) {
		int temp;
		
		temp = z.a;
		z.a = z.b;
		z.b= temp;
		
		System.out.println("After Swaping through Call By Reference : "+z.a);
		System.out.println("After Swaping through Call By Reference : "+z.b);
		return temp;
	}
	
	public void accessGlobalVar(CallbyValAndCallbyRef test) {
		System.out.println("Acessing Global Variables through call by refrence : "+test.a);
		System.out.println("Acessing Global Variables through call by refrence : "+test.b);
	}
}
