package day_08;

public class Methodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�޼��� �����ε�
		//������ �̸��� �޼��带 ������ ����� ��.
		
		//1. �Ű������� ������ �ٸ��� ����
		//2. �Ű������� ����(�ڷ���)�� �ٸ��� ����
		//3. ����Ÿ���� �������. �Ű������� �������.
		int sum=sum1(1,2,3,4,5,6,7); System.out.println(sum);
		
			
	}
	
	//���ϱ� �޼���
	public static int sum(int num1, int num2) {
		return num1+num2;
	}

	public static int sum(int num1, int num2, int num3) { //�Ű������� ������ �޶� �����ε� ����
		return num1+num2+num3;
	}	
	
	public static double sum(double num1, double num2) { //�Ű����� �ڷ����� �޶� �����ε� �Ǵ°��
		return num1+num2;
	}
	
	public static double sum(int num1, double num2) { //�Ű����� �ڷ����� �޶� �����ε� �Ǵ°��
		return num1+num2;
	}
	
	//�������� �޼���
	//�ǿ������� ���� �������� ���� ���, �Ű������� ������ ������� �Ű����� �� �� �̿�
	public static int sum1(int...num) { //num�� �迭ó�� �ν�, �Ű������� ��� ������ �� �� ��� ����
		int sum1 =0;
		for(int i = 0; i<num.length; i++) {
			sum1+=num[i];
		} return sum1;
	
}
}