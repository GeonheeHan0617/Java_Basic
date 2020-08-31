package api.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamCopyEx {
	

	public static void main(String[] args) {
	
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		
		try {
			
			oldFile = new FileInputStream("D:\\한건희\\workspace\\upload\\htm_2013110211371511601161.jpg");
			
			newFile  = new FileOutputStream("D:\\한건희\\copy2.jpg");
			
			byte[] arr = new byte [100] ;
			
//			while (true) {
//				int result = oldFile.read(arr) ; // 읽어들면 크기가 있다면 읽은 데이터 길이를 반환하고, 없다면 -1 반환
//				
//				if (result == -1 ) break;
//				
//				newFile.write(arr, 0 , result);		// 바이트 단위로 0에서 부터 읽은 크기 까지 파일을 씀
//				
				
//			}
			
			int result;
			while ((result = oldFile.read(arr)) != -1) {
				newFile.write(arr, 0 , result);
			
			}
			
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
			oldFile.close();
			newFile.close();
		
		}catch (Exception e2) {
		
			}
		}
	}
}
