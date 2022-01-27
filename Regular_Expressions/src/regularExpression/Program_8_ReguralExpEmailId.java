package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_8_ReguralExpEmailId {
	
	public static void main(String[] args) {

		Pattern p = Pattern.compile("[\\w][a-zA-Z0-9\\W]*");
		
		Matcher m = p.matcher("navyaj2465@gmail.com");

		if (m.find() && m.group().equals("navyaj2465@gmail.com"))
		{

			System.out.println("EmailId is Matching");
		} 
		else {
			System.out.println("No Matching");
		}

	}

}
