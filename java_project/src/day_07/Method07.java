package day_07;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//숫자와 기호를 주고 기호를 숫자만큼 출력
		//ex) 숫자 3, * -> ***
		//ex)5, o -> ooooo
		//메인에서 숫자와 기호를 입력받아 메서드에서 출력
		
		
		Scanner scan = new Scanner(System.in); //스캐너로 입력받아 호출
		System.out.println("숫자를 입력하세요.");
		int num = scan.nextInt();
		System.out.println("기호를 입력하세요.");
		char ch = scan.next().charAt(0);
		print(num,ch);
		
		scan.close();
		
		System.out.println();
		
		print(3,'@'); //메인에서 직접 호출
	}

	public static void print(int num, char ch) {
		for(int i =1; i<=num; i++) {
			System.out.print(ch+" ");
			
		}
		
	}
	
	
	
}
