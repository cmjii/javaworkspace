package day_03;

import java.util.Scanner;

public class for_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ �Է� �޾Ƽ� ���� ��� 2*1=2
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("���ϴ� �������� �Է��ϼ���.");
//		int a = scan.nextInt();
//		
//		for(int i = 1; i<=9; i++) {
//			System.out.println(a + "*" + i + "=" + a*i);
//		}
				
		
		
		//�ִ����� ã��
		//��� : 1���� �ڱ��ڽű��� ����� �������� ��
		//����� : �� ������ ����� ���
		//�ִ����� : ����� �� ���� ū ��
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int a = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int b = scan.nextInt();
		int c = 0;
		
		for(int i = 1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
			c=i;	
			}
				
			
							
		}System.out.println("�� ���� �ִ������� " + c );
		
		
		
		
		
		//�ݺ������� ������ �´ٸ� �ݺ����� ���������� ����
		//break;
		//��ø for���ϰ�� if���� �����ϴ� ���� ����� for���� ��� �� ����.
		//����� ���� for���� �г����� ���� �ش� �г����� for���� ��� �� ����.
		
//		for(int i = a; ; i--) {
//			if(a%i==0 && b%i==0) {
//				System.out.println(i); break;
//			}
//		}
		
		
		
		
		
		
		
				
				
				
				
				
				
				
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
