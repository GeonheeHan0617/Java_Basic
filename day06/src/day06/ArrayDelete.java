package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args) {
		/*
		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		//4 번째 index 삭제 표현
		for(int i =4; i<arr.length; i++ )  {
			arr[i] =arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
		*/
		
		Scanner scan = new Scanner(System.in);
		String[] arr = {"강타","문희준","토니안","장우혁","이재원"};
		
		System.out.println("삭제할 학생의 별명을 입력하세요->");
		String name = scan.next();
		
		int count = arr.length; 
		boolean chk = true;
		
		for(int i = 0; i< count; i++) {
			
			if(name.equals(arr[i])){
			System.out.println(arr[i] + " 학생을 삭제합니다.");
			System.out.println("->");
			
				for(int j = i; j <count-1 ; j++) {
					arr[j] = arr [j+1]; 
			}
		
				//삭제의 의미
				chk =false; 
				count--;
			}
		}
		if(chk) {
			System.out.println("별명이 존재하지 않습니다.");
		}else {
			for(int i= 0; i<count; i++) {
			System.out.println(arr[i]+ " ");
			//미완성-
		
			}
			
			}
	}
}
