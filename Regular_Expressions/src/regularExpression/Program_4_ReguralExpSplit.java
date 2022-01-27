package regularExpression;

import java.util.regex.Pattern;

public class Program_4_ReguralExpSplit {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("t");
		String[] s = p.split("TestYantra Software Solutions");
		
		for(String s1:s) {
			
			System.out.println(s1);
		}
	}

}
