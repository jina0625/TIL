package step01.api;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex03Time {
	public static void main(String[] args) {
		// LocalDate, LocalTime -> Calendar, Date 클래스 문제점 보완
		// LocalDate : 날짜 정보만 출력
		// LocalTime : 시간 정보만 출력
		LocalDate nowDate = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		System.out.println(nowDate.getDayOfMonth()); 	// 6 (getDayOfMonth() : 일)
		System.out.println(nowTime); 					// 15:12:46.716 (컴퓨터 현재 시간 정보)
		
		// LocalDateTime : 날짜와 시간 정보 출력
		LocalDateTime nowDateTime = LocalDateTime.now();
		System.out.println(nowDateTime); 				// 2024-02-06T15:22:20.209
		
		System.out.println();
		
		// LocalDate -> Date : valueOf
		LocalDate localDate = LocalDate.now();
		Date changeDate = Date.valueOf(localDate);
		System.out.println(changeDate); 	// 2024-02-06
		
		// with() 메소드 : 값이 변경될 필드 사용자가 직접 명시 가능
		System.out.println(localDate.withYear(2024).withMonth(12).withDayOfMonth(25)); 	// 2024-12-25
		
		
		
		
		
		
	}

}
