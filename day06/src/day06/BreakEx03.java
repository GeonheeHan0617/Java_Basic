package day06;

public class BreakEx03 {

	public static void main(String[] args) {
		
		
		//boolean bool = false;
		
	start:for(char u = 'A'; u <='Z'; u++) {
			
			for(char l ='a'; l<= 'z'; l++ ) {
				System.out.println(u + "-"+ l);
				
				if (l == 'd') //{
					// bool = true;
					break start; 					
			//}							// 앞이랑 break 뒤에 붙이면 다른 결과가 나타남
			} // 내부 for
			
			//if(bool) break;
			
		} // 밖에 for
	}
}
