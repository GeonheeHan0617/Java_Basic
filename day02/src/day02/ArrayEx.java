package day02;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		//1. 배열의 선언    -  arr 가장 첫번째 위치함
		int[] arr; 			// java 방법 int[] arr , c언어방법 int arr[]

		//2. 배열의 생성 - q 배열은 생성시에 크기를 명시함, 한번 설정된 크기는 변경 불가
		arr = new int[5];
		
		System.out.println(arr); 	// 0번째 상자가 만들어진 위치를 저장
		
		//3. 배열의 초기화
		arr[0] = 34;
		arr[1] = 100;
		arr[2] = 300;
		arr[3] = 56;
		arr[4] = 200;
		
		//4. 배열의 사용
		System.out.println("배열의 2번째 값:" + arr[1] );
		
		arr[2] = 123;
		System.out.println("배열의 3번재 값:" + arr[2]);
		
		//5. 배열의 저장된 값을 한눈에 문자열로 확인
		
		System.out.println( Arrays.toString(arr)  );
		System.out.println("======================");
		//6. 배열의 길이를 알아보는 명령어 배열병, length
		System.out.println("배열의 길이: "+ arr.length);
		System.out.println("++++++++++++++++++");
		//7. 배열의 선언과 생성을 동시에 하는 방법
		byte[] arr2 = new byte[10];
		
		System.out.println(Arrays.toString(arr2));
		System.out.println("+------------------+");
		//8. 배열의 선언과 생성과 초기화 동시에 하는 방법 
		short[] arr3 = new short[] {10,20,30,40};
		System.out.println( Arrays.toString(arr3)  );
		
		short[] arr4 = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr4));
		
		// 배열의 초기값 설정을 하지 않으면 기본값으로 초기화
		System.out.println(Arrays.toString(arr2));
		
		
		// String 배열 생성 월요일 ,화요일, 수요일 저장
		
		
		String[] arr5 = {"월요일","화요일","수요일" };
		System.out.println( Arrays.toString(arr5) );
		
		
		// 3개의 크기 int 배열을 생성 Math,random() 으로 1~3 까지 랜덤값을 각각 저장하시오
		int[] arr6 = new int[3];
		arr6[0] = (int)(Math.random( )* 5 )+ 1;
		arr6[1] = (int)(Math.random( )* 5 )+ 1;
		arr6[2] = (int)(Math.random( )* 5 )+ 1;
		System.out.println(Arrays.toString(arr6));
		
	
		//  arr7 
		int[] arr7 = new int[3];
		System.out.println(Arrays.toString(arr7));	// 0 0 0
	}
}
