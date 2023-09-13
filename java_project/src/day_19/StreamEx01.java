package day_19;

import java.util.ArrayList;
import java.util.Comparator;

public class StreamEx01 {

	public static void main(String[] args) {
		// �����ǰ
		// ���� ����� 15�� �̻��� 100����, 15�� �̸��� 50����
		// �� 3���� ��Ű�� ������ �������� �� ��
		// 1. ���� ��� ���
		// 2. �� ��� �ۼ�
		
		// ���� class�� ����. ArrayList�� �� 3�� �߰�
		// �� ����
		// �̸� : �̼���, ���� : 40, ��� : 100
		// �̸� : �����, ���� : 35, ��� : 100
		// �̸� : �̾Ƶ�, ���� : 10, ��� : 50
		// �� ���� ��� : 250����
		
		ArrayList<Customer> list= new ArrayList<Customer>();
		
		list.add(new Customer("�̼���",40));
		list.add(new Customer("�����",45));
		list.add(new Customer("�̾Ƶ�",10));
		
		
		int sum = list.stream().mapToInt(n->n.getCost()).sum();
		System.out.println("�� ���� ��� : " + sum);
		
		
		list.stream().forEach(System.out::println);
		
		System.out.println();
		//20�� �̻� ���θ� �̸��� �����Ͽ� ���
		
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
		return "�̸� : "+name+", ���� : "+age+", ��� : "+cost;
	}
	
	
	
	
	
}








