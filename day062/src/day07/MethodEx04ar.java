	package day07;

import java.util.Arrays;

public class MethodEx04ar {

	public static void main(String[] args) {
		// 메서드의 메개변수, 반환유형으로 배열을 전달하는 방법.
		
		int [] arr = {1,2,3,4,5};			
		method01(arr);
		
		
		String[] arr2 = method02();
		System.out.println(Arrays.toString(arr2));
		
		
	}
	
	static void method01(int[] arr) {				//arr 뒤에 작성 가능, int a
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	static String[] method02() {
	
		String[] week = {"월", "화", "수"};
		
		return week;
		
		
	}
	
	// protected synchronized final ArrayList<String> test(obfect[] arr, int a, Vector<object> arr2) throws Exception	{			//참고  
		
	// }

}
