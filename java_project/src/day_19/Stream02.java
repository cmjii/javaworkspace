package day_19;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream02 {

	public static void main(String[] args) {
		/* ���ڿ�(�̸�)�� ��� ����Ʈ ���� ��, ��Ʈ������ ����
		 * �����Ͽ� ���
		 * */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("hong");
		list.add("lee");
		list.add("tomas");
		list.add("edward");
		list.add("jack");
		list.add("pack");
		list.add("choi");
		
		Stream<String> str = list.stream();
		str.sorted().forEach(n->System.out.println(n));
		System.out.println("------------------");
		
		//���ڼ��� 5���� �̻��� �̸��� ���
		list.stream().filter(n->n.length()>=5).forEach(System.out::println);
		
		//���� �̸��� ���ڼ� ���
		list.stream().map(n->n.length()).forEach(System.out::println );
	}

}
