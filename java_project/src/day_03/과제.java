package day_03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*up/down 게임
		 * 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 * ex) 컴퓨터가 랜덤 수 생성 : 35
		 * 입력 > 1~50까지 수 중 입력하세요. (10)
		 * up이라고 알려줌
		 * 다시 입력 20
		 * up 추출
		 * 다시 입력 40
		 * down 추출
		 * 35입력
		 * 정답.
		 * */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 50까지 중 하나의 숫자를 입력하시오.");
		System.out.println("기회는 10번");
		
		int com = (int)(Math.random()*50)+1;
	
		int a=0;
			for(int i=1; i<6; i++){
				System.out.println("입력>");
				 a = scan.nextInt();
					if(com>a) {
						System.out.println("up"+i+"번 실행");
					}else if (com<a) {
						System.out.println("down"+i+"번 실행");
					}else if (com==a) {
						System.out.println("정답"); break;
					}
				}
		System.out.println("기회 끝");
		
		


		
		
		scan.close();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}