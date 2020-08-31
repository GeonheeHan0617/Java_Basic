package pen;

// 설계도 클래스는 메인 메서드가 없습니다. 
public class Pen { // main
				
	//클래스 속성을 나타내는 것을 맴버변수(필드) 라고 부릅니다. 
	
	//구조체
	String ink;
	int price; 
	String company;
	
	// 생성자 (생략)
		Pen (){ // PenMain 파일에 new Pen();에 있는 명령어랑 같음 ; Pen() 안에 매개변수도 받을 수 있다.
			
		}
	//클래스 안에 기능을 나타내는 것을 메서드로 라고 부릅니다.
	void write() {
		System.out.println(ink + "색상 글씨를 씁니다.");
	}
	void info() {
		System.out.println(" ===== 팬의 정보 ====== ");
		System.out.println("색상:" + ink);
		System.out.println("가격:" + price);
		System.out.println("제조사:" + company);

	}
	
}
