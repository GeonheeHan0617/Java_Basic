package day05;

public class MultiForEx02 {

	public static void main(String[] args) {
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 */
	for( int i = 0; i <5; i++) { //행을 나타내는 for문
		
		for(int j = 0 ; j<i+1; j++ ) { //출력
			System.out.print("★");
		}
		System.out.println(" ");
		
	}

	System.out.println("=========");
	int star = 5;
	
	for( int i = 0; i <star; i++) {
		
		for(int j = 0; j<5-i; j++) {
			System.out.print("★");
		}
		System.out.println(" ");
	
	}
	
	System.out.println("=========");
	int star1 = 5;
	
	for( int i = 0; i <star1; i++) {
		
		for(int j = -1; j<i; j++) {
			System.out.print("★");
		}
		System.out.println(" ");
	}
	System.out.println("=========");
	
	}
}
