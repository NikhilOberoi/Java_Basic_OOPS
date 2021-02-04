package R_and_D_Test;

public class Splitters {
	
	
	public static void main(String args []) {
	boolean flag = true;
	String Caret_keyword = "thisa%is";
	if(Caret_keyword.contains("%") && flag == true) {
	String[] Caret_splitter = Caret_keyword.split("\\%",2);
	int Caret_keyword_length = Caret_splitter[0].length();
	System.out.println(Caret_keyword_length);
	}
	}
}
