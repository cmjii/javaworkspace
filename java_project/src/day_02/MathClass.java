package day_02;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math.method
		//�ݿø� (Math.round) : �Ҽ����� �ڸ� ���� ������ 0
		//Math.ceil �ø� , Math.floor ����
		
		double num = 34.66666666;
		
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		//Math.max �ִ밪, Max.min �ּҰ� (�Ű����� ����Ÿ��)
		System.out.println(Math.max(3,5));
		System.out.println(Math.min(5, 3));
		
		//Math.random : 0�� 1������ �ƹ� ���� ����  
		//0�� ���� 1�� ������  0<= random < 1 
		// (int)(Math.random()*10)+1 : 1���� 10�� ������ ��� ����
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((Math.random()*10));
		
		
		int num1 = 15;
		
		if(num1>0) {
			System.out.println("���");
		}else if (num1>10) {
			System.out.println("10���� Ů�ϴ�.");
		}else if (num1 == 0) {
			System.out.println("0");
		}else {
			System.out.println("����");
		}
		
		
		
		
		
	}

}
