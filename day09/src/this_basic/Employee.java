package this_basic;

public class Employee extends Person{

	String department; //부서
	
	
	Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
		
	}
	
	String info() {
		return super.info() +",부서:" +department;
	}
		
	
}
