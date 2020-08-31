package day02;

public class UnaryOperator {
	public static void main(String[] args) {
		
		// 단항 연산자
		
		// 부호 연산자 +,-
		int i = -3;  	//양수의 의미
		int j = -i;		// -(-i)는 양수	
	
				
		// 증감연산자 ++,--
		int k = 1;
		int h = k ++;		//후위연산자 -먼저값을 대입하고, 그다음에 증가
		System.out.println("k값:" + k);
		System.out.println("h값:" + h);
			
		int x = 1;
		int y = ++x;  	//전위 연산자 - 먼저값을증가하고, 그다음에 저장
		System.out.print("x값:" + x);
		System.out.print("y값:" + y);
		
		//일반적인 사용  (*********)
		x = 1;
		x++;
		++x;
		
		System.out.println("x는?" + x);  //x값:2y값:2x는?3
		
		x = 1;
		y = 1;
		
		System.out.println(x++); //1
		System.out.println(++x); //3
		
		x = 10;
		y = 10;
		
		int result = x++ + ++y +10;
		System.out.println(result);  //31
		
		// 예외사항
		x = 10;
		y = 10;
		
		int result2 = x++ + x++ + x++;	//33
		System.out.println(result2);
	
		System.out.println("===============================");
		// 비트 연산자					//     8421
		byte b =10 ; 				//0000 1010
		System.out.println(~b); 	//1111 0101   (뒤집음 10->11)
									//-11 
		System.out.println("===============================");
		
		//논리 반전 연산자 !!
		System.out.println(!true);		//false
		System.out.println(!false);		//true
		
		System.out.println("===============================");
		boolean bool = !true;			
		System.out.println(!bool);			//true
		
		
		//(/나누기 몫 %나누기 나머지
		
		

		
		
	}
}
