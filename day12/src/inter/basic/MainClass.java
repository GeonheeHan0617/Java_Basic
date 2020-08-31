package inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic () ;
		b.method1();
		b.method2();
		b.method3();
		System.out.println(b.ABC);
		System.out.println(b.PI);
		
		/*
		 * 인터페이스도 하나의 데이터 타입이 될 수 있다. 
		 * 인터페이스에 객체를 저장했을 때, 다형성을 실행하는 원리와 동일하게 시행.
		 */
		Inter1 i1 =b; // 부모형 타입은 inteface 하나만 가능함
		i1.method1();
		i1.method2();
		
		Inter2 i2 =b;
//		i2.method1();		사용할 수 없음
		i2.method2();
		
		
		// 인터페이스에서도 클래스 캐스팅을 사용할 수 있다. 
		Basic bb = (Basic)i1;
		
		
 	
		
	}
}
