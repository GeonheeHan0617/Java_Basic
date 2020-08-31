package api.io.folder02;

import java.io.File;

public class DeleteEx {
	public static void main(String[] args) {
		

	
	try {
		File file =new File ("D:\\한건희\\workspace\\ggg.txt" );

		if (file.exists()) {
			file.delete();
			
			System.out.println("파일삭제성공");
		}else {
			System.out.println("파일삭제 실패");
		}
		
	
	} catch(Exception  e) {
		
	}
	}
}
