package day02;

public class OpertorEx02 {
	public static void main(String[] args) {
		
		
		// 2항 연산자
		int i = 7 / 3; //2
		int j = 7 % 3;	//1
		int k = 7 * 3;	//2
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println("========================");
		System.out.println(i == j); //f
		System.out.println(i != j); //t
		System.out.println(i >= j); //t
		System.out.println(i < j); //f
		System.out.println(k != 21); //f
		System.out.println(k % 2 != 0); //t
		System.out.println(k % 2 == 1); //t
		System.out.println("========================");
		//비트연산자
		int a = 5; 
		int b = 3;
		
		
		// 참고   & | ^ >>
		
		System.out.println(a & b); //0000 0001	-> 두비트값이 1 이면 1을 반환
		System.out.println(a | b); //0000 0111	-> 두 비트중 하나만 1이여도 1을 반환
		System.out.println(a ^ b); //0000 0110	-> 다르면 1 같으면 0
		
		// 비트 쉬프트 >><<
		int h = 100;
		System.out.println(h>>2);   
		
		// 논리연산자 &,|,&&,||
		
		// &: 양 쪽이 true 면 true 이다. 단, 한쪽만 false 나오면 false 나옴
		// |: 한 쪽이 true가 나오고 false 나와도 true 이다. 단, 양쪽이 false이면 false이다.
		// && : 만약에 왼쪽 항이 false일 경우에는 오른쪽 항을 수행하지 않고 무조건 false 이다. (비교할 때 많이 사용함)
		// || : 만약에 왼쪽 항이 true일 경우에는 오른쪽 항 수행하지 않고 무조건 true 이다.
		

		
		
	}
}
