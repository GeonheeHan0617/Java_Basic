package ifEx0410;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner (System.in);
		
		System.out.println("정수를 입력하세요 ->");
		int a = scan.nextInt() ;
		
		if(a%2 == 0 ) {
			System.out.println("짝수입니다.");
		}else { 
			System.out.println("홀수입니다.");
		}
		
	}
	
}
