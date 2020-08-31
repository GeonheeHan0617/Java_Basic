package day05;

import java.util.Scanner;

public class prtest0327_1 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요:");
		int num = scan.nextInt();
		
		int i = 2 ;
		while (num % i !=0 ) {
			i++;
		}
		System.out.println(num == i ?num + "은 소수": num + "소수가 아닙니다.");
	}
}
