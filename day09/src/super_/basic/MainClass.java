package super_.basic;

public class MainClass {

	public static void main(String[] args) {
	
		Student p1 = new Student("홍길자" , 20, "123" );
		Teacher p2 = new Teacher("김철수",25,"122");
		
		System.out.println(p1.info());
		System.out.println(p2.info());
//		System.out.println(p1);		//주소
//		System.out.println(p2);
//		System.out.println(p3);
	
		
	
		
	}	
	
	
}
