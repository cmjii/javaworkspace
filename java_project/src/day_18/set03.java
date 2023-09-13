package day_18;

import java.util.NavigableSet;
import java.util.TreeSet;

public class set03 {

	public static void main(String[] args) {
		//�˻� ArrayList����, LikedList : ����, ������ ����
		//� List, Set, Map ���� -> �޼��� ���
		//���� �����ϴ� ������ �ٸ�
		//�� List, Set, Map ���� ���θ��� �޼��� �ٸ�
		
		//Set : TreeSet => �˻��� ����, ������ ������ �����ؼ� ����
		
		//�ش� ������ �� ���� ū ������ ���� ���� ������ ���
		
		int[]score= {80,89,94,78,59,84,56,60,80,70};
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int i =0; i<score.length; i++) {
			set.add(score[i]);
		}System.out.println(set);
		
		
		//first () : ���� �տ� �ִ� �� ���
		//last () : ���� �ڿ� �ִ� �� ���
		System.out.println("�ּҰ� : "+ set.first());
		System.out.println("�ִ밪 : " + set.last());
		
		//headSet : ������ ��ü���� ����(����) �� ���
		//tailSet : ������ ��ü���� ū ��(����) ���
		
		System.out.println("80���� ���� �� : " + set.headSet(80)); //80���� ����
		System.out.println("80���� ū �� : " + set.tailSet(80)); //80�� ����
		
		//subSet : ������ Set���� ����
		//���� �˻� (70�� ����, 90�� ������)
		System.out.println("70~90���� : "+set.subSet(70, 90));
		
		//�������� ����
		NavigableSet<Integer> desSet = set.descendingSet();
		System.out.println(desSet);
		
	}

}
