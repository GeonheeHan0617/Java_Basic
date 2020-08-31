package calculator;

public class Objectbasic02 {   // = Calculator 파일에 있음

	public static void main(String[] args) {
		
		Calculator call = new Calculator();
		
		System.out.println("==============1번계산기===============");
		System.out.println( call.add(1)); 		//result1
		System.out.println( call.add(2));
		System.out.println( call.add(3));
		
		Calculator cal2 =new Calculator();
		
		System.out.println("==============2번계산기===============");
		System.out.println( call.add(10)); 		//result2
		System.out.println( call.add(20));
		System.out.println( call.add(30));
		
		Calculator cal3 = new Calculator();
		System.out.println("==============3번계산기===============");
		System.out.println( call.add(100));
		System.out.println( call.add(200));
		System.out.println( call.add(300));
	}
}
