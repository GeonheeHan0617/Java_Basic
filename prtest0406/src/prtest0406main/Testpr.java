package prtest0406main;

public class Testpr {

	public static void main(String[] args) {
		
		
		
		String a = null;
		System.out.println(a.length()); // NullPointerException
		
		int [] b = new int [] {1,2,3,4,5}; //ArrayIndexOutOfBoundsException 
		System.out.println(b[5]);
		
		String c = "10A" ;
		int d = Integer.parseInt(c);	//NumberFormatException
		
		
//		Class.forName("Java.#$%");	// ClassCastException
		
//		주요 실행 예외
//		- 1. NullPointerException - 객체 참조가 없는 상태, 즉 null 값을 갖는 참조 변수로 객체 접근 연산자인 dot(.)를 사용했을 때 발생 합니다.
//		- 2. ArrayIndexOutOfBoundsException - 배열에서 인덱스 범위를 초과하여 사용할 경우 발생합니다.
//		- 3. NumberFormatException - 문자열로 되어 있는 데이터를 숫자로 변경하는 경우에 발생합니다.
//		- 4. ClassCastException - 형 변환은 부모 클래스와 자식 클래스간에 발생하고 구현 클래스와 인터페이스 간에도 발생합니다. 이 러한 관계가 아니라면 다른 클래스로 타입을 변환할 수 없습니다.
//		
		
	}
	
}
