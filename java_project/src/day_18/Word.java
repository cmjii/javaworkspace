package day_18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Word {
	
	/* �ܾ���
	 * Word Ŭ���� ����
	 * �ܾ� : �ǹ�
	 * hello : �ȳ�
	 * apple : ���
	 * banana : �ٳ���
	 * 
	 * �ܾ �߰�, �߰��� �ܾ ��� (�����ؼ� ���)
	 * */
	
	

	
	private ArrayList<Word1> list = new ArrayList<>();
	private ArrayList<Word1> list1 = new ArrayList<>();
	
	//������
	public Word() {
		lists();
	}
	
	//�ܾ�
	public void lists() {
		list.add(new Word1("Hello","�ȳ�"));
		list.add(new Word1("Apple","���"));
		list.add(new Word1("Banana","�ٳ���"));
	}
	


	//�ܾ� �߰�
	public void add(Scanner scan) {
		System.out.println("�߰��� �ܾ� : ");
		String w = scan.next();
		System.out.println("�ǹ� : ");
		String m = scan.next();
		
		Word1 ww = new Word1(w,m);
		list.add(ww);
		System.out.println("--�߰� �Ϸ�--");
	}
	
	
	//�ܾ�˻�

	public void search (Scanner scan) {
		System.out.println("�˻��� �ܾ �Է����ּ���.");
		String w = scan.next();
		int i = 0;
		for(Word1 tmp : list ) {
			if(tmp.getWord().equals(w)){
				System.out.println(tmp);
				i++;
			}
		}if(i==0) {
			System.out.println("�˻��� �ܾ �����ϴ�.");
		}

	}
	
	
	
	//����Ʈ ���
	public void flist() {
		System.out.println("--�ܾ��� ����Ʈ--");
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
	
}
