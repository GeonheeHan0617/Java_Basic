package api.utill.token;

import java.util.StringTokenizer;

public class TokenEx01 {

	public static void main(String[] args) {
		
		// String Tokenizer 클래쓰 - 특정문자를 기준으로 문자를 잘라서 사용함
		
		String str1 = "오늘 날씨는 참 좋고 맑습니다.";		
		String str2 = "2020/04/16";
		
		StringTokenizer token1 = new StringTokenizer(str1);
	
		System.out.println(token1.countTokens());		// 토큰 사용전에 몇개의 토큰이 있는 지 검사
//		System.out.println(token1);	
		
		//반복자
	
//		System.out.print(token1.nextToken(" "));
//		System.out.print(token1.nextToken(" "));
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
		
		while(token1.hasMoreTokens()) {         // 검사할 다음 토큰이 있으면 true 반환
			System.out.println(token1.nextToken());
			
			
		}
		System.out.println(token1.countTokens());
		System.out.println("===================================================");
		StringTokenizer token2 = new StringTokenizer (str2, "/") ; // 를 기준으로 자름
		
		while (token2.hasMoreTokens()) {
			System.out.println(token2.nextToken());
		}

		
		
	}
}
