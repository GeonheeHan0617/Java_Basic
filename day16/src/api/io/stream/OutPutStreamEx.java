package api.io.stream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutPutStreamEx {

	public static void main(String[] args) {
		/*
		 * 1. 파일을 쓸 때 사용하는 클래쓰 FileOutputStream 입니다. 
		 * 
		 * 2. 생성자 매개 값으로 파일을 쓸 전체경로를 지정합니다. 
		 * 
		 * 3. io 패키지 모든 클래스들은 생성자에 throws 키워드가 있기 때문에 
		 * try ~ catch 를 함께 써야 합니다. 
		 */
		
		Scanner s = new Scanner (System.in);
		System.out.println("파일명 ->");
		
		String name = s.next();
		
		FileOutputStream fos = null;
		
		try {
			
		
			/*FileOutputStream*/ fos = new FileOutputStream ("D:\\한건희\\workspace\\quiz36a\\"+name +".txt"); // txt 파일 생성하기
		
			System.out.println("문장을 입력해주세요");
			s.nextLine();// next() 다음에 nextLine()을 쓰려고 할때 , 그냥 넘어가버리는 문제 
			String str = s.nextLine(); // 그 이유가 엔터값 앞 값을 입력 받고, nextLine()에 전달되서 문장의 종료로 인식되기 때문에
			
			byte [] arr = str.getBytes(); 			// 문자열 데이터를 바이트 데이터로 변환
			
			fos.write(arr); 		// 
		
		
//		}catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//			
//		}catch (IOException e) {
//			e.printStackTrace();
//			
			
			}catch(Exception e) {
				e.printStackTrace();
			
			} finally {
			try {
				fos.close();
			}catch(Exception e) {
				
				}
			}
		}
	}


		

