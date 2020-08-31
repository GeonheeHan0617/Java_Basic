package abs.good;

public class MainClass {
	
	public static void main(String[] args) {
	
		
		// 1. 주상 클래스(추상 클래스) 를 사용하면 오버라이딩이 강제화 되기 때문에
		// 프로그래머의 오버라이딩 실수를 줄일 수 있습니다
		
		// 2. 다형성의 안전하게 사용할 수 있게 해주는 원리
		
//		HeadStore s = new HeadStore () ; // 추상 클래스는 객체 생성 할 수 없습니다. 
		 
		HeadStore s = new SeoulStore () ;  //Head 부모, Seoul 자식
		System.out.println("상호명"+ s.getName());
		s.apple();
		s.banana();
		s.melon();
		s.orange();
		s.mango();		//
		
		System.out.println("===================");
		HeadStore b = new BusanStore () ; //Head 부모, Busan 자식
		System.out.println("상호면" + b.getName());
		b.apple();
		b.banana();
		b.melon();
		b.orange();
		b.mango();		// 서울이나 부산이 똑같은 가격
		
	}

}
