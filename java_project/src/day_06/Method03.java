package day_06;

import java.util.Scanner;

public class Method03 {

	public static int add(int num1, int num2) {
		return num1+num2;
	}
	
	public static int sub(int num1, int num2) {
		return num1-num2;
	}
	
	public static int mul(int num1, int num2) {
		return num1*num2;
	}
	
	public static double div(int num1, int num2) {
		return (double) num1/num2;
	}
	
	public static int re(int num1,  int num2) {
		return num1%num2;
	
	}
	
	public static void add1(int num, int num1,String tmp) {
		System.out.println(num+tmp+num1+"="+(num+num1));
	}
	
	
	public static double [] rem2(int num,int num1) {
		double [] arr = new double[2];
	
		arr[0]=num/num1;
		arr[1]=num%num1;
		
		return arr;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* �޼��带 Ȱ���� ���� �ۼ�
		 * �����ڴ� + - * / %
		 * �� ���� �����ڸ� �Է¹޾Ƽ� �޼��带 Ȱ���Ͽ� ����
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num1 = scan.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");	
		String tmp = scan.next();
		
		int add = add(num,num1);
		int sub = sub(num,num1);
		int mul = mul(num,num1);
		double div = div(num,num1);
		int re = re(num,num1);
	

		
		switch (tmp) {
		case "+" : add1(num, num1, tmp); break;
//			System.out.println(num+"+"+num1+"="+add); break;
		case "-" :
			System.out.println(num+"-"+num1+"="+sub); break;
		case "*" :
			System.out.println(num+"*"+num1+"="+mul); break;
		case "/" :
			System.out.println(num+"/"+num1+"="+div); break;
		case "%":
			//rem2�� �̿��Ͽ� ��� �������� ���
			System.out.println(num+"%"+num1+"="+re); break;
//			double[]arr2= rem2(num,num1);
//			System.out.println(arr2[0]+",,,"+arr2[1]);
			default : System.out.println("�߸��� �Է��Դϴ�.");
		} 
	
		System.out.println("��� ����");
		scan.close();
			
		
		//�� ������ �Է¹޾� �� ������ ��� �������� double[]�� ����
		//���� 0���� ������ 1���� ����Ÿ�� : double Ÿ���� �迭
		//�Ű����� : �� ����
		//������ : rem2
	}

}