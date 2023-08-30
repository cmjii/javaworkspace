package day_03;

import java.util.Scanner;

public class for_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 구구단 입력 받아서 답을 출력 2*1=2
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("원하는 구구단을 입력하세요.");
//		int a = scan.nextInt();
//		
//		for(int i = 1; i<=9; i++) {
//			System.out.println(a + "*" + i + "=" + a*i);
//		}
				
		
		
		//최대공약수 찾기
		//약수 : 1부터 자기자신까지 나누어서 떨어지는 수
		//공약수 : 두 정수의 공통된 약수
		//최대공약수 : 공약수 중 가장 큰 값
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요.");
		int a = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		int b = scan.nextInt();
		int c = 0;
		
		for(int i = 1; i<=a; i++) {
			if(a%i==0 && b%i==0) {
			c=i;	
			}
				
			
							
		}System.out.println("두 수의 최대공약수는 " + c );
		
		
		
		
		
		//반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
		//break;
		//중첩 for문일경우 if문을 포함하는 가장 가까운 for문만 벗어날 수 있음.
		//벗어나고 싶은 for문에 닉네임을 지어 해당 닉네임의 for문을 벗어날 수 있음.
		
//		for(int i = a; ; i--) {
//			if(a%i==0 && b%i==0) {
//				System.out.println(i); break;
//			}
//		}
		
		
		
		
		
		
		
				
				
				
				
				
				
				
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
