package day_09;

//class�� public�� ���ϸ��� ��ġ�ϴ� class���� ����
//�� ���Ͽ� 1���� public class ����
public class MethodEx01 {
	//��� ���� �ڸ�
	
	//�޼��� �ڸ�
	public static void main(String[] args) {
		/* num1, num2 ���� �ΰ��� �ְ� �� ���� ���� �����ϴ� �޼���
		 * */
		//�޼���� �޼��带 �����ϴ� ������ ���� �ϴ� ���� �ƴ�.
		//ȣ�� : �ݺ������� ȣ�� ���� (������ ȣ�� ����)
		int a = 3; int b =5;
		int hap = sum(a,b); //(�������� ������ ���� ������ �־�� ��)
		System.out.println(hap);
		
		sum1(b,hap);
		
		//static�� ���� �޼��� ȣ��
		//��ü�� ���� - Ŭ���� MethodEx01
		//���� Ŭ�����ε��� ��ü�� �����ϴ� ������
		//���� ���� �޼��尡 static�� �����ϴ� maib�޾���̱� ����
		MethodEx01 me = new MethodEx01(); //��ü����
		int hap2 = me.sum2(b, hap);
		System.out.println(hap2);
	}

	// �����޼���
	// ��� : �� ������ ���� �����ϴ� �޼���
	// ����Ÿ�� : Ÿ�Ը� -> int
	// �Ű����� : �� ���� -> int num1, int num2
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	
	//��� : �� ������ ���� ����ϴ� �޼���
	//����Ÿ�� : ���� ->void
	//�Ű����� : �� ���� -> int num1, int num2
	public static void sum1(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	//�޼��� �����ε��� �����Ϸ���
	//�޼��� �����ε� : ���� �̸��� �޼��带 ������ �����ϴ� ��
	//�Ű������� ������ �ٸ��ų�, ������ �ٸ��ų�
	
	// �μ��� ���� �����ϴ� �޼���
	public int sum2(int num1, int num2) {
		return num1+num2;
	}
	
}

	//Ŭ�����ڸ�