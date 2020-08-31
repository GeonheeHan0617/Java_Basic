package overriding.basic;

public class Student extends Person {
	
	String studentId;
	
	String info() {		// 메서드 추가 해서!! 오버라이딩 예시 < 우선 실행됩
		return "이름 :" +name+ ",나이:"+ age + ",학번:"+ studentId;
	}
}
