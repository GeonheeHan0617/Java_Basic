package prtest0406main;

import java.util.Scanner;

public class MethodPretest {

	public static void main(String[] args) {
		
		print();
		
		int a = input();
		System.out.println("그다음 정수를 입력하세요");
		int b = input();
		
		int result = add(a,b);
		
		shownResult(result);
		
	}

	static void print() {
		System.out.println("정수를 입력하세요");
	}
	static int input() {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt() ;
		return a;
	}
	static int add(int a , int b ) {
		int result = a + b ;
		return result;
		
	}
	static void shownResult(int result) {
		System.out.println("결과: "+ result);
	}
}
