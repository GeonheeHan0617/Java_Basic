package this_basic;

public class Teacher extends Person{
	

	String subject;  //맡은 과목
	
	//생성자 3개
	Teacher(String name, int age, String subject){
		this.name =name;
		this.age =age;
		this.subject = subject;
		
	}
	
	
	String info() {
		return super.info() + ",과목:" +subject;
	}
	
}
