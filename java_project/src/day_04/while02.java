package day_04;

public class while02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 2 4 5 8 10
		// 12 14 16 18 20
		// 22 24 26 28 30
		//....1~50���� ¦���� ��� 5���� ���ٷ�
		
	
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
		 System.out.print(i+" ");
		 } if(i%10==0) {
		System.out.println();
		}
		}
		
		System.out.println("======================");
	
		int i =0;
		while(i<=50) {
			i++;
			if(i%2==0) {	
				System.out.print(i+" ");  //System.out.print("%d",i);->����   //System.out.print("%3d",i);-> 3ĭ����
			}if(i%10==0) {
			System.out.println();
			}
		}
		
		
		System.out.println("======================");
		
		System.out.println("��±���");
		//println ������ �����ϰ� �־� ���� ��� �̻����
		//print�� ���� ������ ������ ��
		
		//printf : �����ڸ� �̿��� ���
		//���� �����ڸ� ���� ����� �������� ������ ������ �� ����.
		//%n(\n �ٹٲ�), %d(������ int ��), %f(�Ǽ���), %c(����), %s(���ڿ�)
		//�Ҽ��� ����, ����(����)
		
		
		System.out.printf("%.2f%n",1.23456);
		int num1 = 5;
		int num2 = 3;
	
		//5 + 3 = 8
		System.out.printf("%d + %d = %d%n",num1,num2,(num1+num2));
		
		
		double num3 = 1.23;
		double num4 = 5;
		//1.23 / 5 = ��
		
		System.out.printf("%.1f / %.1f = %.1f",num3,num4,(num3/num4));
		
		
		
		
		
		
	}

}
