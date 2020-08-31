package poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent() ;
		p.method1();
		p.method2();
		
		Child c = new Child () ;
		c.method1();			// 상속
		c.method2();			// 오버라이딩
		c.method3();			// 자식만 있는 메서드
		
		System.out.println("============ 다형성 적용 ============");
		
		Parent p1 =c;			// 다형성 첫 적용 !!
		
		System.out.println(c);			//주소 값
		System.out.println(p1);			// 주소 값
		System.out.println( c == p1);		// 동일한 주소 값
		
		p1.method1 ();
		p1.method2 ();
		// p1.method3();
		
		
		/*
		 * 다형성 적용시에 자식이 가지고 있던 본래 맴버에 접근할 수 없는 문제가 발생합니다. 
		 * 단, 재정의 된 메서드는 정상적으로 호출 됩니다. 
		 */
		
		System.out.println("============ 클래스 캐스팅 ============ ");
		
		Parent par = new Child ();
		Child chi = (Child)par;
		/*
		 * 다형성이 일어나지 않은 객체를 대상으로 클래스 캐스팅을 실행하면 
		 */// 에러가 발생함 < poly.basic2.Parent cannot be cast to poly.basic2.Child>
		
//		Parent par2 =new Parent();
//		Child chi2 =(Child)par2 ;
		
	}
}
