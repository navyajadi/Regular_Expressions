package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExp {

	public static void main(String[] args) {

		
		Pattern p = Pattern.compile("xyz");
		
		Matcher m = p.matcher("xyzxyzxyzxyzxyz");
		
		while(m.find()) {
			
			System.out.println(m.start()+" "+m.end()+" "+m.group());
		}
	}

}
