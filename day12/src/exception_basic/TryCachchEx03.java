package exception_basic;

import java.util.Scanner;

public class TryCachchEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		while (true) {
			
			try {
			System.out.println("->");
			int n = scan.nextInt();
			
			}catch (Exception e) {
				System.out.println("숫자로 입력해주세요");
				scan.nextLine(); // nextline 은 엔터값을 포함해서 값을 받아 들임	
			}finally {
				
			}
			
		}
	}
}
