package JavaBasics;

public class TwoDemArrays {

	public static void main(String[] args) {
		String a [][] = new String[3][5]; // Two Dimensional arrays having 3 Rows and 5 Column.
		int [][] b = new int [1][1];
		
		System.out.println("length of Array is : "+a.length);
		System.out.println("Columns in First Row are : "+a[0].length);
		
		// Storing the Values in 2-D Arrays
		a[0][1] = "A";
		a[0][2] = "B";
		System.out.println("Printing Values : "+a[0][3]);
		
		int flag = 0;
		// Adding Values to all the 2-D Arrays
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				a[i][j] = String.valueOf(flag);
				System.out.println("Flag is : "+flag+"  and valued at "+i+"and "+j+"is : "+a[i][j]);
				flag++;
			}
		}
	}
}
