package api.wrapper.boxing;

public class AutoBoxing {

	public static void main(String[] args) {
		
		
		// AutoBoxing : "기본타입을 
		Integer val1 = 100;
		Double val2 =3.14;
		
		int a = val1;
		double b = val2;
		System.out.println("=========================================================");
		System.out.println(Integer.BYTES);

		System.out.println(Integer.MAX_VALUE);
		//Auto Boxing 이후에 wrapper 클래스는 문자열을 기본형으로 연결하는데 많이 사용합니다.
		System.out.println("=========================================================");
		int v1 = Integer.parseInt("3");
		double v2 = Double.parseDouble("3.14");
		System.out.println("=========================================================");
		long v3 = Long.parseLong("10");
	
		
		System.out.println(v1+v2+v3);
	}
}
