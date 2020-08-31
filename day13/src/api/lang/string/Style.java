package api.lang.string;

import java.util.Arrays;

public class Style {
	
	public static void main(String[] args) {
		
		
		// chatAt = 특정 인덱스의 글자를 리턴.
		String str = "안녕하세요" ;
		char a =str.charAt(0);
		
		System.out.println(a);
	
		
		int i = str.indexOf("요");
		System.out.println(i);
		int j = str.indexOf("1");
		System.out.println(j);		// 없으면 -1 나옴

	
			// length
		System.out.println("문자열 길이:" + str.length());
		
		System.out.println("===================================");
		// replace - 특정문자열의 변경
		String str2 = "자바칩 음료는 맛있다. 자바칩은 Starbuck에 있습니다." ;
		String result2 = str2.replace("자바칩","Javachip");
		
		
		System.out.println(str2);
		System.out.println(result2);
		System.out.println("===================================");
		// 공백제거
		result2 = result2.replace(" ","" );
		System.out.println(result2);
		
		System.out.println("===================================");
		// substring - 문자열 자르기	기능			
		String str3 = "123123-345345";
		String result3 = str3.substring(10);		// 매개값을 한개만 주면 앞문자 제거
		System.out.println(result3);
		
	
		
		System.out.println("===================================");
		//trim 
		String str4 = " 홍길동    -/   " ;
		str4 = str4.trim();	//. trim(): 문자열의 앞, 뒤 공백을 제거합니다. 
		
		System.out.println(str4);
		System.out.println("===================================");
		
		// valueOf - 기본형을 문자열로 변경
		System.out.println(String.valueOf(3) + String.valueOf(4) );
		
		// split - 문자열 자르기
		String str5 = "010-1234-4567입니다." ;
		String [] arr = str5.split("-");
		String [] arr1 = str5.split("");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
	
		
		String[] arr2 = str5.split("-",3);		//길이 재한
		System.out.println(Arrays.toString(arr2));
		
	}
}
		