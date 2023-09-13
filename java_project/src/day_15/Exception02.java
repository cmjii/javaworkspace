package day_15;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// try~catch������ ����ó��
		// sysout ��� ����ó��
		
		//Exception02 c = new Exception02();
		//c.cal();
		
		try {
		System.out.println(calc(4, 0, '+'));
		System.out.println(calc(4, 0, '-'));
		System.out.println(calc(4, 0, '/'));
		System.out.println(calc(4, 0, '-'));

		} catch (Exception e) {
			e.printStackTrace(); // ���� ���� ���
			System.out.println(e.getMessage());
		}
		System.out.println("���� ����");
	}
		
		
		
	//�� ��, �����ڸ� �Է¹޾� 4Ģ ������ �����ϰ� ����� �����ϴ� �޼��� ����
	//switch
		
		//throw�� �߻���Ű�ԵǸ� ���ܸ� �޼��带 ȣ���ϴ� ��ü���� �ѱ�� ����
		//throw�� �߻���Ű�ԵǸ� �޼��� ����� ���� throws �߻��� �� �ִ� ���ܸ� �ݵ�� ���������
		//RuntimeException ��������
		public static double calc(int num1, int num2, char op) throws RuntimeException {
			double result = 0; //���ϰ��� ���� ����
			//���ܰ� �߻��� �� �ִ� ��Ȳ�� �̸� �տ��� ó�� 
			if ((op =='/' || op=='%')&&num2 ==0) {
				throw new RuntimeException("num2�� 0�� �� �� �����ϴ�.");
			}
			
			switch (op) {
			case '+' : result = num1 + num2; break;
			case '-' : result = num1 - num2; break;
			case '*' : result = num1 * num2; break;
			case '/' : result = num1 / num2; break;
			case '%' : result = num1 % num2; break;
			default : throw new RuntimeException(op + "�� ��������ڰ� �ƴմϴ�.");
			}
			return result;
		
		
		
		
		
		
		
		
		
	
//	public void cal() {
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("ù��° ���ڸ� �Է����ּ���.");
//		int num1= scan.nextInt();
//		System.out.println("�ι�° ���ڸ� �Է����ּ���.");
//		int num2= scan.nextInt();
//		System.out.println("�����ڸ� �Է����ּ���. (+ - * /)");
//		String p = scan.next();
//		scan.close();
//	
//	switch (p) {
//	
//	case "+" : System.out.println(num1 + num2); break; 
//	case "-" : System.out.println(num1 - num2); break; 
//	case "*" : System.out.println(num1 * num2); break; 
//	case "/" : System.out.println(num1 / num2); break;  
//	default : System.out.println("�߸��� ���Դϴ�.");
//	}
//	
//	
//	
//	
//	}
	
	

	
		}
}
