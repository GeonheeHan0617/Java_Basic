package day02;

public class VariableScope {
	
	public static void main(String[] args) {
		
		//int num1 = 10;
		//int num2 = 20;
		int num1 = 10, num2 = 20;
		int num4 = 0;
		// 변수는 해당 중괄호 안에서만 유호합니다. 
		
		if(true) {
			int num3 = num1 + num2;
			num3 = num1;
			
			
			num4 = 20;
				
		}
	int num3 = 100;
		System.out.println(num3); //100
		System.out.println(num4); //20	

		//  +5  -5  	=  0
		// 0000 0101	
		// 1111 1011 	# 뒤집고 1더하기

		
		// 1110 0111 
		// 0001 1000    # 뒤집고 1더하기
		// 0001 1001	# -25
		
		System.out.println(num3);
	
	
	}
}

