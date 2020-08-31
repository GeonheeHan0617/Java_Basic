package day07;

public class MethodEx03 {

	public static void main(String[] args) {
		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type입니다. 
		 * 2. 반환유형이 있는 메서드는 호출구문이 하나의 값이 되기 때문에 다른 메서드의 매개값으로도 사용됩니다.
		 * ex> println(메서드 호출); 
		 * 
		 * 3. 반환값이 없는 경우는 반환유형 자리에 void라고 적습니다.
		 * 4. 모든 메서드를 return를 만나면 강제 종료 됩니다.
		 * 		그렇기 때문에 return아래에 코드를 작성할 수 없습니다. 
		 *  ** 배열을 전달하는 방법
		 * 
		 */
		int result = add( add(1,2) , add(2,3));  						//add( add( , ),( , ));
		System.out.println("결과: " + result);
		
		System.out.println(add(2,3));
		
																		//System.out.println( sub(5,2));
																		//int result2 = sub(3,1);		void 형 메서드는 return 값이 없기 때문에 단순히 호출만 가능함.
		sub(5,2);
		
		noReturn("똑똑이");
																		//sub (5,2);  반환유형이 없는 메서드 System.out.println() 에 있음
		
		
	} //메인 끝
	
	static int add(int a, int b) {
		
		return a+b;
	}
	// 반환유형이 없는 메서드
	static void sub(int a, int b)	{
		System.out.println(a +"-"+ b+ "="+ (a-b));
		
		
	}
	
	// 반환 유형이 없고, 매개변수도 없는 메서드
	static void multi() { 											//return 사용할 수있지만 값은 적은 수 없음 ; 호출만 가능함
		System.out.println("5x3 =15");
		return;
		
	}
	
	// 반환 유형 , 메개 if(s.equals("문자열"));
	static void noReturn(String s) {
		
		if(s.equals("-똑똑이-") ) {
			System.out.println("똑똑한 사람");
			return;													// 예외적으로만 사용함 return 사용하면 다름
			
		}
			
		System.out.println(s + "문자열이 아니고 똑똑이를 입력하세요");
	}
	
}
