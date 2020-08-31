package api.utill.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random ran = new Random();
		int i = ran.nextInt();
		System.out.println(i); 		// 인트 범위
		
		int a = ran.nextInt(10) +1 ;		//1~10까지 값
		System.out.println(a);
		
		double y = ran.nextDouble();
		System.out.println(y);		// 0~1.0 까지의 실수 범위;
		
		System.out.println(a+i+y);
		
		
		
		
	}
}
