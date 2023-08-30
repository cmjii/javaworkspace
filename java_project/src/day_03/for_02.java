package day_03;

import java.util.Scanner;

public class for_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* num = 6 의 약수를 출력
		 * 약수 : 나누어서 떨어지는 수 
		 * 6의 약수 : 1 2 3 6
		 * 12의 약수 : 1 2 3 4 6 12
		 * */
		
//		int num = 12;
//		for(int i = 1; i <=num; i ++) {
//			if(num%i==0){
//				System.out.println(i);
//			}
//		}
//		
		//num 입력받아서 그 수의 약수를 출력
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		
		for(int i= 1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i+" ");
			}
		}
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
