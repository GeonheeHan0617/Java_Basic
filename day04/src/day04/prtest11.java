package day04;

import java.util.Scanner;

public class prtest11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력->");
		int num = scan.nextInt();
		
		int fac = 1;
		for(int i = 1; i<= num ; i++) {
			fac *= i;
		}
		System.out.print("값:"+fac);
	}
}
