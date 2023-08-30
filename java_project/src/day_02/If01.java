package day_02;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건문 : 조건식이 참일 경우 실행문을 실행하는 문
		// if문, switch문
		// if (조건식) {실행문;}
		// 실행문 한줄일 경우 {} 생략가능 그러나 중괄호 생략 안하는 버릇을 들이는게 좋음
		// 조건식은 참일 때 실행문이 실행된다.
		// 참이 아닐 경우는 else문 사용
		
		
		int num = 10;
		// num이 0 보다 크면 양수
		if(num>0) {
			System.out.println("양수");
		}
		
		//num이 0보다 크면 양수 / 아니면 음수
		if(num>0) {
			System.out.println("양수");
		}else {
			System.out.println("음수");
		}		
		
		//num이 0보다 크면 양수 아니면 음수 0이면 0
		if(num>0) {
			System.out.println("양수");
		}else if(num == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		//num이 0보다 크면 양수 10보다 크면 10보다 큽니다. 아니면 음수 0이면 0
		
		num = 15;
		if(num>0) {
			System.out.println("양수");
			if(num>10) {
				System.out.println("10보다 큽니다.");
			}
		}else if(num<0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
				
		
	//num2 값을 저장하고, num2가 짝수인지 홀수인지 콘솔에 찍기
		
		int num2 = 8;
		if(num2 % 2 == 0) {
			System.out.println("num2 = " + "짝수");
		}else {
			System.out.println("num2 = " + "홀수");
		}
		
		
		int kor, eng, math;
		kor = 82;
		eng = 70;
		math = 90;
		
		int a = kor+eng+math;
		double b = (double)a / 3;
		
		if(a>=80) {
			System.out.println("결과 : " + "합격");
		}else {
			System.out.println("결과 : " + "불합격");
		}
		
		
		
	}

}
