package generic.basic03;



public class Main {

	public static void main(String[] args) {
		
		Course<Student> course = new Course<Student> ();
		
		course.setNum("1");
		course.setStudent(new Student("홍길동" , 20));
		
	////////////////////////////////////////////////////////////
		//사용
		
		ITbank bank = new ITbank();
		bank.info(course); 
		
		Course<Student> s = bank.get();
	}
}
