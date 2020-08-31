package day04;

import java.util.Arrays;

public class prtest02 {

	public static void main(String[] args) {
		
	int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};	
	
	int[] a = new int[3];
	
	for(int i=1; i<arr.length; i++) {
		int x = (int)(Math.random()*12);
		int temp = 0;
		temp = arr[x];
		arr[x] = arr[i];
		arr[i] = temp;
	}
	for(int i = 0; i<a.length; i++) {
		a[i] = arr[i];
	}
	System.out.println(Arrays.toString(a) );
	}
}		

