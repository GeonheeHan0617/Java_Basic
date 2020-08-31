package static_basic;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 1. 녹색, 빨강색 계산기를 각각 생성
		 * 2. 계산기 색상을 확인하세요.
		 * 3. add(int a) 메서드를 추가합니다. 
		 * 4. 계산기 result 값도 각각 확인.
		 * 5. pi와 circle() 사용하여 원의 넓이를 구하세요. 
		 */
	 Calculator ca = new Calculator();
	
	 ca.setColor("green color"); // ca.setColor  안쓰면 null 값 나옴
	 System.out.println(ca.getColor());
	 
	 // ca.circle(3); // 3cm
	 System.out.println(ca.circle(3) + " cm2");
	 
	 System.out.println(ca.rect(4) + " cm2");
	 
	 
	 
	 Calculator ca2 = new Calculator();
	 ca.setColor("red color");
	 System.out.println(ca.getColor());
	 
	 System.out.println(ca.circle(10) + " cm2");
	 
	 System.out.println(ca.rect(20) + " cm2");
	 
	 
	 System.out.println("================================");
	 
	 int [] arr = {1,2,3,4,5,6};
	 System.out.println(ArrayPrintcc.printArraycc(arr));

	}
	
}
