package prtest0406main;

import java.util.Scanner;

public class q34 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("금액 입력: " );
		int money = scan.nextInt();
		
		
		end:while (true) {
			System.out.println("남은 금액"+ money + " 원");
			System.out.println("1. 데미소다 600원 / 2. 콜라 500원/ 3. 레쓰비 400원  /4. 잔돈 받기");
			int i = scan.nextInt();
			
		switch (i) {
		case 1:
			if(money<600) {
				System.out.println("금액이 부족합니다.");
			}else {
				money -= 600;
				System.out.println("데미소다를 받습니다.");
			}
			break;
		case 2:
			if(money<500) {
				System.out.println("금액이 부족합니다.");
			}else {
				money -=500;
				System.out.println("콜라를 받습니다. ");
			}
			break;
		case 3:
			if(money<400) {
				System.out.println("금액이 부족합니다.");
			}else {
				money -=400;
				System.out.println("레쓰비를 받습니다.");
			}
			
		default:
			System.out.println("잔돈은 :"+money+ "원 입니다.");
			
			break end;
		}
		
		
		
		}
		
		
	}
	
}
