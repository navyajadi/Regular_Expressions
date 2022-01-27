package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program_5_ReguralExpMobileNo {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[6-9][0-9]{9}");
		Matcher m = p.matcher("9876543210");

		if (m.find() && m.group().equals("9876543210")) {

			System.out.println("Matching the Mobile Number");
		} else {
			System.out.println("No Matching");
		}
	}

}
