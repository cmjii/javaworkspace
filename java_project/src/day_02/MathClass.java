package day_02;

public class MathClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Math.method
		//반올림 (Math.round) : 소수점의 자리 수는 무조건 0
		//Math.ceil 올림 , Math.floor 버림
		
		double num = 34.66666666;
		
		System.out.println(Math.round(num));
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		
		//Math.max 최대값, Max.min 최소값 (매개변수 리턴타입)
		System.out.println(Math.max(3,5));
		System.out.println(Math.min(5, 3));
		
		//Math.random : 0과 1사이의 아무 값을 추출  
		//0은 포함 1은 미포함  0<= random < 1 
		// (int)(Math.random()*10)+1 : 1부터 10의 정수를 얻는 공식
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((Math.random()*10));
		
		
		int num1 = 15;
		
		if(num1>0) {
			System.out.println("양수");
		}else if (num1>10) {
			System.out.println("10보다 큽니다.");
		}else if (num1 == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수");
		}
		
		
		
		
		
	}

}
