package day_18;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat01 {

	public static void main(String[] args) throws ParseException {
		/* ��¥�� ������ �����ֱ� ���� ����
		 * format ����
		 * ��¥�� �� �� �� ���� �� �� ��
		 * ��¥�� -> ���ڷ� ��ȭ��
		 * */
		Date date = new Date();
		System.out.println(date);
		
		//��¥�� ���ڷ� ��ȯ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) hh:mm:ss");
		String dateString = sdf.format(date);
		System.out.println(dateString);
		
		//���ڿ��� ��¥�� ��ȯ
		String birth = "2009-09-30 08:30:50";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date date2 = sdf2.parse(birth);
		System.out.println(date2);
	} 

}
