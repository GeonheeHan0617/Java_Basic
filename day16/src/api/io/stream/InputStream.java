package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputStream {

	public static void main(String[] args) {
		/*
		 * 1. 파일을 읽어들이는데 사용하는 클래스는 FileInputStream 입니다. 
		 * 2. 생성자의 매개값으로 읽어들일 파일 의 전체경로를 적습니다. 
		 * 3. io 패키지의 모든 메서드 throws 키워드가 있기 때문에  try~ catch 안에서 사용합니다.
		 * 
		 */
		
		FileInputStream fis = null;
//		InputStreamReader is = null;
		try {
			
			fis = new FileInputStream ("D:\\한건희\\workspace\\try.txt");
//			is = new InputStreamReader(fis,"EUC-KR");
			
//			while (true) {
//				
//				int data =fis.read() ; //1byte로 단위로 읽음
//				
//				System.out.println((char)data ); // 숫자형을 문자형으로 출력
//				 
			
//				if (data == -1 ) break; // read() 메서드가 더이상 읽을 값이 없다면 -1 로 반환
//				
//			}
			
			byte [] arr = new byte [200] ;
			int result = fis.read(arr) ; //100바이트 읽어 드림
		
			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while (true) {
				if (arr [ i] == 0) break;
 				System.out.print((char) arr [i]);
				i++; 
				
			}
		
			
			
			
//			ios.read();
			
		} catch (FileNotFoundException e) 
		{ System.out.println("해당 경로의 파일을 찾을 수 없습니다."); 
		} catch (IOException e) { System.out.println("파일을 읽을 수 없습니다.");
			
		}finally {
			try {
				fis.close();
			}catch (Exception e2) {
				e2.printStackTrace();

			}
		}


		
		
	}
}
