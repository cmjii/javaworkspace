package day_02;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���ǹ� : ���ǽ��� ���� ��� ���๮�� �����ϴ� ��
		// if��, switch��
		// if (���ǽ�) {���๮;}
		// ���๮ ������ ��� {} �������� �׷��� �߰�ȣ ���� ���ϴ� ������ ���̴°� ����
		// ���ǽ��� ���� �� ���๮�� ����ȴ�.
		// ���� �ƴ� ���� else�� ���
		
		
		int num = 10;
		// num�� 0 ���� ũ�� ���
		if(num>0) {
			System.out.println("���");
		}
		
		//num�� 0���� ũ�� ��� / �ƴϸ� ����
		if(num>0) {
			System.out.println("���");
		}else {
			System.out.println("����");
		}		
		
		//num�� 0���� ũ�� ��� �ƴϸ� ���� 0�̸� 0
		if(num>0) {
			System.out.println("���");
		}else if(num == 0) {
			System.out.println("0");
		}else {
			System.out.println("����");
		}
		
		//num�� 0���� ũ�� ��� 10���� ũ�� 10���� Ů�ϴ�. �ƴϸ� ���� 0�̸� 0
		
		num = 15;
		if(num>0) {
			System.out.println("���");
			if(num>10) {
				System.out.println("10���� Ů�ϴ�.");
			}
		}else if(num<0) {
			System.out.println("����");
		}else {
			System.out.println("0");
		}
				
		
	//num2 ���� �����ϰ�, num2�� ¦������ Ȧ������ �ֿܼ� ���
		
		int num2 = 8;
		if(num2 % 2 == 0) {
			System.out.println("num2 = " + "¦��");
		}else {
			System.out.println("num2 = " + "Ȧ��");
		}
		
		
		int kor, eng, math;
		kor = 82;
		eng = 70;
		math = 90;
		
		int a = kor+eng+math;
		double b = (double)a / 3;
		
		if(a>=80) {
			System.out.println("��� : " + "�հ�");
		}else {
			System.out.println("��� : " + "���հ�");
		}
		
		
		
	}

}
