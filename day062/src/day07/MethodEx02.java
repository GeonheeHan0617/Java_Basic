package day07;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매게 변수(parameter)
		 * 1. 매개변수는 메서드 호출 할 때 실행에 필요한 값을 전달하는 매개체 입니다.
		 * 2. 매개변수를 몇개 받을지는 메서드를 선언 할 때 결정합니다.
		 * 
		 * 3. 매개변수를 여러개 받고 싶으면  , 로 연결하면 됩니다
		 * 4. 매개변수를 받지 않는다면() 를 비워두면 됩니다.
		 * 
		 */
						// int end 안에 숫자 적기
		System.out.println("1~100까지 합: "+calSum(100) +" 입니다." );
		System.out.println("1~50까지 합: " +calSum(50)+" 입니다.");
		System.out.println("1~10까지 합: " +calSum(5)+" 입니다.");
		
		int result = calSum2(10,20);
		System.out.println("10~20까지 합: " +result);  // start =10 ,end =20
		
		String result2 = calSum3(1,10,"  10개 중복");
		System.out.println("결과:"+ result2);
		
		
	}// 메인 끝
	
	static int calSum(int end) {	  				// ex> 변수 선언 int end= 100  효율적인 동작 
													// return 0; 
		
		int sum= 0;
		for( int i = 1; i<= end; i++) {				//  i <= 100
			sum += i;
			
		}
		return sum;
	}
	
	static int calSum2 (int start, int end) {		// , 표시 가능함
		
		int sum =0;
		for( int i = start; i <= end; i++) {  			 // start =10 ,end =20
			sum += i;
			
		}
		return sum;
		
	}

	static String calSum3(int start, int end, String s) {  //숫자, 숫자, 문자열
		
		String str = "";
		for(int i = start; i <= end; i++) {
			str += s;
		}
		return str;
	}
	
	
	
	
	
	
	
}
