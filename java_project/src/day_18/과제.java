package day_18;

import java.util.Scanner;

import day_04.dowhile01;

public class ���� {

	public static void main(String[] args) {
		/* �ܾ���
		 * Word Ŭ���� ����
		 * �ܾ� : �ǹ�
		 * hello : �ȳ�
		 * apple : ���
		 * banana : �ٳ���
		 * 
		 * �ܾ �߰�, �߰��� �ܾ ��� (�����ؼ� ���)
		 * */
		Scanner scan = new Scanner(System.in);
		Word w = new Word();
		int m = 0;
		do {
			 
			System.out.println("1.�ܾ��� ��ü ��� | 2.�ܾ� �˻� | 3. �ܾ� �߰� | 4.����");
			m = scan.nextInt();
			switch(m) {
			case 1 : w.flist(); break;
			case 2 : w.search(scan); break;
			case 3 : w.add(scan);break;
			case 4 : break;
			default: System.out.println("�߸��� �Է��Դϴ�.");
			}
			
		} while (m != 4);
			System.out.println("����");
		
		
	}

	

	
	
	
}
