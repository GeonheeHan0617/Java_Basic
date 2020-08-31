package exception.thorwsex;

public class Main {

	public static void main(String[] args)   {
		
		Account ac = new Account() ;
		
	
		try {
		
			
			ac.withDraw(10000);
			
		}catch (MyException e){
			System.out.println(e.getMessage());
			
		}
	}
}
