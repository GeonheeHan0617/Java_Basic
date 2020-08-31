package pen;

public class PenMain { // 몇 수십개 백개 만들수 있음 

	public static void main(String[] args) {
		
		//pen의 기능 속성을 쓰려면 설계용클래스를 객체로 생성해야 합니다.
		//객체의 기능과 속성을 사용할 때는 참조연산자 .을 사용합니다. 
		Pen black = new Pen(); //1)
		black.ink = "검정";
		black.price = 500;
		black.company = "모나미";
		
		
		black.info();
		black.write();
		
		
		
		Pen red = new Pen(); //2 ) 다른 class 임
		red.ink = "빨강";
		red.price = 1000;
		red.company= "하이테크";
		
		red.info();
		red.write();
		
		
		
	}
}
