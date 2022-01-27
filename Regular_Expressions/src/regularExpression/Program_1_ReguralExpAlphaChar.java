package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_1_ReguralExpAlphaChar {
	
	public static void main(String[]args) {
		
		Pattern p = Pattern.compile("[a-zA-Z0-9]");
		
		Matcher m = p.matcher("abc86DA");
		
		while(m.find()) {
			System.out.println(m.start()+" "+m.group());
		}
	}

}
