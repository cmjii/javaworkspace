package day_02;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//수를 입력 받아서 2의 배수가 맞으면 2의 배수입니다.
		//3의 배수가 맞으면 3의 배수입니다.
		//import 단축키 : ctrl + shift + o
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
	
		int num = scan.nextInt();

		if(num % 2 == 0 && num % 3==0) {
			System.out.println(num + " 2와 3의 배수입니다.");
		}
		if(num % 2 == 0) {
			System.out.println(num+"은 2의 배수입니다.");
		}else {
			System.out.println(num + " 는 3의 배수입니다.");
		}

		
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
