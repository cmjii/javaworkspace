package day_02;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//���� �Է� �޾Ƽ� 2�� ����� ������ 2�� ����Դϴ�.
		//3�� ����� ������ 3�� ����Դϴ�.
		//import ����Ű : ctrl + shift + o
		
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�.");
	
		int num = scan.nextInt();

		if(num % 2 == 0 && num % 3==0) {
			System.out.println(num + " 2�� 3�� ����Դϴ�.");
		}
		if(num % 2 == 0) {
			System.out.println(num+"�� 2�� ����Դϴ�.");
		}else {
			System.out.println(num + " �� 3�� ����Դϴ�.");
		}

		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
