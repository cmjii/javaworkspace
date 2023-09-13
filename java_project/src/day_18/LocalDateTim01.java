package day_18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTim01 {

	public static void main(String[] args) {
		/* LocalDateTime : 현재 날짜 시간 처리
		 * LocalTime : 시간만
		 * LocalDate : 날짜만
		 * */
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.toString());
		
		String curr = today.toString();
		
		//T 기준으로 앞에 있는 년 월 일 추출
		
		System.out.println(curr.substring(0,curr.indexOf("T")));
		
		//T 시준으로 뒤에 있는 시 분 초 추출
		
		System.out.println(curr.substring(curr.indexOf("T")+1,curr.indexOf(".")));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd (a) HH:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9,30,15,30);
		System.out.println(sDate.format(dtf));
		
	}

}
