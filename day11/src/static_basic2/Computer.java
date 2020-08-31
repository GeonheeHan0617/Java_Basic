package static_basic2;

public class Computer {

	
	// 기본 변수
	static String company;
	static String model;
	int price;
	
	
	// static 변수는 정적 초기화에서 합니다. 
	static {
		System.out.println("정적 초기화자 호출");
		company = "LG";
		model = "green";
		
	}
	
	// 일반 맴버변수는 생성자에서 초기화
	Computer(int price) {
		this.price = price;
		System.out.println("생성자 호출" +price);
	}
}
