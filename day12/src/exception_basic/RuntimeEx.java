package exception_basic;

public class RuntimeEx {

	public static void main(String[] args) {
		// error 종류
		// ArrayIndex 
		int [] arr = {1,2,3,4,5,6};
		System.out.println(arr[4]);
//		
		//classCast 
//		String s = (String ) new Object() ;
//		
		//NumberFormat
		String s = "10";		
		//문자를 숫자로 바꾸는 기능
		Integer.parseInt(s);
		System.out.println("숫자: "+s);	 	

		
		//NumberFormatException.forInputString 에러
		String n = "10a";		
//		
		//문자를 숫자로 바꾸는 기능
		Integer.parseInt(n);
		System.out.println("숫자: "+n);	 	
	
		
//		null pointer
//		String s = null;
//		s.charAt(0) ;
		
	}
}
