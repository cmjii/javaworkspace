package day_02;

import java.util.Scanner;

public class �Է� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		//�ֿܼ��� ���� �Է� �޴� ���� �ǹ�
//		//Scanner Ŭ���� => �ֿܼ��� ���� �Է¹��� �� �ְ� ���ִ� Ŭ����
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("����(����)�� �Է����ּ���.");
//		int num = scan.nextInt();
//		System.out.println("���� �Է��� �� : " + num);
//		//�ֿܼ��� ���ڸ� �ϳ� �Է¹޾� ¦������ Ȧ������ ���
//		if(num % 2 ==0) {
//			System.out.println("¦��");
//		}else {
//			System.out.println("Ȧ��");
//		}
		
		
		//���ڸ� �Է¹޾� �������, ��������, 0���� �Ǻ��Ͽ� ���
		
		Scanner scan = new Scanner(System.in);
//		System.out.println("���ڸ� �Է��Ͻÿ�.");
//		int num = scan.nextInt();
//		System.out.println("���� �Է��� �� : " + num);
//		if(num>0) {
//			System.out.println("���");
//		}else if(num ==0) {
//			System.out.println("0");
//		}else {
//			System.out.println("����");
//		}
	
		
//		System.out.println("--------------------");
//		System.out.println("�Ǽ� �Է� > ");
//		double num2 = scan.nextDouble();
//		System.out.println("�Ǽ� �Է� > " + num2);
//		
//		
//		System.out.println("�ѱ��� �Է� > ");
//		// next() : ���ڿ� / charAt(index) : ���ڿ� �� index ���� �ѱ��� / index ������ 0���� ����
//		char ch = scan.next().charAt(0); // ���ڿ� �Է¹޴� ����
//		System.out.println("�ѱ��� > " + ch);
		
		
		//���ڿ� �Է� : next() ���� ���� �ȵ�.
		System.out.println("���ڿ� > ");
		String s = scan.next();
		System.out.println("���ڿ� > " + s);
		
		scan.nextLine();
		
		
		//���� ���� �Է� : nextLine() ���� ����
		System.out.println("���� ���� >");
		String str = scan.nextLine();
		System.out.println("�������� > " + str);
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
