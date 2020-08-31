package inter.basic3;

public class MainClass {

	public static void main(String[] args) {
		
		Printed print = new LG() ; // 인터페이스 선언
		
		print.turnOn();
		print.print("설명서");
		System.out.println("=====================================");
		print.colorPrint("안내", "검정");
		
		print.copy(10) ;
		print. turnOff();
	}
}
