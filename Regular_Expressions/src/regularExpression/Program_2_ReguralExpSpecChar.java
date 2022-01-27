package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_2_ReguralExpSpecChar {
	
	public static void main(String[]args) {
		
		int Count=0;
		
		Pattern P = Pattern.compile("[a-zA-Z0-9\\W]");
		Matcher m = P.matcher("DCG567@#bhgf");
		
		while(m.find()) {
			
			System.out.println(m.start()+" "+m.group());
			Count++;
			
		}
		System.out.println(Count);
	}

}
