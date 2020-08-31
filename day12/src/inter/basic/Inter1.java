package inter.basic;

public interface Inter1 {

	// 상수의 추상 메서드 정의합니다. 
	double PI = 3.14; 	// 인터페이스에 변수를 선언 하면 자동으로 상수로 선언됩니다. 
	
	public void method1(); 		// 인터페이스에 메서드를 선언하면 자동으로 추상메서트가 됩니다. 
	
	public default void method2(){
	
	}
	public default void method() {
		
	}
	
	
}
