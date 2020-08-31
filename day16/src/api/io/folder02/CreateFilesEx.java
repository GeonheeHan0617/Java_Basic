package api.io.folder02;

import java.io.File;

public class CreateFilesEx {

	public static void main(String[] args) {
		
		/*
		 * 자바에서 외부경로로 폴더를 생성할 때는 file클래스를 사용합니다. 
		 * 생성자의 배개변수로 폴더를 생성할 경로 + 폴더명을 지정합니다.
		 * 
		 */
	
		try {
			File file = new File ("D:\\한건희\\workspace\\file_test") ;
			
			if(file.exists( )) { // 해당 파일이 존재하면 true , 존재하지 않으면 false
				file.mkdir() ; // 파일 생성
				
				System.out.println("폴더 생성");
			}else {
				System.out.println(" 파일 이 있습니다. ");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
 		
		
	
	}
}
