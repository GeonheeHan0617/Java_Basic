package poly.basic;

/*
 * java 에서는 하나의 클래쓰 파일에 여러 클래쓰 선언이 가능함
 * 단, 파일명과 동일한 클래스가 존재해야하고, 해당 클래스 만 public이여야 함.
 */


class A {}
class B extends A{}
class C extends B{}
class D extends C{}
class E extends D{}


public class Basic {

	
	/*
	 * 다형성
	 * child 객체가 Person 객체로 가질수 있는 특성입니다. 
	 * 
	 * 
	 */
	
	A a = new A();
	B b = new B();
	C c = new C();
	D d = new D();
	E e = new E();
	
	A b1 =b;			// B -> A 로 자동 변환
	A b2 = new B(); 
	
	int x = 10;
	double y = x;		//int - >double 로 변환
	
	A a1 = new A();
	B a2 = new B();		// B -> A 로 자동 변환
	C a3 = new C();
	D a4 = new D();
	E a5 = new E();
	
	
	// 상속관계가 없다면 다형성 작용이 불가능함.
	// B b1 = new E ();
	
	
	// Object 타입은 모든 클래스를  저장할 수 있습니다. 
	Object o1 =a ;
	Object o2 =new B();
	Object o3 = "문자열";
	
	
}
