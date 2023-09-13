package day_19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* Stream(스트림) : 자료의 대상과 관계없이 동일한 연산을 수핼 할 수 있도록 해주는 반복자
		 * 요소가 하나씩 흘러가는 형태로 처리
		 * 스트림을 생성하여 연산을 수행하면 스트림은 소모가 됨
		 * 재사용 불가 -> 다른 연산을 수핼하려면 다시 스트림 생성
		 * 스트림 연산은 기존 자료를 변경하지 않음.
		 * 
		 * 중간연산 : filter( 조건에 맞는 요소만 추출), distinct(중복제거)
		 * 		sorted(정렬), map(추출),,,
		 * 최종연산 : sum(). forEach(). reduce(계산),,,
		 * */
		
		Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
		int[] arr = {10,20,30,40,50};
		IntStream arrStream = Arrays.stream(arr);
		Long cnt = arrStream.count(); //이미 소모가 됨
		//int sum = arrStream.sum(); // 다시 사용 불가
		
		int sum = Arrays.stream(arr).sum();
		System.out.println(cnt);
		System.out.println(sum);
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		int sum1 = Arrays.stream(arr).filter(b->b>=30).sum();
		System.out.println(sum1);
		
		String[] str = {"a","b","c","d"};
		Stream<String> strStream = Arrays.stream(str);
		
		//성적 배열에서 70이상인 점수만 합계를 출력
		int[] numArr = {50,78,96,85,45,35,12};
		
		//기존 방식으로 출력
		int asum =0;
		for(int i =0; i<numArr.length; i++) {
			if(numArr[i]>=70)
			asum += numArr[i];
		} System.out.println(asum);
		
		//stream으로 출력
		
		int asum1 = Arrays.stream(numArr).filter(n->n>=70).sum();
		System.out.println("stream으로 구현: "+asum1);
		
		//리스트로 스트림 생성
		//리스트로 성적 리스트 생성 70이상인 점수만 합계
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(78);
		list.add(98);
		list.add(45);
		list.add(85);
		list.add(63);
		list.add(52);
		
		//sum int스트림에서만 사용 가능
		int listsum = list.stream()
				.filter(n->n>=70)
				.mapToInt(t->t.intValue())
				.sum();
		System.out.println("Integer stream: " + listsum);
		
		Stream<Integer> s = list.stream();
		s.filter(b->b>=7).forEach(n-> System.out.print(n+" "));
		System.out.println(list.stream().mapToInt(n->n.intValue()).count());
	}

}
