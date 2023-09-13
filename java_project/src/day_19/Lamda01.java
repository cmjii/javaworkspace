package day_19;

import java.util.ArrayList;

public class Lamda01 {

	public static void main(String[] args) {
		/* Lambda Expression : ���ٽ�
		 * �Լ��� ���α׷��� (Functional Programming : FP)
		 * ������ �Լ��� �����ϰ� ȣ�������ν� �ܺ� �ڷῡ �μ����� ����(side effect)�� ���� �ʵ��� �����ϴ� ���
		 * �����Լ� (pure function) : �Ű��������� ����Ͽ� ����� �Լ�
		 * ��, �Լ� ���ο��� �Լ� �ܺ��� ������ ������� �ʾ� �Լ��� ����Ǵ��� �ܺ��� ������ ���� �ִ� ���� ����
		 * 
		 * */
		
		/* (int x, int y) -> {return x+y}
		 * str -> System.out.pritln(str);
		 * ������ ������ �߰�ȣ �ʿ�
		 * ������ ����, ó���� �ϳ��� �߰�ȿ �ʿ� ����
		 * */
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(45);
		number.add(7);
		number.add(12);
		number.add(34);
		number.add(59);
		System.out.println("---�Ϲ��ڵ�---");

		for(Integer I : number) {
			System.out.print(I+" ");
		}
		
		System.out.println();
		
		System.out.println("---���ٽ� ���---");
		//forEach
		number.forEach((n)->{
			System.out.print(n+" ");
		});
		System.out.println();
		System.out.println("---�޼��忡 ���� ����---");
		
		// �޼��忡 ���� ����
		number.forEach(System.out::println);
		
		//number�� �Ѱ���
		System.out.println("---��Ʈ�� �̿��� �Ѱ���---");
		System.out.println(number.stream().count());
		
	
	}
	

}
