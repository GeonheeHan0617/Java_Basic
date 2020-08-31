package exception_mycatch;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * main 메서드의 실행 메개값을 주는 방법
		 * run - > run configuration - >arguments - > S (string_ product)
		 * 
		 */
		
		try {
		
		String data1 = args[0];
		String data2 = args[1];
		
		int n1 = Integer.parseInt(data1);
		int n2 = Integer.parseInt(data2) ;
		
		System.out.println("두수의 합:" + (n1+n2));
		
		String s = null;
		s.charAt(0);
		
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개 값은  반드시 2개 입력하세요");
			// handle 
		}catch (NumberFormatException e) {
			System.out.println("실행화면을 반드시 숫자로 입력하세요");
		}catch (Exception e) {
			System.out.println("기타 예외입니다.");
		}
	}
}
