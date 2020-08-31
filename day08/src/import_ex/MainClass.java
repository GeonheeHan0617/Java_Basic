package import_ex;



// import 는 클래스 선언부 위에 패키지명을 포함한 전체 경로를 적습니다. 
//import fruit.Apple;
//import fruit.Orange;
import fruit.*; //가져올 파일 많을 경우 적는다. 

import java.util.Scanner;

import com.abc.ABC;
import com.def.DEF;


public class MainClass {

	public static void main(String[] args) {
	//   type/변수 /만드는  
		Apple a = new Apple(); //new Apple 객체  
		
		Orange o = new Orange();
		
		ABC abc =new ABC();
		
		DEF def = new DEF();
		
		Scanner scan = new Scanner(System.in);  //java.util 파일
		// new Scanner(System.in);
		
		System.out.println("");
		System.out.println("==================================");
		System.out.println("==================================");
		int i =1;
		// 1) 기본타입,  2,3,4) 참조타입
		System.out.println(i);  		// 1) 값		
		System.out.println(a);			// 2) 주소값
		System.out.println(o);			// 3) 주소값
		System.out.println(scan);		// 4) java.util.Scanner 값 !! 진짜 김	input(); 할 때 사용함	
		
		
		
	}
}
