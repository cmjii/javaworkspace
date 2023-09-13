package day_17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map01 {

	public static void main(String[] args) {
		/* Map
		 * - ���� 2�� ����, key / value ������ ����
		 * - key�� �ߺ��Ұ�, value�� �ߺ�����
		 * - HashMap�� ���� ���� ���
		 * 
		 * HashMap<String,Integer> map = new HashMap<String,Integer>();
		 * Map�� ���� 2������ Iterator�� map ��ü�δ� ���Ұ�.
		 * ���� for / iterator -> set���� key�� ���� �� ���
		 * 
		 * list set -> .add()
		 * map -> .put() / getKey(), getValue() -> ����
		 * 
		 * */

		HashMap<String,Integer> map = new HashMap<>();
		map.put("�ܹ���", 7000);
		map.put("����", 15000);
		map.put("�����", 2000);
		
		System.out.println("---������---");
		System.out.println(map);
		System.out.println(map.keySet()); //set
		System.out.println(map.values()); //collection
		
		//key�� �ܹ����� ������ ���
		System.out.println(map.get("�ܹ���"));
		
		//���� for������ ���
		System.out.println("--���� for��--");
		for(String tmp : map.keySet()) {
			System.out.print(tmp+":" + map.get(tmp));
		}
		System.out.println();
		System.out.println("--iterator ���--");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+":"+map.get(tmp));
		}
		System.out.println(map.entrySet());
		System.out.println();
		for(Map.Entry<String, Integer>  tmp :map.entrySet()) {
			System.out.println(tmp.getKey()+":"+tmp.getValue());
		}
	}

}
