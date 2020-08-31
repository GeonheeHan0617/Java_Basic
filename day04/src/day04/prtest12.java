package day04;

import java.util.Scanner;

public class prtest12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수값은: ");
		int a = scan.nextInt();
		System.out.println("두번째 정수값은: ");
		int b = scan.nextInt();
		
		int sum = 0;
		if (a == b) {
			sum = 0;
		} else if (a>b) {
			for(int i = b; i<=a; i++) {
				sum += i;
			}
			
		}else {
			for(int i = a; i<=b; i++) {
				sum+=1;
			}
		}
		System.out.println("합계: "+ sum);
	} 
}
