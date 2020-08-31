package day08;

import java.util.Arrays;

public class prtest01 {

	public static void main(String[] args) {
		
		method1();		//java 칩
		
		System.out.println(method2("method2 리턴 연습")); 
		
		System.out.println(method3(1,2,3.5)); //6.5
		
		System.out.println(method4(3)); //홀수
	
		method5("출력 회수 확인: ", 5);
		
		System.out.println(method6(6));
		
		int[] arr7= {1,2,3,4,5,77,8,9,0};
		System.out.println(method7(arr7));
		
		System.out.println(Arrays.toString(method8("자바칩","카라멜 마끼아또")));
		
		System.out.println(maxNum(3,14));
		
		System.out.println(abs(-123210));
	}
	
	static void method1() {
		System.out.println("java 칩");
		
	}
	static String method2(String a) {
		return a;
	}
	static double method3(int a, int b, double c) {
		double result3 = a+b+c;
				return result3;
	}
	static String method4(int i) {
		
		String str = " ";
		if(i%2 ==0) {
			return "짝수";
		}else {
			return "홀수";
		}
	}
	static void method5 (String a, int b) {
		
		for(int i =0; i<b; i++) {
			System.out.println(a+ "감사합니다.");
		}
				
	}
	static int method6 (int s) {
		
		int sum =0;
		for(int i =0; i<=s; i++) {
			sum += i;
		}return sum;
	}
	static int method7 (int[] arr) {
		
		int arr7 = arr.length;
		return arr7;
	}
	static String[] method8 (String a, String b) {
		String [] ar8 = {a,b};
		return ar8;
	}
	static int maxNum(int a, int b ) {
		if (a>b) {
			return a;
		}else {
			return b;
		}
	}
	static int abs (int a) {
		
		return a > 0 ? a: -a; 
	}

}
