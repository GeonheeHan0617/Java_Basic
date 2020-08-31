package generic.basic01;

public class Main {

	public static  void main(String[] args) {
		
		// generic을 사용하면, 객체로 생성할 때 사용할 타입을 지정할 수 있고, 
		// 다양한 값을 저장하도록 생성할 수 있습니다. 
		
		ABC<String> abc = new ABC<>(); // <>는 앞에만 지정해도 됨 뒤에는 생랴개도 됨
		
		abc.setT("홍길자");
		String name = abc.getT(); 		// 캐스팅 안해도됨
		
//		ABC<int> abc2 = new ABC<int>();		//genefir은 기본형이 저장할수 없다.
		
		
		ABC<Integer> abc2 = new ABC<> () ;	//int 대신에 <Integer>로 가져옴 
		
		abc2.setT(1);
		int num = abc2.getT();	
		
		
		ABC<Person> abc3 = new ABC<> ();
		
		abc3.setT( new Person() );
		Person p = abc3.getT();
		
		
	}
}
