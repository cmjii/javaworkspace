package day_18;

import java.util.Calendar;
import java.util.Date;

import day_10.cardmain;

public class Calender01 {

	public static void main(String[] args) {
		/* ��¥ �ð� Ŭ����
		 * Date Ŭ���� : �� �Ⱦ��� Ŭ����
		 * Calendar Ŭ���� ��� -> �߻�Ŭ����
		 * ���� ��ü�� ������ �� ����
		 * new �����ڸ� ���� ��ü ���� X
		 * getInstande() �� ���� ������ �ν��Ͻ��� ������ �� ����
		 * 
		 * month : (0��~ 11��) +1;
		 * day : 1��~31��
		 * week : 1=�� 2=��
		 * am_pm : am=0, pm=1
		 * */

		Date d = new Date(); // ���� ��ü ���� ����
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		int month = now.get(Calendar.MONTH)+1; //0������ ����
		System.out.println(month);
		int day = now.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.println(week);
		System.out.println(year + "��"+month+"��"+day+"��");
		
		//hour, minute, second
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		System.out.println(hour+"��"+minute+"��"+second+"��"+ampm);
		
		String kweek="";
		switch(week) {
		case 1 : kweek = "��"; break;
		case 2 : kweek = "��"; break;
		case 3 : kweek = "ȭ"; break;
		case 4 : kweek = "��"; break;
		case 5 : kweek = "��"; break;
		case 6 : kweek = "��"; break;
		case 7 : kweek = "��"; break;
		}
		
		String ap = "";
		switch(ampm) {
		case 0 : ap="����"; break;
		case 1 : ap="����"; break;
		}
		
		System.out.println("------------");
		System.out.println(year+"-"+"0"+month+"-"+day+"("+kweek+")");
		System.out.println(ap+hour+":"+minute);
		System.out.println((ampm==0? "����":"����")+hour+":"+minute);
		
	
	}

}
