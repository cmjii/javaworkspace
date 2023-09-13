package day_18;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTim01 {

	public static void main(String[] args) {
		/* LocalDateTime : ���� ��¥ �ð� ó��
		 * LocalTime : �ð���
		 * LocalDate : ��¥��
		 * */
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		System.out.println(today.getYear());
		System.out.println(today.toString());
		
		String curr = today.toString();
		
		//T �������� �տ� �ִ� �� �� �� ����
		
		System.out.println(curr.substring(0,curr.indexOf("T")));
		
		//T �������� �ڿ� �ִ� �� �� �� ����
		
		System.out.println(curr.substring(curr.indexOf("T")+1,curr.indexOf(".")));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd (a) HH:mm:ss");
		System.out.println(dtf.format(today));
		
		LocalDateTime sDate = LocalDateTime.of(2009, 9,30,15,30);
		System.out.println(sDate.format(dtf));
		
	}

}
