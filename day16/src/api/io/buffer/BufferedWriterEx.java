package api.io.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class BufferedWriterEx {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			/*
			 * 1. 순서대로 nextlin을 써서 2문장을 입력 받습니다. 
			 * 줄 바꿈 처리를 한 다음에 file폴더 안에 text3.txt형식으로 파일을 쓰세요
		/*
		 * 
		 */
			
	
		fw = new FileWriter("D:\\한건희\\workspace\\upload\\player.txt");
		bw = new BufferedWriter (fw) ;
		
	
		String st = " " ;
		System.out.print("한문장->");
		String str1 = s.nextLine();
		System.out.print("2문장->");
		String str2 = s.nextLine();
		
		bw.write(str1+ "\r\n" + str2);
		bw.flush();
		
		} catch (Exception e ) {
			e.printStackTrace();
		}finally {
		try {	
			fw.close() ;
			bw.close();
		}catch (Exception e)  {
			}
		}
		
	}
}
