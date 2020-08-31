package day03;

public class SwichEx01 {

	public static void main(String[] args) {
		
		int a = 5;
		
		// switch() 구문의 소괄호 에는 변수나, 변수의 연산식 -> 값이 들어감
		switch(a) {
		case 0:
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:	
			System.out.println("3입니다.");
			break;
			
		default :
			System.out.println("1,2,3 이 아닙니다.");
		}
		
		// swit ctrl + space바
		
		/*
		switch (key) {
		case value:
			
			break;

		default:
			break;
		*/
		
	}
}
