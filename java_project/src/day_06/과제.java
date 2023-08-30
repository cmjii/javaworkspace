package day_06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//컴퓨터가 가위 바위 보 중 랜덤으로 선택
		//0- 가위 1-바위 2-보
		//사용자도 가위 바위 보 선택해서 입력 (숫자, 문자 상관없음)
		//결과 출력 - 컴퓨터 - 가위, 사용자 - 가위 : 무승부
		

		int i =0;
		String str = "";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("<가위바위보 게임>");
		System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
		String s = scan.next();
		
		switch (s) {
		case "가위" : i =0;
		break;
		
		case "바위" :i=1;
		break;
		
		case "보" : i=2;
		break; 
		default : System.out.println("잘못된 입력입니다."); 
		}
		

		int com = (int)Math.random()*3;	
		
		switch (com) {
		case 0 : str = "가위"; System.out.println("컴퓨터 : " + str );
		break;
		
		case 1 :str = "바위"; System.out.println("컴퓨터 : " + str );
		break;
		
		case 2 : str = "보"; System.out.println("컴퓨터 : " + str );
		break; 
		default : System.out.println("잘못된 입력입니다."); 
		}
		

		
		if(com==0) {
			if(i==0) {
				System.out.println("무승부");
			} else if (i==1) {
				System.out.println("승리");
			} else {
				System.out.println("패배");
			}
		}

		if(com==1) {
			if(i==0) {
				System.out.println("패배");
			} else if (i==1) {
				System.out.println("무승부");
			} else {
				System.out.println("승리");
			}
		}
		
		if(com==2) { 
			if(i==0) {
				System.out.println("승리");
			} else if (i==1) {
				System.out.println("패배");
			} else {
				System.out.println("무승부");
			}
		}
		
			
		scan.close();
		
		
		
		
		
	}

}
