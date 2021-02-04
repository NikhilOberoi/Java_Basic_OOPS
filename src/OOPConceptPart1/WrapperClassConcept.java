package OOPConceptPart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String x = "20";
		int z = 10;
		// Before Data Conversion
		System.out.println(x+z);
		
		// After Data Conversion
		int i = Integer.parseInt(x);
		System.out.println(i+z);
		
		// Similarly we can change data for - String, boolean, Double , Integer.
		
		// String Data Coinversion
		int a = 200;
		int b = 20;
		
		// Before String Data Conversion
		System.out.println("Before String Data Conversion");
		System.out.println(a+b);
		
		// After String data conversion
		String c = String.valueOf(a);
		System.out.println("After String COnversion ");
		System.out.println(c+b);
		
		// Double Data Conversion
		String d = "10.2800000";
		int e = 4;
		
		System.out.println("Before Double Data Conversion");
		System.out.println(d+e);
		
		System.out.println("After Double Data Conversion ");
		Double f = Double.parseDouble(d);
		System.out.println(f+e);
		
		
		// Boolean Data Conversion
		String g = "TRuE";
		System.out.println("Before Boolean Data Conversion");
		System.out.println(g);
		
		System.out.println("After Boolean Data Conversion");
		Boolean h = Boolean.parseBoolean(g);
		System.out.println(h);	
	}
}
