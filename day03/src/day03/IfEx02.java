package day03;

import java.util.Scanner;

public class IfEx02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수>" );
		int point = scan.nextInt();  //오류
		
		if(point >= 90) {
			System.out.println("A");
		}else if(point >=80) {	//80 <= x < 90
			System.out.println("B");
		}else if(point >=70) {
			System.out.println("C");
		}else if(point >=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
