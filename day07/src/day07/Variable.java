package day07;

public class Variable {

			//메인에서는 가능하지만 여기서는 불가능함		int a;  a= 10;
										
	//맴버변수: 초기화를 하지 않으면 자동으로 초기화
	int a;
	int c;
	
	// 메서드 선언
	void printNumber(int c) {
		
		int b = 1; 
		System.out.println("맴버:" +a);
		System.out.println("지역:" +b);
		System.out.println("매개:" +c);
		
	}
	
}
