package day_02;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� 2���� ������ �ϳ��� �Է¹޾� �� ������ ������ ���
		//�����ڴ� + - * / %
		//ex) 3 2 + => 3+2=5 , 6 3 / => 6/3=2
		//�ٸ� �����ڰ� ������ �߸��� �Է�
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num = scan.nextInt(); 	
		
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num1 = scan.nextInt();   
		
		System.out.println("�����ڸ� �Է��ϼ���.");
		String str = scan.next();
		
		//char op= scan.next().charAt(0); => �ѱ��� �Է½� ���
		
		int a = num+num1;
		int b = num-num1;
		int c = num*num1;
		int d = num/num1;
		int e = num%num1;
		
		
		switch(str) {
		case "+" : System.out.println(num + str + num1 + "=" + a);  break;
		case "-" : System.out.println(num + str + num1 + "=" + b);  break;
		case "*" : System.out.println(num + str + num1 + "=" + c);  break;
		case "/" : System.out.println(num + str + num1 + "=" + d);  break;
		case "%" : System.out.println(num + str + num1 + "=" + e);  break;
		default : System.out.println("�߸��� �Է��Դϴ�.");
		
		//��Ʈ������ ���� +�� ���Ῥ���ڷ� ���Ǿ� ""���� ������ �ʿ�� ������
		//char�� ����� �� ���������� ����Ǳ� ������ ���Ῥ���ڰ� �ƴ� ���ϱ� �����ڷ� ���ϱ� ������ ""�� ����Ͽ� ���� �����ڷ� �ٲ��־���Ѵ�.
		
		}
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
