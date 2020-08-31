package super_.basic;

public class Person {

	String name;
	int age;
	
	//생성자
	Person(String name, int age){
		super();
		this.name = name;
		this.age = age;
		System.out.println(this.info());
	
	}
	Person(String name){
		this(name, 1);
	}
//	Person(){
//		this.name = "이름x";
//		this.age =1;
//	
//	}
//	
	
	
		String info() {
			return "이름:" +name + ",나이:" +age;
		}
}
