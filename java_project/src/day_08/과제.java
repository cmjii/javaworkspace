package day_08;

import java.util.Scanner;

public class 과제 {
 static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//static이 아닌 경우, 객체를 생성하여 객체명.메서드명() 호출 가능
		
		/*야구게임
		 * 컴퓨터가 (1~9,중복불가)3자리의 숫자를 랜덤 생성
		 * 유저가 3자리 숫자를 맞추면 종료
		 * 자리와 숫자가 같을 때는 스트라이크
		 * 자리는 안맞고 숫자만 일치하면 볼
		 * 숫자도 자리도 안맞으면 아웃
		 * 
		 * -야구게임 시작-
		 * 컴퓨터가 숫자를 정했습니다.
		 * 숫자 입력 (1~9, 3자리) :
		 * 345
		 * 결과 3s 다 맞으면 종료 (몇번만에 맞추었는지 횟수 출력)
		 * */
		
//		메인에서만 출력
//		1.입력을 위한 스캐너 열기
//		2.변수 선언 (컴퓨터 배열, 유저 배열, 게임 횟수 출력용 변수)
//		3. 컴퓨터가 결정한 3가지 숫자를 중복되지 않게 추출
//		4. 사용자 숫자 입력 (while , 사용자가 정답을 맞출 때 까지 조건이기 때문에 와일문이 알맞음)
//		(조건이 딱 맞지 않고 바뀔 확률이 높은 것들은 while문이 좋다.)
//		while(true) {
//			int s =0; int b=0; System.out.println("숫자 입력");
//			
//			for (int i =0; i<사용자 숫자; i++) {
//				사용자숫자[i] = scan.nextInt();
//			} count ++ (게임 횟수 카운트 증가)
//		5. 숫자비교
//		for(int i = 0; i<컴퓨터; ㅑ++) {
//			for(int j =0; j<사용자숫자; j++) {
//				if(컴[i]==내숫자[j]&& i == j) 숫자도 같고 위치도 같고{
//					s++(스트라이크 갯수)
//				}else if(컴[i]==나[j]&&i!=j) {
//					b++ (볼 횟수)
//				}
//			}
//		}
//		
//		//for문 전부 빠져나온 후 출력
//		if(s==0&&b==0) {
//			System.out.println("out");
//		}else {
//			System.out.println(s+"s "+b+"b ");
//			System.out.println("게임횟수" + count);
//		}if(s==3) {
//			System.out.println("정답"); break; //while문 벗어남
//		}
//	}
		
		System.out.println("---야구게임---");
		System.out.println("컴퓨터가 숫자를 결정하였습니다.");
		int comp[]=com();
		int use[]=user();
	
	}


	public static int[]com(){
		int num[] = new int [3];
		for(int i =0; i<num.length; i++) {
			num[i] = (int)(Math.random()*3)+1;
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					i--; break;
				}
			}
		}return num;	
	}

	public static int[]user(){	
		System.out.println("숫자 3자리를 입력하세요.");
		int num = scan.nextInt(); int num1=scan.nextInt(); int num2=scan.nextInt();
		int [] use = {num, num1, num2};
		return use;
			}

//	public static void answer(int comp[],int use[]) {
//		for(int i =0; )
//	
//		
//	}

}
