package day_07;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ڿ� ��ȣ�� �ְ� ��ȣ�� ���ڸ�ŭ ���
		//ex) ���� 3, * -> ***
		//ex)5, o -> ooooo
		//���ο��� ���ڿ� ��ȣ�� �Է¹޾� �޼��忡�� ���
		
		
		Scanner scan = new Scanner(System.in); //��ĳ�ʷ� �Է¹޾� ȣ��
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		System.out.println("��ȣ�� �Է��ϼ���.");
		char ch = scan.next().charAt(0);
		print(num,ch);
		
		scan.close();
		
		System.out.println();
		
		print(3,'@'); //���ο��� ���� ȣ��
	}

	public static void print(int num, char ch) {
		for(int i =1; i<=num; i++) {
			System.out.print(ch+" ");
			
		}
		
	}
	
	
	
}