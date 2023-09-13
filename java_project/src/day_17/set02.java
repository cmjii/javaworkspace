package day_17;

import java.util.HashSet;

public class set02 {

	public static void main(String[] args) {
		//1~45까지 랜덤수 6개 생성 후 출력
		
		HashSet<Integer> set = new HashSet<Integer>();
		
	
		
		for(;set.size()<6;){	
			set.add((int)(Math.random()*45)+1);
		}
			for(int tmp : set) {
				System.out.print(tmp + " ");
		}

			System.out.println();
			
		while(set.size()<6) {
			set.add((int)(Math.random()*45)+1);
		
		}System.out.print(set);

}
}
