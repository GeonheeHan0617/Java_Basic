package day04;

public class prtest09 {

	public static void main(String[] args) {
		
		int count = 0;
		for(int i =1; i<=200; i++) {
			if(i%9 == 0) {
				count++;
				
			}
			
		}System.out.println("9의 배수의 개수: "+ count+ "개");
		
	}
}
