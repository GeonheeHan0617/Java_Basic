package pretest0421_5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pretest0422.Data;

public class ITKorea {

	public static void main(String[] args) {
		/*
		 * 문서를 읽어 들일 때 , 인코딩 형식이 다르면 한글이 깨지는 현상이 발생합니다. 
		 * bufferedReader 를 통해서 인코딩형식을 지정한 후에 가져오는 방법
		 */
		
		List<Data> list = new ArrayList<Data> () ;
		
		FileInputStream fis = null;
		InputStreamReader is = null;	// 인코딩을 지정해서 가져올 수 있는 클래스
		BufferedReader br = null;
		
		
		try {
//			
			br = new BufferedReader( 
					new InputStreamReader(
							new FileInputStream(							
		"D:\\Aws\\workspace\\20200421.csv"), "EUC-KR"));
			
			String str;
			
			while ((str = br.readLine()) != null){
				
				String[] arr = str.split(","+"",5);
//				System.out.print(Arrays.toString(arr)+"\n");
				
				String company = arr[0];
				String customer =arr[1];
				String phonenumber = arr[2];
				String charge =arr[3];
				
				
				
				}
				
				
			
			
		
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
