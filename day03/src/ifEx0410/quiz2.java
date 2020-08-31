package ifEx0410;

import java.util.Scanner;

public class quiz2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
	
		

		int max = 0;
		int mid = 0;
		int min = 0;
		
	
		System.out.print("첫번째수->");
		int num1 = scan.nextInt();
		System.out.print("두번째수->");
		int num2 = scan.nextInt();
		System.out.print("세번째수->");
		int num3 = scan.nextInt();
		
		if(num1 >num2 && num1 >num3 ) {
			
			max =num1;
			
			if(num2 > num3) {
				mid =num2;
				min =num3;
			}else {
				mid = num3;
				min = num2;
			}
		}else if (num2 > num1 && num2> num3) {
			max =num2;
			
			if (num1> num3) {
				mid = num1;
				min = num3;
			}else {
				mid = num3;
				min = num1;
			}
		}else {
			
			max = num3;
			
			if(num2> num1) {
				mid = num2;
				min = num1;
			}else {
				mid = num1;
				min = num2;
			
			}
		}
		System.out.println("max:"+max);
		System.out.println("mid:"+mid);		
		System.out.println("min:"+min);		
	}
}
