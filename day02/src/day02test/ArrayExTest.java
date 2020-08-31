package day02test;

import java.util.Arrays;

public class ArrayExTest {

	public static void main(String[] args) {
	
		int[] arr;
		
		arr = new int[5];
		
		System.out.println(arr);
	
		arr[0] = 101;
		arr[1] = 1002;
		arr[2] = 300;
		arr[3] = 2;
		arr[4] = 5;
		
		System.out.println("1번째 배열의 값: "+ arr[0]);
		System.out.println("2+3 번째 합친값: "+ arr[1]+arr[2] );
		System.out.println("2+3 번째 합친값: "+ arr[1+2] );
		System.out.println(Arrays.toString(arr));
	}
}
