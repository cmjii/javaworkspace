package day_04;

public class 이중for문_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//별찍기 5*5
		
//		for (int i =1; i<=5; i++) { // 1일 때       2일 때 ----			
//			for (int j =1; j<=5; j++) { // 1~5      1~5 ----
//				System.out.print("*");
//					}
//			System.out.println(); //1행 끝나고 줄바꿈
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
//		//위에랑 같은 구문이지만 다른 방법
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
		
		
		//     * i =1, 공백 =4 *=1
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
		 //다른방법
		for(int i = 1; i<=5; i++) {
			for(int b = 1; b<=5-i; b++) {
				System.out.print(" ");
			}
			for(int a =1; a<=i; a++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println(); 
		//if문 사용
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
