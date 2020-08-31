package api.packagef;

import java.util.Scanner;

public class Palindrome {

	
	public static String palindrame(String word) {
		String result = "";
		word = word.replace( " ", "");
		for(int i = 0; i<word.length() /2 ; i++) {
			
			if(word.charAt(i) !=  word.charAt(word.length() -1 -i ))  {
				return"회문이 아닙니다.";
			}
		}
	return "회문입니다. ";	
	}
}
