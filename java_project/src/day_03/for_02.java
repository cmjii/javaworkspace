package day_03;

import java.util.Scanner;

public class for_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* num = 6 �� ����� ���
		 * ��� : ����� �������� �� 
		 * 6�� ��� : 1 2 3 6
		 * 12�� ��� : 1 2 3 4 6 12
		 * */
		
//		int num = 12;
//		for(int i = 1; i <=num; i ++) {
//			if(num%i==0){
//				System.out.println(i);
//			}
//		}
//		
		//num �Է¹޾Ƽ� �� ���� ����� ���
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���.");
		int num = scan.nextInt();
		
		for(int i= 1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i+" ");
			}
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
