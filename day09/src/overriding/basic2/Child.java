package overriding.basic2;

public class Child extends Parent {			

	void method2() {
		System.out.println("자식의 재정의 된 2번 메서드의 호출");
	}
	void method3() {	// 오버라딩의 예시
		System.out.println("재정의 된 메서드가 아닙니다.");
	}
	
}
