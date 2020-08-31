package read.io.rw03;

import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {
		
		/*
		 * 문자를 써서 저장할 대 사용하는 클래스는 FileWriter 클래스 입니다. 
		 * 기본적으로 2바이트 단위로 처리하기 때문에 문자쓰기에 적합합니다. 
		 */
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("D:\\한건희\\workspace\\upload\\414.txt");
			String str = " 오늘은 4월 20일 입니다. \n A: 그리고 갈까? \n B: 아니 , 더 있다가 가고 싶음 \n C : 그러지 말구 놀러가자 ㅋㅋ 바다로~~!! ";
			
			fw.write(str) ;
			
			System.out.println("정상적으로 저장 되었습니다. ");
			
		}catch (Exception e){
			e.printStackTrace();
			
			
		}finally {
			try {
				fw.close();
			}catch (Exception e) {
				
			}
		}
		
	}
}
