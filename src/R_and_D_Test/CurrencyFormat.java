package R_and_D_Test;
import java.util.Scanner;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

	public class CurrencyFormat {
	public static void main(String[] args) {
//        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        NumberFormat us  = NumberFormat.getCurrencyInstance(Locale.US);

        /* Print output */        
        int payment = 12000;
        String US_AMount = us.format(payment);
        String Splitter [] = US_AMount.split("\\.");
        System.out.println(Splitter[0]);
        
        String File_Path = System.getProperty("user.dir");
        File_Path = File_Path+"\\Test_Docs\\";
        
        File f = new File(File_Path);
        int count = f.listFiles().length;
        System.out.println("File Count is :- "+count);
        int count1 = f.listFiles().length;
        System.out.println("File Count is :- "+count1);
        // C:\Users\nitin.kumar\Documents\HSBC_Docs\Test_image.jpg
        System.out.println(File_Path);
        Double i=0.00;
        if(i==0.00) {
        	System.out.println("Pass");
        }
        //////////////////////////////////////////////
        
        HashMap <String, HashMap<String, String>>  map = new HashMap<String, HashMap<String, String>> ();
        
       HashMap <String, String> innermap = new HashMap<String,String>();
       innermap.put("heya key", "Heya Value");
        	map.put("Account1", innermap);
        	
       System.out.println("map size is :-"+map.size());
       System.out.println("Map get is :-"+map.get("Account1").get("heya key"));
	}
}