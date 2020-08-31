package day05;

public class MultiForEx02_1 {

	public static void main(String[] args) {
		
		/*
		 *     *
		 *    ***	
		 * 	 *****
		 * 	*******  
		 * *********
		 * ex>
		 *    
		 */ 
	
		
		int st = 5;
		
		for(int i= 0; i< st; i++) {  		// 행의 수

			for(int j =0; j<st-1-i; j++) {		//공백을 나타내는 줄
				System.out.print(" ");
			}
			
			for(int j =0; j<2*i+1; j++) {			// 별을 나타내기
				System.out.print("*");
				
			}
			System.out.println(" ");
			for(int j =0; j<st-1-i; j++) {		//공백을 나타내는 줄
				System.out.print("");
			}
		}
	}
}
