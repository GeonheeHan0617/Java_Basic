package static_method;

import java.util.Arrays;
import java.util.Calendar;

public class MainClass {
		
			// static 있음
	public static void main(String[] args) {
	
		Count c = new Count();
		
		c.a = 10;
		c.method1(); 

		
		// static 메서드 사용
		Count.method2();
		Count.method2();
		
		System.out.println();
		
		// Stateic메서드 예시
		Math.random();
		String.valueOf('c');
//		Arrays.toString(배열명);
		Integer.parseInt("1");
		Calendar.getInstance();
		//static메서드의 대표적인 사용
		//Math.random(); Arrays.toString(배열명);
		//Integer.parseInt(문자열);
		
		
	}
	
}
