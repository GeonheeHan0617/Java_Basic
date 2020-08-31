package day03;

import java.util.Scanner;//import 해야한다
	 
public class Poly01 {
	 
	public static void main(String[] args) {
	    	
        System.out.println("당신의 점수를 입력하세요");
	        // int 형을 콘솔 창에서 입력 받기 위한 코드 입력 명령/Scanner에 마우스 가져다되면 import 나온다 클릭 
        int num = (new Scanner(System.in)).nextInt();
	 
	        // 조건문 입력하는 값이 90과 같거가 크다면 A를 출력해라 
        if (num>=90) {
            System.out.println("당신의 성적은 A입니다");
	            // 조건문 입력하는 값이 80과 같거가 크다면 B를 출력해라 
        }else if(num>=80) {
            System.out.println("당신의 성적은 B입니다");
	            // 조건문 입력하는 값이 70과 같거가 크다면 C를 출력해라 
        }else if(num>=70) {
	            System.out.println("당신의 성적은 c입니다");
	            // 조건문 입력하는 값이 60과 같거가 크다면 B를 출력해라 
        }else if(num>=60) {
            System.out.println("당신의 성적은 D입니다");
	            //// 조건문 60미만은 다  F 를 출력해라 
        }else {
            System.out.println("당신의 성적은 F입니다");
        }
	}
}


