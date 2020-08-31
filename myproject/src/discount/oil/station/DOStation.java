package discount.oil.station;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DOStation {

	public static void main(String[] args) {
	
		BufferedReader br = null; 
		
		List<Data> list = new ArrayList<>();
//		String pat1 = "\\([가-핳]+\\)\\[가-핳]| ";
//		String pat3 = "";
	
		try {
			br = new BufferedReader(new InputStreamReader ( new FileInputStream(
					"D:\\Aws\\workspace\\myproject\\src\\discount\\oil\\"
					+ "station\\_알뜰주유소현황_2018.csv_"),"EUC-KR" ));
			String str;
			while ((str = br.readLine() ) !=null) {
				
				Data p1 = new Data () ;
				
//				Matcher m1 = Pattern.compile(pat1).matcher(str);
//				
//				System.out.println(m1.find());
				
				System.out.println(str);
			}
	
			
		}catch (Exception e) {
			
		}
		
		
		
		
	}
	
}
