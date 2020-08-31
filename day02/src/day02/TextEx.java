package day02;

public class TextEx {

	public static void main(String[] args) {
		
		// 단일문자를 저장하는 데이터타입 char
		char c1 = 'A';
		char c2 =  65;			// 아스키 코드로 만든것  65-> A
		char cd3 = 106;			// ex> 러시아어
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(cd3);
		System.out.println("----------------------------");
		
		// 문자를 통일 하기 위해서 유니코드의 등장 -> 2byte의 크기로 확장하고 65536개 표현 가능함
		
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAC00';
		
		System.out.println(c3 + " " + c4 + " " + c5);
		System.out.println("----------------------------");
		// 문자열을 저장할 수 있는 String
		String s1 = "hello";
		String	s2 = "world";
		String 	s3 = "java";
		
		//문자열은 + 로 붙일때 문자열을 붙인 결과를 가지고 옵니다. 
		System.out.println(s1 + s3 + s2);
		System.out.println("문자열의 길이" + s1.length() );
		System.out.println("----------------------------");
		// 문자열과 다른데이터 타입의 + 연산
		System.out.println(100+200);
		System.out.println("100"+200);  // 문자열에 다른타입이 붙으면 -> 결과는 무조건 문자열
		System.out.println(100 + 200 +"world");
		System.out.println("hello" + 100 + 200);
		System.out.println("----------------------------");
		
		System.out.println("A" + 10);		//  "A"문자로 나옴
		System.out.println('A' + 10); 		//	'A'는 아스키코드로 나옴
		
		
		
	
	}
}
