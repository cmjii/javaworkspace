package day_19;

import java.util.ArrayList;

public class Stream04 {

	public static void main(String[] args) {
		// Student 리스트 만들어 객체 생성

		
		ArrayList<Student> List = new ArrayList<>();
		
		List.add(new Student("홍길동",90));
		List.add(new Student("홍홍홍",76));
		List.add(new Student("하하하",48));
		List.add(new Student("요요요",89));
		List.add(new Student("촤촤촤",45));
		
		//stream 구성 후 출력(toString 존재 할 경우)
		List.stream().forEach(System.out::println);
		
		//toString 없을경우 {} 처리
		//구문이 한 줄이 아닌 경우 {}사용 필수
		List.stream().forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+": "+score);
		});
		
		System.out.println();
		
		//성적 합계 출력
		
		int listsum = List.stream().mapToInt(n->n.getScore()).sum();
		System.out.println("합계: "+listsum);
		
		System.out.println();
		
		//점수가 70점 이상인 인원 수 출력
		
		List.stream().filter(n->n.getScore()>=70).map(n->n.getName()).forEach(System.out::println);
		
		
		Long count = List.stream().mapToInt(n->n.getScore()).filter(a->a>=70).count();
		System.out.println();
		System.out.println(count);
	}

}
