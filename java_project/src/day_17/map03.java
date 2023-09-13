package day_17;

import java.util.HashMap;
import java.util.Scanner;

public class map03 {

	public static void main(String[] args) {
		// 과목과 점수를 입력 받아 과목:점수, 합계 , 평균
		//종료 키워드가 나올 때 까지 반복 종요키워드 =0
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		
		int sum =0;
		int y =0;
		do {
		System.out.println("과목> ");
		String kor = scan.next();
		System.out.println("점수> ");
		int knum = scan.nextInt();
		map.put(kor, knum);
		System.out.println("종료하시려면 0을 눌러주세요. 계속 입력하시려면 1을 눌러주세요.");
		y = scan.nextInt();
		
		for(String tmp : map.keySet()) {
			sum+= map.get(tmp);
		}
		
		}while(y !=0);
		System.out.println("종료");
		System.out.println("합계: "+sum);
		System.out.println("평균 : "+(double)sum/map.size());
	}

}
