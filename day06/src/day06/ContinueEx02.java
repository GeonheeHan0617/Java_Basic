package day06;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {			//Quiz30 문제 배껴옴
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("정수 입력");  
		int num =scan.nextInt();
			
		int count =0;
		int sum =0;
		start:for(int i =1; i <=num; i++) {
			//소수 판별을 위한 for
				
			count = 0;
			for(int j =1; j <= i; j++) {
					
				if(i%j == 0) {
					count++;
					
				}
				if(count >2)
					break start;
			}
			if(count == 2)
				sum += i;
				
		}
		System.out.println("1에서" + num +"까지 합:"+sum );
	}		
}