package day_04;

public class ����for��_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����� 5*5
		
//		for (int i =1; i<=5; i++) { // 1�� ��       2�� �� ----			
//			for (int j =1; j<=5; j++) { // 1~5      1~5 ----
//				System.out.print("*");
//					}
//			System.out.println(); //1�� ������ �ٹٲ�
//		}
//		
//		
//		System.out.println("--------------------------------------");
//		
//		//* 
//		//** 
//		//*** 
//		//****
//		
//		for(int i = 1; i<=5; i++) {
//			for(int a =1; a<=i; a++) {
//				System.out.print("*");
//			}System.out.println();
//		}
//		
//		System.out.println("--------------------------------------");
//		//������ ���� ���������� �ٸ� ���
//		
//		for(int i = 1; i<=5; i++) {
//			for(int a =1; a<=5; a++) {
//				System.out.print("*");
//				if(i==a) {
//					break;
//				}
//			}System.out.println();
//		}
//		
//		
//		
//		
//		System.out.println("--------------------------------------");
		
		
		//     * i =1, ���� =4 *=1
		//    **
		//   ***
		
		
		for(int i = 1; i<=5; i++) {
			for(int b = 5; b>=i; b--) {
				System.out.print(" ");
			}
			for(int a =1; a<=i; a++) {
				System.out.print("*");
			}System.out.println();
		}
		
		 System.out.println();
		 //�ٸ����
		for(int i = 1; i<=5; i++) {
			for(int b = 1; b<=5-i; b++) {
				System.out.print(" ");
			}
			for(int a =1; a<=i; a++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println(); 
		//if�� ���
		for(int i = 1; i<=5; i++) {
			for(int a =1; a<=5; a++) {
				if(a<=5-i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}System.out.println();
		}
		
		
		
		
		

	}

}
