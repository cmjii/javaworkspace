package day_09;

import java.util.Scanner;

public class baseballgame {
	 static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//야구과제 -> 메서드로 
		
		//랜덤번호 생성
		//배열에 추가(중복제거 메서드)
		//출력메서드
		//스트라이크 메서드 -> 개수 리턴
		//볼 메서드 -> 개수 리턴 
		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		System.out.println("<야구게임>");
		System.out.println("컴퓨터가 숫자를 골랐습니다.");
		
		
		

		
	/* 랜덤번호 생성 : 매개변수로 범위를 설정
	 * (int)(Math.random()*9(개수)+1(시작값);
	 * 매개변수 -> 개수, 시작값
	 * if처리 -> 개수와 시작값이 바뀌어서 들어올 때 처리
	 * */
	
}
	
	public static int random(int count, int start) {
		return (int)(Math.random()*9)+1;
	}
	
	public static void com(int arr[]) {
		for(int i = 0; i<arr.length; i++) {
			int r = ();
			for(int j =0; j<arr.length; j++) {
				if (arr[j]!=r) {
					arr[i]=r;
				}else {
					i--; break;
				}
			}
		}
	}
	
	public static void print(int arr[]) {
		
	}
	
}