package day_06;

public class Method02 {

	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	
	public static void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public static void div(double num1, double num2) {
		System.out.println(num1/num2);
	}
	
	public static double div1(int num1, int num2) {
		return (double) num1/num2;
	}
	
	public static void re(int num1, int num2) {
		System.out.println(num1%num2);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�޼��带 Ȱ���Ͽ� ���⸦ �ۼ�
		//�޼���� +-*/%
		//�� ������ �־����� �� ������ ������ �ϴ� �޼��带 �ۼ�
		//+ ȣ��(����) - ȣ��(����) *ȣ�� / ȣ��(���� ����) % ȣ��
		
		int sum = add(3, 5);
		System.out.println(sum);
		
		int sub = sub(3, 5);
		System.out.println(sub);
		
		double div1 = div1(3,5);
		System.out.println(div1);
		
		mul(3,5);
		div(3,5);
		re(3,5);
		
	
		
		//�ٸ� Ŭ������ �ִ� �޼��带 ��� 
		//Ŭ���� -> ���Ǽ� -> ��ü�� �����ؼ� �޼��带 ����
		//���� �������� ��ü �������� �޼��带 ����� �� �ִ� ���� = static
		//static �ִ� ��� / Ŭ������, �޼����
		//static ���� ��� / ���� �س��� ������ �ȵǾ��ٴ� ���� �ǹ�
		//��ü�� ���� -> Ŭ���� �ʿ�
		Method02 me = new Method02();
		int s = me.add(20, 30);
		System.out.println(s);
	}

}
