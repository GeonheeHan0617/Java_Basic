package static_basic2;

public class MainClass {

	public static void main(String[] args) {

		
		/* 
		 * 클래스가 호출될 때 정적 초기화자는 단 한번
		 * 호출 됩니다. 
		 * 
		 */
		
		Computer c1 =new Computer(1010);
		Computer c2 =new Computer(2020);
		Computer c3 =new Computer(3030);    // static 없는 메서드 호출
	
		System.out.println(Computer.company);
		System.out.println(Computer.model);		// static 있을 때 메서드 호출
		
		
		
		}
}
