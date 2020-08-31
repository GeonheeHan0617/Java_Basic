package day02;

public class OperatorEx03 {
	public static void main(String[] args) {
		
		int x = 10, y = 20;
		// if 뒤에 소관호 가 true 이면 if 중괄호를 실행, false라면 else 중괄호르 실행
		
		if(x == 10 && ++y == 21) {			//두개 짜리 연산자 논리연산자는 
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다");
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		if(x == 10 || ++y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다");
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
		
		
	}
}
