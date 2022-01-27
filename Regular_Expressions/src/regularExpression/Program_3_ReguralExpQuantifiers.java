package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_3_ReguralExpQuantifiers {
  public static void main(String[]args) {
	  
	  Pattern p = Pattern.compile("N*");
	  
	 Matcher m = p.matcher("NavyNN95@ja");
	 
	 while(m.find()) {
		 System.out.println(m.start()+" "+m.group());
	 }
  }
}
