package day_09;

public class MethodEx02 {

	public static void main(String[] args) {
		// �� ������ ��Ģ���� ( + - * / %)�� ó��
		// ȣ��
		
		int a = 5; int b=6;
		
		MethodEx02 call = new MethodEx02();
		int sum1 = call.sum(a, b); // System.out.println((call.sum(a, b))); -> �����ϰ�
		System.out.println(sum1);
		
		int sub1 = call.sub(a, b);
		System.out.println(sub1);
		
		int mul1 = call.mul(a, b);
		System.out.println(mul1);
		
		double div1 = call.div(a, b);
		System.out.println(div1);
		
		int re1 = call.re(a, b);
		System.out.println(re1);
		
		
		
		
	}

		// ��Ģ ������ �޼��� ���� static���� ����

		public int sum(int num1, int num2) {
			return num1+num2;
		}
	
		public int sub(int num1, int num2) {
			return num1-num2;
		}
		
		public int mul(int num1, int num2) {
			return num1*num2;
		}
		
		public double div(int num1, int num2) {
			return (double)num1/num2;
		}
		
		public int re(int num1, int num2) {
			return num1%num2;
		}
}