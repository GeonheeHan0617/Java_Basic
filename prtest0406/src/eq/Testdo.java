package eq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Testdo {
	public static void main(String[] args){

		  String pwd = "aAASDF234230`~!@#$%sdsdf2134234$#^%$&*%*)^&*()-_=+{}[]\\\\|;:,.<>/?'";
		  
		  String ptn="^[\\p{Graph}]*$"; 
		  /*
		   * \\p{Lower},\\p{Upper}
		   * >> \\p{Alpha}
		   * 
		   *    \\p{Digit}
		   *    >> \\p{Alnum}
		   *      \\p{Punct}
		   *       >> \\p{Graph}
		   */
		  Pattern p = Pattern.compile(ptn);
		  Matcher m = p.matcher(pwd);
		  
		  if(!m.matches()){
		   System.out.println("p :pwd 틀림");
		  }else{
		   System.out.println("p :pwd 맞음");
		  }
		  
		        String regex = "^[a-zA-Z0-9`~!@#$%^&*()-=_+\\[\\]{}:;',./<>?\\\\|]*$";
		        Pattern p1 = Pattern.compile(regex);
		        if(p1.matcher("123avcASGD#$%&'A()*+,-./:;<=>?@[\\gsf]^_`{df|2134}~").matches()){
		         System.out.println("p1 : good");
		        }else{
		         System.out.println("p1 : bad");
		        }
		       
		        String regex2 = "^[a-zA-Z0-9!#$%^\\p{Punct}]*$";
		        Pattern p3 = Pattern.compile(regex2);
		        if(p3.matcher("@##&23aGD#$%&'A()*+,-;;;'''@#$adsfasdSDFBFDB12414$^&^.?@[\\gsf]^_`{df|4}~").matches()){
		         System.out.println("p3 : good");
		        }else{
		         System.out.println("p3 : bad");
		        }
		  
		 }
		}



	
