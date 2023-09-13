package day_18;

import java.util.Scanner;

public class Generics {

	public static void main(String[] args) {
		/* ���׸�(generic)Ŭ����
		 * Ŭ���� ����� ��ü���� Ÿ���� �������� �ʰ� ����� �� �ֵ��� ���ִ� ���
		 * <Ŭ����> : String, Integer Student, Subject
		 * */
		
		//�޴��� ������ Ŭ����
		
		/* --�޴���--
		 * 1.�ܹ��� 7000
		 * 2.���� 15000
		 * 3.����� 2000
		 * 4.���� 1000
		 * 5.���� 500
		 * 6.���α׷� ����
		 * 
		 * �޴����� > 1
		 * ������ ���� > 2
		 * => 1�� �ܹ��� 2�� �ֹ�
		 * �ֹ��� �����÷��� 0�� �����ּ���.
		 * �ٸ� ��ȣ ������ �޴����� > 3��
		 * ���� > 2
		 * => 3�� ���� 2�� �ֹ�
		 * �ֹ��� �����÷��� 0�� �����ּ���.
		 * 0
		 * --������ �޴�--
		 * 1�� �ܹ��� 2��, 2�� ���� 2�� ����
		 * �� ���ұݾ� ----��
		 * */

		//��ĳ�� �Է�
		
		//���� �޴� ��°� ó��
		//1. �޴� �߰�
		//2. �޴� ���
		//3. �ֹ�
		//4. �ֹ� ����Ʈ
		//5. ����
		
		SaleManager sm = new SaleManager();
		Scanner scan = new Scanner(System.in);
		
		int menu = -1;
	
		do {
			System.out.println("1. �޴� �߰� | 2. �޴� ��� |3. �ֹ� | 4. �ֹ� ����Ʈ |5. ����");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: sm.add(scan); break;
			case 2: sm.printProduct(); break;
			case 3 : sm.orderPick(scan); break;
			case 4 : sm.printOrder(); break;
			case 5: break;
			default: System.out.println("�߸��� �޴�");
			} 
		} while (menu != 5);
		System.out.println("���α׷� ����");
		
	}

}
