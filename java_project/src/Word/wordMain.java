package Word;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class wordMain {

	public static void main(String[] args) {
		
		// �ڷᱸ���� ��ü�� ��� ����
		// ��ü�� �ݵ�� ����(new)�ؼ� list�� add
		ArrayList<word> list = new ArrayList<word>();
		Scanner scan = new Scanner(System.in);
		
		int menu=-1;
		do {
			//�޴��� ���� 0�̸� �׸� �Է�, �� �������� ��� �Է�
			System.out.println("�ܾ �Է��Ͻðڽ��ϱ�? ��� 1 �׸� 0");
			menu = scan.nextInt();
			if(menu ==0) {
				System.out.println("�Է�����"); break;
			}else {
				System.out.println("�ܾ� �Է� : ");
				String word = scan.next();
				
				System.out.println("�ǹ� �Է� : ");
				String mean = scan.next();
				
				word w = new word(word, mean);
				list.add(w);
			}
	
			
			
		} while (menu !=0);
	
		Collections.sort(list);
		
		for( word tmp : list) {
			System.out.println(tmp);
		}
	
		
	}

}
