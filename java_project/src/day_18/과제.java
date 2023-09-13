package day_18;

import java.util.Scanner;

import day_04.dowhile01;

public class 과제 {

	public static void main(String[] args) {
		/* 단어장
		 * Word 클래스 생성
		 * 단어 : 의미
		 * hello : 안녕
		 * apple : 사과
		 * banana : 바나나
		 * 
		 * 단어를 추가, 추가한 단어를 출력 (정렬해서 출력)
		 * */
		Scanner scan = new Scanner(System.in);
		Word w = new Word();
		int m = 0;
		do {
			 
			System.out.println("1.단어장 전체 출력 | 2.단어 검색 | 3. 단어 추가 | 4.종료");
			m = scan.nextInt();
			switch(m) {
			case 1 : w.flist(); break;
			case 2 : w.search(scan); break;
			case 3 : w.add(scan);break;
			case 4 : break;
			default: System.out.println("잘못된 입력입니다.");
			}
			
		} while (m != 4);
			System.out.println("종료");
		
		
	}

	

	
	
	
}
