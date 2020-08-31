package day06;

import java.util.Arrays;
import java.util.Scanner;

public class arrayinsertEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];
		int count = 0;			// 입력받은 개수를 카운트해서 index로 사용하는 변수
		System.out.println("먹고싶은 메뉴를 선택하세요 ->");
		System.out.println("입력을 중지하려면 [그만]을 입력하세요");
		
		
		while(true) {
		
			System.out.print("->");
			String menu = scan.nextLine();
			
			if(menu.equals("그만")) {
				System.out.println("입력 종료");
				break;
			}
			
			arr[count] = menu;  		// arr[] 변수			
			count++; 
			

		}
		// 입력 종료수 , 출력 조건
		System.out.println("======= 입력 받은 메뉴 =======");
		for(int i =0; i<count; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
