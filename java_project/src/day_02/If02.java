package day_02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����, ����, ���� ������ �Է� �޾Ƽ� �հ�� ���, �򰡸� ���
		// �򰡴� ����� 90�̻��̸� A 80�̻��̸� B 70 �̻��̸� C �������� D
		// �Է°��� 0���� �۰ų� 100���� ũ�� �߸��� ��
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		int kor = scan.nextInt();
		if(kor>100 || 0>kor) {
			System.out.println("�߸��� ���Դϴ�.");
		}
		
		
		System.out.println("���� ������ �Է��ϼ���.");
		int eng = scan.nextInt();
		if(eng>100 || 0>eng) {
		System.out.println("�߸��� ���Դϴ�.");
		}
		
		
		System.out.println("���� ������ �Է��ϼ���.");
		int math = scan.nextInt();
		if(math>100 || 0>math) {
		System.out.println("�߸��� ���Դϴ�.");
		}
		
		
		System.out.println();
		
		System.out.println("���� : "+ kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		
		System.out.println();
		
		int a = kor + eng + math;
		double b = (double)a/3;
		System.out.println("�հ� : " + a);
		System.out.println("��� : " + b);
		
		
		if (b>=90) {
			System.out.println("�� : A");
		}else if (b>= 80) {
			System.out.println("�� : B");
		}else if ( b>= 70) {
			System.out.println("�� : C");
		}else {
			System.out.println("�� : D");
		}	
		scan.close();
		
		
	}

}
