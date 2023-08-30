package day_03;

public class For문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반복문 : 규칙적인 작업을 반복적으로 사용할 때 쓰는 문법
		//for, while, do ~ while
		// for, while 동작방식이 같음. => 조건에 맞지 않으면 한번도 실행이 안될 수 도 있음.
		// do ~ while 두 방식과 동작방식이 조금 다름 => 조건에 맞지 않아도 무조건 1번은 실행
		
		
		//for(초기화 ; 조건식 ; 증감식)
		//실행문;
		//}
		// - 초기화 : 조건식이나 실행문에서 사용할 변수를 초기화 (생략가능) -> 처음 한번만 실행
		// - 조건식 : 반복문의 반복을 결절하는 식 (true) (생략가능)
		// - 증감식 : 조건식에서 사용되는 변수를 증가 / 감소시켜 반복횟수를 조절
		
		//for문 밖으로 나가면 없어지는 문장이 되기 때문에 변수 선언은 밖에서 해야함.
		
		
		
		//1~10까지 출력하는 예제
		//초기화 : i변수 사용 => int i =1;
		//조건식 : i변수가 10이 될 때 까지 -> i<=10;
		//증감식 : i++; (i가 1씩증가) , (i=i+2); (2씩 증가는 따로 써주어야함)
		//실행문 : i출력
		for( int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 10; i>=1; i--) {
			System.out.print(i + " ");
		}
		
		//2부터 10까지 짝수만 출력
		
		System.out.println();
		
		for(int i =2; i<=10; i=i+2) {
			System.out.print(i+" ");
		}
		
		//1부터 20까지 중 짝수만 출력, if문을 사용하여 조건에 맞는 자료만 출력
		
		System.out.println();
		
		for(int i =1; i<=20; i++) {
			if(i%2 ==0) {
				System.out.print(i + " ");
			}
		}
		
		
		//1부터 10까지 홀수만 출력, 짝수일때는 pass라는 문구를, 홀수 일때는 그냥 출력
		
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				System.out.print("PASS"+" ");
			}else {
				System.out.print(i + " ");
			}
		}
		
		//1부터 10까지 합계 출력
		
		System.out.println();
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		} System.out.println(sum);
		
		
		//1부터 10까지 짝수의 합과 홀수의 합을 각각 출력
		//for 1부터, 10까지 1씩 증가하여 값을 비교
		//if 짝수인지 판단 -> 짝수의 합계
			//홀수인지 판단 -> 홀수의 합계
			//for문 종료 후 -> 출력
		
		int a = 0;
		int b = 0;
		
		for(int i =1; i<=10; i++) {
			if(i%2==0) {
				a=a+i;
			}else {
				b+=i;
			}
		} 
			System.out.println("짝수 합계 : " + a);
			System.out.println("홀수 합계 : " + b);	
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
