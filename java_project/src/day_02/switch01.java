package day_02;

public class switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		switch�� : ���� ���� ���̽��� �޸��ִ� ����
//		switch(����or��){
//		case ��1 : ���๮1; break;
//		case ��2 : ���๮2; break;
//		case ��3 : ���๮3; break;
//		default : ������ ���๮;
//		}
//		break; : switch���� �������� �� ���
		
		int num = 9;
		switch(num) {
		case 1 :
			System.out.println("num�� 1�Դϴ�.");
			break;
		case 2 :
			System.out.println("num�� 2�Դϴ�.");
			break;
		case 3 :
			System.out.println("num�� 3�Դϴ�.");
			break;
			 default:
				 System.out.println("�߸��� �Է��Դϴ�.");
		}
		
		//1~6������ ���� �������� �����Ͽ� �ֻ���1 : 1ĭ ���� ���
		int num1 = ((int)(Math.random()*6)+1);
		System.out.println(num1);
		
		switch(num1) {
		case 1 : 
			System.out.println("�ֻ��� 1ĭ ����");
			break;
		case 2 :
			System.out.println("�ֻ��� 2ĭ ����");
			break;
		case 3 : 
			System.out.println("�ֻ��� 3ĭ ����");
			break;
		case 4 :
			System.out.println("�ֻ��� 4ĭ ����");
			break;
		case 5 : 
			System.out.println("�ֻ��� 5ĭ ����");
			break;
		 default:
			 System.out.println("�ֻ��� 6ĭ ����");
		}
		
		
		
		
		
	}

}
