package day_04;

import java.util.Scanner;

public class dowhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*do~while: �ݺ��� �� �ϳ� 
		 * 
		 * do{
		 * ���๮;
		 * }while(���ǽ�);
		 * 
		 * for, while���� ���ǽ��� ó������ false�� �ѹ��� ������ �ȵ� ���� ����.
		 * ���๮�� ���� �����ϰ� ���� ���ǽ��� ���Ͽ� �ݺ� ���θ� ����
		 * ���ǽ��� false��� ������ 1���� ������.
		 * 
		 * �޴� ������ ���� ���
		 * 
		 * 
		 * */
		
		//�����ϱ�
		//���θ����
		//�����ϱ�
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		do {
			System.out.println("---menu---");
			System.out.println("1. �����ϱ�");
			System.out.println("2. ���� �����");
			System.out.println("3. �����ϱ�");
			System.out.println(">�޴� �Է� : ");
			
			menu = scan.nextInt();
			//���� ����� ó�� ����
			switch(menu) {
			case 1: System.out.println("�����մϴ�."); break;       
			case 2: System.out.println("���� ����ϴ�."); break;            
			case 3 : System.out.println("����˴ϴ�.");break;
				default : System.out.println("�߸��� �޴��Դϴ�.");
			}
			}while(menu != 3); //true�� �ݺ�
			System.out.println("���α׷� ����");
		
		
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
