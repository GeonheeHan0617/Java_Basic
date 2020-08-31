package day04;

import java.util.Arrays;
import java.util.Scanner;

public class prtest05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력:");
		int num = scan.nextInt();
		
		int[] arr = new int[num];
		int i = 0;
		while(i < arr.length) {
			arr[i] =i+1;
			
			i++;
		}
		System.out.println(Arrays.toString(arr));
		
	}
}
