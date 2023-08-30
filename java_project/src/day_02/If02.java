package day_02;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 국어, 영어, 수학 점수를 입력 받아서 합계와 평균, 평가를 출력
		// 평가는 평균이 90이상이면 A 80이상이면 B 70 이상이면 C 나머지는 D
		// 입력값이 0보다 작거나 100보다 크면 잘못된 값
		
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int kor = scan.nextInt();
		if(kor>100 || 0>kor) {
			System.out.println("잘못된 값입니다.");
		}
		
		
		System.out.println("영어 점수를 입력하세요.");
		int eng = scan.nextInt();
		if(eng>100 || 0>eng) {
		System.out.println("잘못된 값입니다.");
		}
		
		
		System.out.println("수학 점수를 입력하세요.");
		int math = scan.nextInt();
		if(math>100 || 0>math) {
		System.out.println("잘못된 값입니다.");
		}
		
		
		System.out.println();
		
		System.out.println("국어 : "+ kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		
		System.out.println();
		
		int a = kor + eng + math;
		double b = (double)a/3;
		System.out.println("합계 : " + a);
		System.out.println("평균 : " + b);
		
		
		if (b>=90) {
			System.out.println("평가 : A");
		}else if (b>= 80) {
			System.out.println("평가 : B");
		}else if ( b>= 70) {
			System.out.println("평가 : C");
		}else {
			System.out.println("평가 : D");
		}	
		scan.close();
		
		
	}

}
