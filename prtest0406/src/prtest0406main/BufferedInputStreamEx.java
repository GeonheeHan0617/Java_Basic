package prtest0406main;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;
public class BufferedInputStreamEx{



public static void main(String[] args) {
/*
 * 	Buffered가 붙은 클래스는 입출력 속도 향상을 위한 클래스이며
 */


	Scanner s = new Scanner (System.in);
	
	
	FileInputStream fis = null;
	
	BufferedInputStream bis =null;
	
	
	try {
		
		fis = new FileInputStream("D:\\한건희\\workspace\\upload\\414.txt");
		bis = new BufferedInputStream (fis);
		System.out.println( (char ) bis.read());
		
		while (true) {
			int a = bis.read(); 	// 한글자를 읽어서 반환
			System.out.print((char)a );
			
			if(a == -1 ) break; // 더이상 읽을 데이터가 없다면 -1 을 반환
		}
		
	}catch (Exception e){
		e.printStackTrace();
	}finally {
		try {
		bis.close();
		fis.close();
		} catch (Exception e ){
			
		}
	}
		
		
		
	}
}
