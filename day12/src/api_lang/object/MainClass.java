package api_lang.object;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("hong") ;
		String name = p.getName();
		
		System.out.println(p.toString());		//주소!! api_lang.object.Person@15db9742
	
		
		Person p2 = new Person("hong gil dong") ;
		
		 // 그냥 쓰면 출력 안됨
		
		System.out.println(p.equals(p2)); 		
		
//		System.out.println(p.getClass());		//class api_lang.object.Person
//		
//		Class<?> gc = p.getClass();
		
		p = null; 
		p2 = null;
		System.gc();
		
		
	}
}
