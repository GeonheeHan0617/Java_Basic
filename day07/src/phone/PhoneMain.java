package phone;

public class PhoneMain {
	public static void main(String[] args) {
		
		Phone basic = new Phone();   // 생성자 Phone() 에 있는 출력됩. 
		basic.info();
		
		Phone black =new Phone("블랙");
		black.info();
		
		Phone white =new Phone("백색",50000);
		white.info();
		
		Phone iPhone = new Phone("회색","아이폰Pro");
		iPhone.info();
		
		Phone iPhone2 = new Phone(200000);
		iPhone2.info();
		
		
		// 모델 맴버변수를 받는 생성자를 생성
		// 색상: 그린, 가격: 1000000, 모델: 샤오미 전달해서 객체를 생성
		Phone shaomi = new Phone("그린",1000000,"샤오미");
		shaomi.info();
		
		
	}
}
