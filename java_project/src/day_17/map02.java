package day_17;

import java.util.HashMap;

public class map02 {

	public static void main(String[] args) {
		/* Map�� �̿��Ͽ� ����� ������ �Է��ϰ�, �հ�� ����� ���
		 * --ȫ�浿 ����
		 * ����90 put
		 * ���80 put
		 * ����79 put
		 * �հ� value���� �� while? ���??
		 *  
		 * */

		HashMap<String, Integer> map = new HashMap<>();
		map.put("����", 89);
		map.put("����", 81);
		map.put("����", 55);

		int sum =0;
		double avg = 0;
		for(String tmp : map.keySet()) {
			sum += map.get(tmp);
		
		}System.out.println("�հ�:"+sum);
		 
		avg = (double)sum/map.size();
		System.out.println("���:"+avg);
		
		
		
		
		
		
		
		
		
	}

}
