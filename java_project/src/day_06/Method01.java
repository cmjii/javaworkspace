package day_06;

public class Method01 {

	//�޼��� ������ġ
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum= sum(3,5);
		System.out.println(sum);
		
		int sum1 = sum(sum,2);
		System.out.println(sum1);
		
		int num = num(2,6);
		System.out.println(num);
		System.out.println(num(2,6));
		
		int num1 = num(num,9);
		System.out.println(num1);
		
		sum2(10,20);
		
		/*�޼��� : ��� / �Լ�
		 * ���� ������ (������) : ���� �� �� �ִ� ��ü�� ���ѹ���
		 * ����Ÿ�� : �޼����� ���� ����� ���� �� �ִ� ������ ��(�ڷ���)
		 * �޼���� : �޼����� �̸� -> �ҹ��ڷ� ����
		 * �Ű����� : �޼��带 �����ϱ� ���ؼ� �ʿ�� �ϴ� ��(�ڷ���, ������)
		 * �޼��� ������
		 * ���������� ����Ÿ�� �޼���� (�Ű�����,�Ű�����) {
		 * ����;
		 * }
		 * �޼��� ���� ��ġ
		 * Ŭ���� ��, �ٸ� �޼��� ��
		 * */
	
	
		
		
	}
	
	//�޼��� ���� ��ġ
	/* ��� : �� ������ �־����� �� ������ ���� �˷��ִ� �޼���
	 * ����Ÿ�� : �˷���� �ϴ� �� -> �� (int)
	 * �Ű����� : �� ���� -> int num1, int num2
	 * �޼���� : sum (���� ������� �� �� �ְ� �޼������ ���ؾ��Ѵ�.) 
	 * */
		public static int sum(int num1, int num2) {
			int result = num1 + num2;
			return result;
		
	}
		
		
		//��� : �� ������ �־����� �� ������ ���� �˷��ִ� �޼���
		//���� Ÿ��: int
		//�Ű� ����: int a, int b
		//�޼���� : num
		
		
		
		public static int num(int a, int b) {
			return a*b;
		}
		
		// ��� : �� ������ �־����� �� ������ ���� ����ϴ� �޼���
		// ����Ÿ�� : ���� (void)
		// �Ű����� : �� ���� int num1, int num2
		// �޼���� : sum2
		
		public static void sum2(int num1, int num2) {
			System.out.println(num1+num2);
		}
		
		
	
}