package api.io.bufferd04;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("D:\\한건희\\workspace\\upload\\141.txt");
			br = new BufferedReader(fr);
			
			//System.out.println(br.readLine() );
			
			// BufferedReader 에는 readLine () 메서드가 있고, 한줄을 통째로 읽습니다. 
			
			String str ;
			while ( (str = br.readLine()) != null) {
				System.out.println(str);
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
				
			}catch (Exception e2) {
				
			}
		}
		
	}
}
