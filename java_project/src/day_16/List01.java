package day_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* �Ϸ� �ϰ��� �����ϴ� list�� ���� <String>
		 * */
		
		
		List<String> list = new ArrayList<>();
		
		
		
		list.add("���");
		list.add("��ħ�Ļ�");
		list.add("���ɽĻ�");
		list.add("�");
		list.add("��ħ");
	
		//���� for������ ���
		
		for( String tmp : list) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		//Iterator�� ���
		
		Iterator<String> st = list.iterator();
		while(st.hasNext()) {
			String tmp = st.next();
			System.out.print(tmp +" ");
		}
		
		//Collections.sort(list); //���������� ����
	
		Collections.sort(list);
		System.out.println();
		System.out.println(list);
		
		//sort(Comparator c) // ��������, �������� ����
		
		list.sort(new Test());
		System.out.println(list);
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// comparteTo�޼��� ���
		return o2.compareTo(o1);
	}
	
}