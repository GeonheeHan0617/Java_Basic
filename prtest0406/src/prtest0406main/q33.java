package prtest0406main;

import java.util.Scanner;

public class q33 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 1;
		while(true) {
		
		int a =scan.nextInt() ;
		int b = (int) (Math.random()*100+ 1) ;
		
		count++;
		
		if ( a>b) {
			System.out.println("더 적은 수를 입력하세요 \n"+a+">"+b );
			System.out.println("시도 횟수: " +count);
		}else if (a<b) {
			System.out.println("더 큰 수를 입력하세요\n" + a+"<"+b);
			System.out.println("시도 횟수: "+count);
			
		}else {
			System.out.println("정답입니다. \n"+a+"=" +b);
			break;
		}
		
		}
	}
}
