package eq;

import java.util.Arrays;

public class pretest0101 {

public static void main(String[] args) {
		
		
		try {
			System.out.println(sayNick("당신의 ", 2));
		} catch (Exception e) {
			
			e.printStackTrace();
		}


}
	
	public static  String sayNick(String name, int index) throws Exception  {
		
		String [] arr = { "박장군" , " 김원장" , "진회장" , "김재명" };
		
		int ran = (int) (Math.random() *index); 
		
		return name + "별명은:" +arr[ran] +"입니다.";
	}
}
