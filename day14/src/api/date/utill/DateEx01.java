package api.date.utill;


import java.text.SimpleDateFormat;

import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		
		//날짜 클래쓰
		Date date = new Date ();
		System.out.println(date.toString());
	
		
		System.out.println("=========================================");
		//날짜 포멧 클래스
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //M과 m을 구분함 .
		String now = sdf.format(date);
		
		System.out.println(now);
		
		
		System.out.println("=========================================");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd ");
		
		String day = sdf1.format(date);
		System.out.println(day);
		
		System.out.println("=========================================");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM월 dd일 hh시 mm분");
		String d = sdf2.format(date);
		System.out.println(d);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("오늘은 MM월 dd일 E요일 입니다.");
		String today = sdf3.format(date);
		System.out.println(today);
	
	}
}
