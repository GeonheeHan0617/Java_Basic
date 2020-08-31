package day07;

public class MethodEx01 {

	public static void main(String[] args) {
		/*
		 * 메서드는 메서드 내부에 선언 할 수 없습니다. 
		 * main 밖에, 클래스 안 어디서든 선언 할 수 있습니다. 
		 *  
		 */
		System.out.println("1~100까지 합:" +calSum() );
		System.out.println("1~100까지 합:" +calSum() );
		System.out.println("1~100까지 합:" +calSum() );
		
		int result = calSum();
		System.out.println("1~100까지 합:"+result+0); //static int calSum() 
		
		String result2 = randomStr();
		System.out.println("결과:"+ result2 );	//static String randomStr()
		
		String result3 = randomStr2();
		System.out.println("결과:" + result3);
		
	}// 메인의 끝 
	//int = type	calSum = name ()=매게변수
	static int calSum() {	// 메서드 만든 예시
		int sum =0;
		for( int i =1; i<=100 ; i++) {
			sum += i;		
		}
		return sum; //int 앞에 있으므로  return 앞에 변수값 넣기 ex> 0 ,sum, 1
	}
	
	static String randomStr() {
		
		String str = "";
		for (char c = 'A'; c <='Z'; c++) {
			str +=c ;
		}
		
		return str; //이럴경우 숫자가 아닌 문자열 들어가야 함.
		
	}
	
	static String randomStr2() {
		double d = Math.random();
		
		String str = "";
		if(d> 0.66)  {
			return "가위"; 	//str ="가위";
		}else if(d>0.33) {
			return "바위"; 	//str ="바위";
		}else {
			return "보"; 	//str ="보";
		}
		
		 					//return str;
	}
	
}
