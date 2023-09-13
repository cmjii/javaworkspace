package day_18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Word {
	
	/* 단어장
	 * Word 클래스 생성
	 * 단어 : 의미
	 * hello : 안녕
	 * apple : 사과
	 * banana : 바나나
	 * 
	 * 단어를 추가, 추가한 단어를 출력 (정렬해서 출력)
	 * */
	
	

	
	private ArrayList<Word1> list = new ArrayList<>();
	private ArrayList<Word1> list1 = new ArrayList<>();
	
	//생성자
	public Word() {
		lists();
	}
	
	//단어
	public void lists() {
		list.add(new Word1("Hello","안녕"));
		list.add(new Word1("Apple","사과"));
		list.add(new Word1("Banana","바나나"));
	}
	


	//단어 추가
	public void add(Scanner scan) {
		System.out.println("추가할 단어 : ");
		String w = scan.next();
		System.out.println("의미 : ");
		String m = scan.next();
		
		Word1 ww = new Word1(w,m);
		list.add(ww);
		System.out.println("--추가 완료--");
	}
	
	
	//단어검색

	public void search (Scanner scan) {
		System.out.println("검색할 단어를 입력해주세요.");
		String w = scan.next();
		int i = 0;
		for(Word1 tmp : list ) {
			if(tmp.getWord().equals(w)){
				System.out.println(tmp);
				i++;
			}
		}if(i==0) {
			System.out.println("검색할 단어가 없습니다.");
		}

	}
	
	
	
	//리스트 출력
	public void flist() {
		System.out.println("--단어장 리스트--");
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	
	
	
}
