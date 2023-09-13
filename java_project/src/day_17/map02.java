package day_17;

import java.util.HashMap;

public class map02 {

	public static void main(String[] args) {
		/* Map을 이용하여 과목과 점수를 입력하고, 합계와 평균을 출려
		 * --홍길동 점수
		 * 국어90 put
		 * 양아80 put
		 * 수하79 put
		 * 합계 value떼서 합 while? 향상??
		 *  
		 * */

		HashMap<String, Integer> map = new HashMap<>();
		map.put("국어", 89);
		map.put("수학", 81);
		map.put("영어", 55);

		int sum =0;
		double avg = 0;
		for(String tmp : map.keySet()) {
			sum += map.get(tmp);
		
		}System.out.println("합계:"+sum);
		 
		avg = (double)sum/map.size();
		System.out.println("평균:"+avg);
		
		
		
		
		
		
		
		
		
	}

}
