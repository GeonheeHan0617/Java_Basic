package inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name ="홍길동";
		s.age =20; 
		s.studentId = "131322";
		System.out.println(s.info());
	
		
		Teacher t = new Teacher() ;
		t.name = "홍길자";
		t.age = 30;
		t.subject = "수학";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.name = "구승";
		e.age = 25;
		e.department = "관리부";
		System.out.println(e.info());
	} 
		
	
}
