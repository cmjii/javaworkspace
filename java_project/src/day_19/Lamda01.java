package day_19;

import java.util.ArrayList;

public class Lamda01 {

	public static void main(String[] args) {
		/* Lambda Expression : 람다식
		 * 함수형 프로그래밍 (Functional Programming : FP)
		 * 순수한 함수를 구현하고 호출함으로써 외부 자료에 부수적인 영향(side effect)을 주지 않도록 구현하는 방식
		 * 순수함수 (pure function) : 매개변수만을 사용하여 만드는 함수
		 * 즉, 함수 내부에서 함수 외부의 변수를 사용하지 않아 함수가 실행되더라도 외부의 영향을 전혀 주니 않은 형태
		 * 
		 * */
		
		/* (int x, int y) -> {return x+y}
		 * str -> System.out.pritln(str);
		 * 리턴이 있으면 중괄호 필요
		 * 리턴이 없고, 처리가 하나면 중괄효 필요 없음
		 * */
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(45);
		number.add(7);
		number.add(12);
		number.add(34);
		number.add(59);
		System.out.println("---일반코드---");

		for(Integer I : number) {
			System.out.print(I+" ");
		}
		
		System.out.println();
		
		System.out.println("---람다식 출력---");
		//forEach
		number.forEach((n)->{
			System.out.print(n+" ");
		});
		System.out.println();
		System.out.println("---메서드에 직접 참조---");
		
		// 메서드에 직접 참조
		number.forEach(System.out::println);
		
		//number의 총개수
		System.out.println("---스트림 이용한 총개수---");
		System.out.println(number.stream().count());
		
	
	}
	

}
