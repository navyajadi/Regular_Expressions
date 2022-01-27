package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_6_ReguralExpMobileNowith11digit {
	public static void main(String[] args) {

		Pattern p = Pattern.compile("0?[6-9][0-9]{9}");
		Matcher m = p.matcher("09876543210");

		if (m.find() && m.group().equals("09876543210")) {

			System.out.println("Matching the Mobile Number");
		} else {
			System.out.println("No Matching");
		}
	}

}
