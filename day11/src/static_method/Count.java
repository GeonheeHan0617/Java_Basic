package static_method;

public class Count {

	public int a;
	public static int b;

	// 일반 메서드  - 일반맴버변수, 정적 맴버변수 모두 사용이 가능함.
	public int method1() {
		a = 10;
		
		return ++b;
		
	}
	
	// 정적메서드 - static 이 붙은 변수나 메서드만 사용가능
	// 		단, 객체생성을 통해서는 일반 변수의 사용이 가능함.  a  사용 x 
	public static int method2() {
//		a = 10;				 // 일반 변수가 사용이 불가능 한 이유 static이 없음 
		
		Count c = new Count() ;
		c.a =10;
		
		return ++b;
		
		
		
	}
	
}
