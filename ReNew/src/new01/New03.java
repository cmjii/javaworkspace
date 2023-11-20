package new01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class New03 {

	public static void main(String[] args) {
		//리스트 생성 1부터 10까지
		List<Integer> list = new ArrayList<Integer>();
		for(int i =1; i<=10; i++) {
			list.add(i);
		}

//		맵 사용
		HashMap<String, Integer> map = new HashMap<>();
		map.put("홍길동", 89);
		map.put("김영이", 70);
		map.put("김철수", 48);
		System.out.println(map);
		
		for(String tmp : map.keySet()) {
			System.out.println(tmp+":"+map.get(tmp));
		}

	}

}
