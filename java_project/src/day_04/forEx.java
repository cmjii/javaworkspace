package day_04;

import java.util.Scanner;

public class forEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//소수 : 약수가 1과 나 자신의 수만 가지는 수를 소수
		//소수 : 3,5,7,11,13,17
		
		//num을 입력받아서 num이 소수인지 아닌지 판별
		// ex) num = 13-> 소수입니다.
		//     num = 12-> 소수가 아닙니다.
		
		
//		  Scanner scan = new Scanner(System.in);
//		   System.out.println("숫자를 입력하세요."); 
//		   int num = scan.nextInt(); 
//		   int count=0;
//		  for(int i = 1; i<= num; i ++) {
//			  if(num%i ==0) {
//				  count = count +1; //count++; 
//			  } System.out.println(count);
//			  }
//		  
//		  if(count==2) { 
//			  System.out.println("소수입니다."); 
//			  }else {
//				  System.out.println("소수가 아닙니다."); }
//		 
		
		
		
		//2~100까지 중 소수를 출력
		 

		int count =0; 
	for (int i = 2; i <=100; i ++) { //num 2~100까지
		count = 0; //각 num마다 악수의 개수 = 0부터 시작
			for (int a = 1; a<=i; a++) {		//약수를 구하기 위해 돌리는 값	
				if(i%a==0) {	//약수
					count++;
			}
		}
			//System.out.println(count);
		
		if(count ==2) {
			System.out.print(i + " ");
		}			
		
	}
		
		
		
		
		

		
		
		
		
	}

}
