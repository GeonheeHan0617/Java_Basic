package api.lang.sb;

public class StringBufferEx {

	public static void main(String[] args) {
		
		String str = new String ("Javachip");
		
		StringBuffer sb = new StringBuffer("Javachip ");
		
		System.out.println(str);
		System.out.println("========================1");
		
		System.out.println(sb);
		
		System.out.println("========================2");
		
		//차이점 
		
//		String str2 = str + "program" ;
			str = str + "beverage" ;
			System.out.println("========================3");
			
			sb.append("beverage");
			System.out.println(str);
			System.out.println(sb);
			
			System.out.println("========================4");
			
			
			//문자열 추가 append
			
		sb.append("study");
		System.out.println("========================5");
		
	//문자열 추가 // insert
		sb.insert(17, "ology ");
		System.out.println(sb);
		System.out.println("========================6");
		
		// 문자열 변경 //replace
		sb.replace(4, 15, " book ");
		
		System.out.println(sb);
		System.out.println("==========================7");
		
		// 문자열 삭제 //delete 
		sb.delete(10,17);
		System.out.println(sb);
		
		System.out.println("==========================8");
		//문자열 거꾸로 //reverse
		sb.reverse();
		System.out.println(sb);
	
	}
}
