package read.io.rw03;

import java.io.FileReader;

public class FileWriterEx2 {

	public static void main(String[] args) {
		
		/*
		 * 문자기반으로 읽어들이는 클래쓰는 FileReader 클래스 입니다. 
		 * 2바이트 단위로 읽기 때문에 문자를 쓰기에 적합합니다. 
		 * 
		 */
		
		FileReader fr = null;
		
		try {
			fr = new FileReader ("D:\\한건희\\workspace\\upload\\414.txt");
			while (true) {
				
				int i = fr.read ( ); 			// 문자를 하나의 읽어 들임
				
				System.out.print( (char) i );  // 문자형으로 변환
				
				if ( i == -1 ) break; 		// 읽어들일 문자가 없다면 -1 을 반환
			
				
			}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch (Exception e) {
				
			}
		}
		
	}
}
