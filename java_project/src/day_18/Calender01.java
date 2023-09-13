package day_18;

import java.util.Calendar;
import java.util.Date;

import day_10.cardmain;

public class Calender01 {

	public static void main(String[] args) {
		/* 날짜 시간 클래스
		 * Date 클래스 : 잘 안쓰는 클래스
		 * Calendar 클래스 사용 -> 추상클래스
		 * 직접 객체를 생성할 수 없음
		 * new 연산자를 통해 객체 구현 X
		 * getInstande() 를 통해 구현한 인스턴스를 가져올 수 있음
		 * 
		 * month : (0월~ 11월) +1;
		 * day : 1일~31일
		 * week : 1=일 2=월
		 * am_pm : am=0, pm=1
		 * */

		Date d = new Date(); // 직접 객체 생성 가능
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1; //0월부터 시작
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(year + "년"+month+"월"+day+"일");
		
		//hour, minute, second
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(hour+"시"+minute+"분"+second+"초"+ampm);
		
		String kweek="";
		switch(week) {
		case 1 : kweek = "일"; break;
		case 2 : kweek = "월"; break;
		case 3 : kweek = "화"; break;
		case 4 : kweek = "수"; break;
		case 5 : kweek = "목"; break;
		case 6 : kweek = "금"; break;
		case 7 : kweek = "토"; break;
		}
		
		String ap = "";
		switch(ampm) {
		case 0 : ap="오전"; break;
		case 1 : ap="오후"; break;
		}
		
		System.out.println("------------");
		System.out.println(year+"-"+"0"+month+"-"+day+"("+kweek+")");
		System.out.println(ap+hour+":"+minute);
		System.out.println((ampm==0? "오전":"오후")+hour+":"+minute);
		
	
	}

}
