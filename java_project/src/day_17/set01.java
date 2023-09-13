package day_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class set01 {

	public static void main(String[] args) {
		/* Set : 순서보장 X (index가 없음) 중복 X (장점), get과 변경 불가
		 * HashSet
		 * */
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("홍길동");
		System.out.println(set);
		for(String  tmp : set) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("---iterator---");
		
		Iterator<String>it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp + " ");
		}
		System.out.println();
		System.out.println("----리스트 변환----");
		//set을 list로 변환 정렬
		List<String> list = new ArrayList<String>(set);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		System.out.println("--정렬후--");
		System.out.println(list);
	}

}
