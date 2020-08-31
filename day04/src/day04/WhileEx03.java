package day04;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		int sum = 0;
//		int num = 0;
		int i = 1;
		while(i<=10) {
			Scanner scan = new Scanner(System.in);
			System.out.print("정수입력->");
			int num = scan.nextInt();
			sum += num; 
			i++;  // while ()앞에 조건처럼 영향받음
			
			System.out.println("입력받은수의 합" + sum);
		}
		
	}
}
