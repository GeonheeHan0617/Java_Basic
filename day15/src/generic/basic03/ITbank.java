package generic.basic03;

public class ITbank {
	
	//Course<?>  -? 뭐든 다 들어갈 수 있다.
	//Course<? extends Student> - String 의 자식클래스는 다 들어갈 수 없다.
	// Course<? super Student> - Student의 형태라면 다 들어 갈 수 있다. 

	//제네릭 타입을 매개변수로
	
	public void info(Course< Student> c) {			// "?" 의미? extends, super
		
		String num= c.getNum();
	
		Student student = c.getStudent();
	
	System.out.println("번호: " +num + ", 이름: " +
	student.getName() + ", 나이: " +student.getAge());
	}
	
	//제네릭 을 반환유형으로

	
	public Course<Student> get() {
		
		Course<Student> c = new Course<Student>() ;
		c.setNum("2");
		c.setStudent(new Student("홍정순" , 30));
		
		
		return c ; 
	}

}
