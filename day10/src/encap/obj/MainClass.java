package encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		
		h.setEmp(new Employee () ); //새로운 개념
		h.getEmp().work();
		
		
		
//		Employee e = h.getEmp();	//(=)
//		e.work(); 
//		
		Chef c = new Chef() ;
		
	
		h.setChef(c);
		h.getChef(c).cook();
	}
}
