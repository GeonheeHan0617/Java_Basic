package exception_basic;

public class TryChachEx01 {

	public static void main(String[] args) {
		
		int i =10;
		int j = 0;
		
		System.out.println(i+j);
		
		try {
			System.out.println(i/j);
			
			System.out.println("문장 해결 될까?");
			
			// catch 뒤에는 해당 예외를 처리할 예외의 종류 클래스를 선언합니다. 
			// Eception 은 모든 예외를 처리할 수 있습니다. 
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지 말기");
		}
		

		
		System.out.println(i-j);
		
	
		// Infinity (무한대)
		double i1 =10;
		int j1 = 0;
		System.out.println(i1/j1);
	}
	
	
}
