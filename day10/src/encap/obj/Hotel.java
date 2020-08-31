package encap.obj;

public class Hotel {

	private Employee emp;
	private Chef chef;
	
	public Hotel () {
		this.emp = new Employee();
		this.chef = new Chef() ;
		
	}
	
	//setter , getter 
	public void setEmp(Employee emp) { //매개변수 명사 형태
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
		
	}
	
	public void setChef (Chef chef ) {
		this.chef =chef;
	}
	public Chef getChef(Chef chef) {
		return chef;
	}
}
