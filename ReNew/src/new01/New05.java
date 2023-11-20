package new01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class New05 {

	public static void main(String[] args) {
//		new04클래스의 단어장을 메서드로 분리
//		메서드에서 리턴한 map을 받아서 출력
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> map = make(scan);
		System.out.println(map);
		
		for(String key : map.keySet()) {
			System.out.println(key+":"+map.get(key));
		}
	}
//      기능 : 단어 : 의미를 입력받아 map을 구성
//		map은 메서드 안에서 생성하여 리턴
//		메서드명 make()

	public static HashMap<String, String> make(Scanner scan){
		HashMap<String, String> map = new HashMap<String, String>();
		System.out.println("추가할 단어의 수를 입력해주세요.");
		int num = scan.nextInt();
		for(int i =1; i<=num; i++) {
			System.out.println(i+"번 단어를 입력하세요.");
			String word = scan.next();
			System.out.println("뜻을 입력하세요.");
			String mean = scan.next();
			map.put(word, mean);
		}
		return map;
	}
}