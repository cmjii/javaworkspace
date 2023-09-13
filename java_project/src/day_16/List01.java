package day_16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list를 생성 <String>
		 * */
		
		
		List<String> list = new ArrayList<>();
		
		
		
		list.add("기상");
		list.add("아침식사");
		list.add("점심식사");
		list.add("운동");
		list.add("취침");
	
		//향상된 for문으로 출력
		
		for( String tmp : list) {
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		
		//Iterator로 출력
		
		Iterator<String> st = list.iterator();
		while(st.hasNext()) {
			String tmp = st.next();
			System.out.print(tmp +" ");
		}
		
		//Collections.sort(list); //오름차순만 가능
	
		Collections.sort(list);
		System.out.println();
		System.out.println(list);
		
		//sort(Comparator c) // 오름차순, 내림차순 가능
		
		list.sort(new Test());
		System.out.println(list);
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// comparteTo메서드 사용
		return o2.compareTo(o1);
	}
	
}