package day02;

public class VariableEx {

	public static void main(String[] args) {
		
		/*
		 * 변수 선언 방법
		 * 데이터 타입 이름;
		 * int 는 정수값을 저장하는 대표적 유형
		 * string은 문자열을 저장하는 대표적 유형
		 */
		int num;
		//초기화 (초기값)
		num = 10;
		
		System.out.println(num);
	
		// 변수의 성언과 초기화 동시에 
		int num2 = 20;
		
		// 같은 이름으로 변수를 생성할 수 없음 (중복된 이름)
		//int num = 100;
		
		// 변수는 다른 변수의 값, 또는 연산의 결과도 저장할 수 있습니다. 
		
		int result = num + num2 + num + 10 ;
		
		System.out.println(result);
		
		//문자열 저장
		String str = "안녕";
				
		// 변수는 타입이 다르면, 바로 저장할 수 없음
		//int num3 = str;
		
		System.out.println("------------------");
		
		int result2 = num + num+20;
		result2 = 100;
		result2 = 50;
				
	
	}
	
}
