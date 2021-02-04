package OOPConceptPart2_AbstractClass;

public class TestRun_Abstract extends Shape{

	public static void main(String[] args) {
		Shape S = new TestRun_Abstract();
//		S.abc = 200;
		S.testMethod();
		System.out.println("Variable Value is "+S.abc);
		
	}
	public void testMethod() {
		System.out.println("This is test method of Abstract Class");
	}
}
