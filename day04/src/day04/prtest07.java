package day04;

public class prtest07 {

	public static void main(String[] args) {
		int gu = (int)(Math.random()*8)+1;
		
		for(int i=1; i<=9; i++ ) {
			System.out.printf("%d x %d =%d\n", gu, i,gu*i);
			
		}
	}
	
}
