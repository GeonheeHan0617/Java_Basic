package pretest0422;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PublicDataCompile {

	public static void main(String[] args) {
	
		List<Data> list = new ArrayList<Data> () ;
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null ;
		
		try {
			br = new BufferedReader(
					new InputStreamReader(
							new FileInputStream(
									"D:\\Aws\\workspace\\myproject\\src\\pretest0422\\전국음식물쓰레기납부필증가격정보표준데이터1.txt"
									), "EUC-KR"));
		String str ;
		while ((str = br.readLine()) != null) {
//			System.out.println(str);
			String [] arr = str.split(""+ "",9);
			//String state, String cityname, String supc, String payment, String md, String mdnumber, String dbday,
			//.String picode, String piname
			String state = arr[0];
			String cityname = arr[1];
			String supc =arr[2];
			String payment =arr[3];
			String md =arr[4];
			
			String mdnumber=arr[5]; 
			String dbday =arr[6];
			
			String picode =arr[7]; 
			String piname =arr[8];
			
			Data data1 = new Data (state, cityname, supc, payment, md, mdnumber, dbday,
					picode, piname);
			list.add(data1);	
		}
		 list.stream().filter((data1) -> {
			return data1.getMd().equals("환경과");
			
		}).collect( Collectors.toList());
		
		
		for(Data d:list) {
			System.out.println(d.toString());
		}
 			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
