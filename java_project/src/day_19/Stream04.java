package day_19;

import java.util.ArrayList;

public class Stream04 {

	public static void main(String[] args) {
		// Student ����Ʈ ����� ��ü ����

		
		ArrayList<Student> List = new ArrayList<>();
		
		List.add(new Student("ȫ�浿",90));
		List.add(new Student("ȫȫȫ",76));
		List.add(new Student("������",48));
		List.add(new Student("����",89));
		List.add(new Student("������",45));
		
		//stream ���� �� ���(toString ���� �� ���)
		List.stream().forEach(System.out::println);
		
		//toString ������� {} ó��
		//������ �� ���� �ƴ� ��� {}��� �ʼ�
		List.stream().forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+": "+score);
		});
		
		System.out.println();
		
		//���� �հ� ���
		
		int listsum = List.stream().mapToInt(n->n.getScore()).sum();
		System.out.println("�հ�: "+listsum);
		
		System.out.println();
		
		//������ 70�� �̻��� �ο� �� ���
		
		List.stream().filter(n->n.getScore()>=70).map(n->n.getName()).forEach(System.out::println);
		
		
		Long count = List.stream().mapToInt(n->n.getScore()).filter(a->a>=70).count();
		System.out.println();
		System.out.println(count);
	}

}
