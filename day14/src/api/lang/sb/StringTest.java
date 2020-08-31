package api.lang.sb;

public class StringTest {

	
	
	public static void main(String[] args) {
	
		long start = System.currentTimeMillis();	
		String s = " ";
		for(int i =1; i <=300000; i++) {
			s += "A";
	
		long end = System.currentTimeMillis();
		

				System.out.println("수행기간: " +(end -start) * 0.001);
		
		}
	}
}
