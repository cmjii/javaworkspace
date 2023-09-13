package day_19;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamEx01 {

	public static void main(String[] args) {
		// 여행상품
		// 여행 비용은 15세 이상은 100만원, 15세 미만은 50만원
		// 고객 3명이 패키지 여행을 떠나려고 할 때
		// 1. 여행 비용 계산
		// 2. 고객 명단 작성
		
		// 고객은 class로 생성. ArrayList로 고객 3명 추가
		// 고객 정보
		// 이름 : 이순신, 나이 : 40, 비용 : 100
		// 이름 : 김순이, 나이 : 35, 비용 : 100
		// 이름 : 이아들, 나이 : 10, 비용 : 50
		// 총 여행 경비 : 250만원
		
		ArrayList<Customer> list= new ArrayList<Customer>();
		
		list.add(new Customer("이순신",40));
		list.add(new Customer("김순이",45));
		list.add(new Customer("이아들",10));
		
		
		int sum = list.stream().mapToInt(n->n.getCost()).sum();
		System.out.println("총 여행 비용 : " + sum);
		
		
		list.stream().forEach(System.out::println);
		
		System.out.println();
		//20세 이상 성인만 이름을 정렬하여 출력
		
		list.stream()
			.filter(n->n.getAge()>=20)
			.map(n->n.toString())
			.sorted()
			.forEach(System.out::println);
		
	}

}

 
class Customer{
	
	private String name;
	private int age;
	private int cost;
	
	public Customer() {}
	public Customer(String name, int age) {
		this.name=name;
		this.age = age;	
		this.cost = (age>=15)? 100:50;
//		if(age>=15) {
//			cost = 100;
//		}else {
//			cost=50;
//		}
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	@Override
	public String toString() {
		return "이름 : "+name+", 나이 : "+age+", 비용 : "+cost;
	}
	
	
	
	
	
}








