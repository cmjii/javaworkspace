package day_03;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*up/down ����
		 * 1~50������ �������� �����Ͽ� ���ߴ� ����
		 * ex) ��ǻ�Ͱ� ���� �� ���� : 35
		 * �Է� > 1~50���� �� �� �Է��ϼ���. (10)
		 * up�̶�� �˷���
		 * �ٽ� �Է� 20
		 * up ����
		 * �ٽ� �Է� 40
		 * down ����
		 * 35�Է�
		 * ����.
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1���� 50���� �� �ϳ��� ���ڸ� �Է��Ͻÿ�.");
		System.out.println("��ȸ�� 10��");
		
		int com = (int)(Math.random()*50)+1;
	
		int a=0;
			for(int i=1; i<6; i++){
				System.out.println("�Է�>");
				 a = scan.nextInt();
					if(com>a) {
						System.out.println("up"+i+"�� ����");
					}else if (com<a) {
						System.out.println("down"+i+"�� ����");
					}else if (com==a) {
						System.out.println("����"); break;
					}
				}
		System.out.println("��ȸ ��");
		
		


		
		
		scan.close();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}