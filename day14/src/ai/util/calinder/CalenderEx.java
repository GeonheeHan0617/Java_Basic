package ai.util.calinder;

import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		
//		Calendar cal = new Calendar() ;
		Calendar cal = Calendar.getInstance();	//달력 관련 클라스 싱글 톤 형식
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);
	
		System.out.println(year + "년 " + month + "월" + date +"일");
		
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		int mil = cal.get(Calendar.MILLISECOND);
		
		System.out.println(hour+"시 "+min + "분 " + sec + "초 " +mil +"밀리초 ");
		
	}
}
