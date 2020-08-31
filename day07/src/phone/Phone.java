package phone;

public class Phone {

	 // 기본변수 초기화
	String model;
	int price;
	String color;
	
	Phone(){ // 생성자는 member변수 위에 보통 만든다.
			 // 생성자는 클래스** 이름과 대/소문자 까지 동일하고**, **반환유형**은 없습니다.
		System.out.println("생성자 호출");
		model = "큐리텔";
		price = 500000;
		color = "검정";
	}
	
	//생성자는 중복해서 여러개 선언 할 수 있습니다.
	// 단, 매개 변수의 종류, 개수가 달라야 합니다.
	Phone(String pColor){
		
		model = "애니콜";
		price = 300000;
		color = pColor;	
	}
	Phone(String pColor, int pPrice) {
		
		model = "가로본능";
		color = pColor;	
		price = pPrice;
	}
	Phone(String pColor, String pModel) {
		
		model = pModel;
		price = 500000;
		color = pColor;
	}
	Phone(String pColor, int pPrice, String pModel){
		color = pColor;
		price = pPrice;
		model = pModel;
				
	}Phone( int pP){
		model = "아이폰 Pro2";
		price = pP;
		color = " 래드";
	}
	
	void info() {
		System.out.println(" ");
		System.out.println("===== 휴대폰 정보 =====");
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
		System.out.println("색상:" + color);
	}
	
}
