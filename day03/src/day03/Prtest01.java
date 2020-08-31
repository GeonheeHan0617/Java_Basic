package day03;

import java.util.Scanner;

public class Prtest01 {
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요 >");
		int point = scan.nextInt();
		
		if (point>=90 ) {
			if(point > 100) {
				System.out.println("잘못된 점수입니다.");
			} else if (point>=95 ) {
				System.out.println("A+학점입니다.");
			} else {
				System.out.println("A학점 입니다.");
			}	
		}
		else if(point >= 80){
			System.out.println("B"); 
		}else if (point >= 70){
			System.out.println("C");
		}else if (point >= 60){
			System.out.println("D");
		}
		else {
			System.out.println("F입니다.");
		}
		
	}
	
}
