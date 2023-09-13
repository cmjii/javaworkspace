package day_16;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



public class Collection01 {

	public static void main(String[] args) {
		/* �÷��� ������ ��ũ : ǥ��ȭ�� ����� �ڷᱸ��
		 * List, Set, Map
		 * �����͸� ��� ������ �� ��� (�迭 ������� List)
		 * �ַ� �迭 ��ſ� ���
		 * 
		 * List
		 * - �迭�� �����ϴ� ����� ����
		 * - ���� �ϳ��� ����
		 * - �ߺ� ���
		 * - index�� ����
		 * - �迭 ������� ���� ���� ���
		 * 
		 * SET
		 * - ���� �ϳ��� ����
		 * - �ߺ� �����, �ߺ� ���� ������ ������ ���� �ʰ� ����
		 * - index ����
		 * - ������ ���� X
		 * - ������ �� �� ���� ���
		 * - ���� ������ �ȵ�
		 * 
		 * MAP
		 * - ���� �ΰ� ����, key/value ������ ����
		 * - �޼��� ���� �Ұ�
		 * - key : �ߺ��Ұ� / value: �ߺ�����
		 * - key�� �ߺ��Ǹ� ����Ⱑ ��
		 * - ���̵� / �н�����ó�� ���� ��� �ϳ��� �ڷ�� �����ؾ��� �� ����
		 * - ���� ���� ���� 
		 * 
		 * int arr[] = new int[5];
		 * �÷��� : �迭 ��� �Ұ� Ŭ������ �����͸� ����
		 * int -> Integer , String �� ������ 
		 * ������ �ڷ����� ù���ڸ� �빮�ڷ� ��ȯ�Ͽ� Ŭ������ ��
		 * long -> Long, byte->Byte double ->Double ��
		 * Ŭ������ �������� ������ Object�� �ڵ����� ����.
		 * */
		
		
		List<Integer> list = new ArrayList<Integer>(); //�Ϲ����� ����
	
		List list3 = new ArrayList(); //Object�� �ڵ����� �� ���̽�
		
		//add() : ����Ʈ�� ��Ҹ� �߰�
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		
		//size() : list�� ������ ����
		System.out.println(list.size());
		
		//���ڿ��� �����ϴ� ����Ʈ 3�� ���ڿ� 3�� �ְ� ��� ����� ���
		
		List<String> List1 = new ArrayList<>();
		List1.add("�ȳ�");
		List1.add("����");
		List1.add("����");
		System.out.println(List1);
		System.out.println(List1.size());
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i =1; i<=10; i++) {
			list2.add(i);
		}
		System.out.println(list2);
		

		
		//get(index) : index ������ ���� �������� ��
		System.out.println(list2.get(0));
		
		//set(index, ��) : index ������ ���� �����ϴ� ��
		list2.set(0, 3);
		System.out.println(list2);
		
		//list2�� ��� ��Ҹ� ���
		for(int i =0; i<list2.size(); i++) {
			System.out.print(list2.get(i)+" ");
		}
		System.out.println();
		System.out.println("--------------");
		
		for(int i =0; i<list2.size(); i++) {
			if(list2.get(i)%2==0) {
			System.out.print(list2.get(i)+" ");
			}
		}

		//remove(index) : index������ ����, remove(object) : object ��ü����
		list2.remove(0); //0������ �� ����
		System.out.println(list2);
		Integer a = 10;
		list2.remove(a);
		System.out.println(list2);
	
		
		//contains(object) : list�� ���� �ִ��� �˻� true/false ���
		System.out.println("-------------------");
		System.out.println(list2.contains(a));
		
		//clear() : ����Ʈ ���
		list2.clear();
		System.out.println(list2);
		
		
		//isEmpty(): list�� ������� üũ true/false
		System.out.println(list2.isEmpty());
		
		//list2�� 1���� 5���� ���� �߰��ϰ� �� ��Ҹ� ���
		for(int i =1; i<=5; i++) {
			list2.add(i);
		}
		
		for(int tmp : list2) {
			System.out.print(tmp+" ");
		}
		
		
		System.out.println();
		
		
		//index�� ����� �� ���� �÷����� ����ϱ� ���� ����ϴ� ��ü
		//Iterator : index�� ���� �÷����� ����ϱ� ���� ���
		/* list�� index�� �ֱ� ������ get(i)�� ��밡��
		 * set, map�� ������ �������� �ʱ� ������ for��� �Ұ�
		 * ���� for��, Iteratoró�� ������ ������� ���� ������ �� �ִ� �������� ��� ����
		 * */
		
		System.out.println("> Iterator ���");
		Iterator<Integer> it = list2.iterator();
		while(it.hasNext()) { //��Ұ� �ִ��� üũ //hasNext ������ ���� �� ������ �� ���� ����.
			Integer tmp = it.next();
			System.out.print(tmp +" ");
		}
		
		System.out.println();
		
		//indexof(��) : ���� index ������ ���� / ������ -1����
		Integer b =5;
		System.out.println(list2.indexOf(4));
		
		
		//sort(��ü)
		//- ��ü : comparator �������̽��� ������ ��ü�� �־�� �� (����(�͸�)Ŭ����
		list2.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1-o2 : �������� / o2-o1 : ��������
				return o2-o1;
			}
		});
		
		System.out.println(list2);
	}

}
