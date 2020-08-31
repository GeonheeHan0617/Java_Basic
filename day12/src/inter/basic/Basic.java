package inter.basic;

public class Basic implements Inter1,Inter2 {// 빨간줄 나오는 이유는 오버라이딩 하라는 뜻임

	// 1. 인터페이스의 구현 (상속) 키워드 implement 입니다. 
	// 2. 인터페이스는 다른 상속이 가증합니다. 
	// 3. 인터페이스에 선언된 추상메서드는 반드시 자식  클래스에서 오버라이딩 합니다. 
	
	public void method1 () {
		System.out.println(" 재정의 된 1번 메서드 호출");
		
	}


	public void method2() {
		System.out.println(" 재정의 된 2번 메서드 호출");
	}
	
	public void method3() {
		System.out.println("Basic 에 있는 메서드 호출");
	}
	
}
