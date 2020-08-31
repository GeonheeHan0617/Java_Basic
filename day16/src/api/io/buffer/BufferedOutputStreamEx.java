package api.io.buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class BufferedOutputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * Buggered 붙은 클래스는 입출력 속도 향상을 위한 클래스이며 OutputStream은 바이트  기반입니다. 
		 * 
		 * Buffered가 붙은 클래스들은 생성자의 매개변수로 바이트 기반 클래스를 받을 수 있습니다. 
		 */
		
		Scanner s = new Scanner (System.in);
		
		
		FileOutputStream fs = null;
		
		BufferedOutputStream bs =null;
		
		
		try {
			
			fs = new FileOutputStream("D:\\한건희\\workspace\\upload\\414.txt");
			bs = new BufferedOutputStream(fs) ;
			
			System.out.println("문장을 입력하세요");
			String str = s.nextLine();
			
			bs.write(str.getBytes());		// write () 매개변수로 바이트 배열을 받습니다. 
			bs.flush();

			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				fs.close();		//bs가 닫힐때 자동 flush() 가 호출됩니다.
				bs.close();
				s.close();
				
			} catch ( Exception e2) {
				
			}
			
		}
		
		
	}
}
