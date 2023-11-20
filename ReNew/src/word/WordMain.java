package word;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) {
		List<WordClass> list = new ArrayList<WordClass>();
		WordManager w = new WordManager();	
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		do {
			System.out.println("-메뉴-");
			System.out.println("1. 단어등록 | 2. 단어검색 | 3. 단어수정 | 4. 단어출력 | 5. 파일로 출력 | 6.종료");
			System.out.println("번호를 입력하세요.");
			num = scan.nextInt();
			try {
				
				switch(num) {
				case 1 : w.wordadd(list); break;
				case 2 : w.wordsearch(list); break;
				case 3 : w.wordchange(list); break;
				case 4 : w.wordlist(list); break;
				case 5 : w.filePrint(list); break;
				case 6 : break;
				default :  System.out.println("잘못된 입력입니다.");
				}
				
			} catch (Exception e) {
			System.out.println("파일 출력 에러");
			}

			
		} while (num!=6);
		System.out.println("프로그램 종료");

	}

}
