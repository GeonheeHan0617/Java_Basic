package myproject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompileStatic {
	public static void main(String[] args) {
		
	
	String info = "30세/서울시 강남구/02-234-5678/010-234-5678"; 
	String pattern = "\\d{2,3}-\\d{3,4}-\\d{3,4}";
	Pattern p = Pattern.compile(pattern); 
	Matcher m = p.matcher(info);

	
	
	}
	
}
