package super_.basic;

public class Student extends Person {
	
	String studentId;
	
	Student(String name, int age, String studentId ){
		super(name,age);
		this.studentId =studentId;
		
		
	}
	// this 키워드를 이용해서 name , age, studentId를 초기화하는 생성자
	
	
	String info() {		// 메서드 추가 해서!! 오버라이딩 예시 < 우선 실행됩
		return super.info() +",학번:"+ studentId;
	}
}
