package new01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
//		단어 갯수 입력 받고 키 벨류 입력 받고 맵에 추가하고 출력
		
		Map<String, String> map = new HashMap<String, String>();
		Scanner scan = new Scanner(System.in);
		System.out.println("추가할 단어의 수를 입력해주세요.");
		int num = scan.nextInt();
		for(int i =1; i<=num; i++) {
			System.out.println(i+"번 단어를 입력하세요.");
			String word = scan.next();
			System.out.println("뜻을 입력하세요.");
			String mean = scan.next();
			map.put(word, mean);
		}
		System.out.println(map);
		

	}

}
