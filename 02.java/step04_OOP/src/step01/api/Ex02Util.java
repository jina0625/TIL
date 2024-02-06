package step01.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex02Util {
	public static void main(String[] args) {
		// Calendar : 날짜, 시간 다루는 클래스
		// 		- 추상 클래스이므로 직접 new 객체 생성이 불가
		//		-> Calendar.getInstance() 메소드 이용 or Calendar 클래스 상속받는 GregorianCalendar 클래스 이용해 객체 생성 가능
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)); 	// 2024
		System.out.println(cal.get(Calendar.MONTH)); 	// 1 (month -> 0 ~ 11)
	
		cal.set(2024, 6, 25);
		System.out.println(cal.get(Calendar.MONTH)); 	// 6
		
		// Date : 시각, 날짜 담는 클래스
		Date date = new Date();
		System.out.println(date); 	// Tue Feb 06 14:44:48 KST 2024
		
		// yyyy-MM-dd HH:mm -> 날짜 포멧 변경 가능
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분");
		String changeDate = sdf.format(date);
		System.out.println(changeDate); 	// 2024년 02월 06일 14시 48분
	
		// calendar.getTime() : Calendar를 Date로 변경 (Calendar -> Date) 
		Calendar calendar = new GregorianCalendar(2024, 5, 25); 	// month : 0 ~ 11
		Date toDateValue = calendar.getTime();
		System.out.println(toDateValue); 	// Mon Dec 25 00:00:00 KST 2023
		
		// calendar.setTime(date) : Date 객체를 Calendar로 변환 (Date -> Calendar)
		Date date2 = new Date();
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2); 		// Tue Jun 25 00:00:00 KST 2024

	
	
	
	
	}

}
