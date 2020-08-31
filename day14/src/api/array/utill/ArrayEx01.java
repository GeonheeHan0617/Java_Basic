package api.array.utill;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {
		int [] arr = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		// 배열의 정렬
		Arrays.sort(arr);
		
		// 배열의 검색 (선행 조건 : 오름차순 정렬)
		int index =	Arrays.binarySearch(arr, 5) ;
	
		System.out.println("5가 있는 위치" + index);
	
		int index2 = Arrays.binarySearch(arr, 123);
		System.out.println("위치확인: "+index2); //찾는 값이 없다면 쓰레기 값으로 돌립니다. 
	
		System.out.println("===============================================");
		
		// 배열 복사
		int[] copyArr = Arrays.copyOf( arr, arr.length);
		
		// 배열 문자열로 확인
		System.out.println(Arrays.toString(copyArr));
		
		System.out.println("===============================================");
		// 배열복사
		int [ ] copyArr2 = Arrays.copyOfRange(arr,3,arr.length);
		System.out.println(Arrays.toString(copyArr2));
		
		System.out.println("===============================================");
		if (Arrays.equals(arr,copyArr)) {
			System.out.println("배열의 요소가 같다.");
		}
		Arrays.asList(arr);
		
	}
}
