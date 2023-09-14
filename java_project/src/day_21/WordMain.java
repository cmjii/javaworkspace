package day_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Scanner;

import day_04.break01;

public class WordMain {
	
	ArrayList<word1> list = new ArrayList<word1>();
	
	
	public void add() {
		
		list.add(new word1("Hello","안녕"));
		list.add(new word1("apple","사과"));
		list.add(new word1("banana","바나나"));
		
	}
	
	public WordMain() {
		add();
	}
	
	
	public void wordadd(Scanner scan) {
		
		System.out.println("등록하실 단어를 입력해주세요.");
		String name = scan.next();
		System.out.println("의미를 입력하세요.");
		String mean = scan.next();
		
		list.add(new word1(name,mean));	
		System.out.println("--추가완료--");
				
	}
	
	
	public void search(Scanner scan) {
		
		System.out.println("검색할 단어를 입력하세요.");
		String name = scan.next();
		
//		for(int i = 0; i<list.size(); i++) {
//			if(name.equals(list.get(i).getWord())){
//				System.out.println(list.get(i));
//				return;
//			}
//		System.out.println("검색결과가 없습니다.");
//		}
//	}
		//간단한방법
		for(word1 tmp : list) {
			if(name.equals(tmp.getWord())){
			System.out.println("검색결과 : "+tmp);
			return;
			}
		}
			System.out.println("검색결과가 없습니다.");
				
	}
	
	
	
	public void modword(Scanner scan) {
		
		System.out.println("수정할 단어를 입력하세요.");
		String name = scan.next();
		System.out.println("의미를 입력하세요.");
		String mean = scan.next();
		
		for(int i =0; i<list.size(); i++) {
			if(name.equals(list.get(i).getWord())) {
				list.get(i).setMean(mean); 
				System.out.println("--수정완료--");
				return;
			}					
			System.out.println("단어가 존재하지 않습니다.");
		}
		
		
	}
	
	
	
	public void wordlist () {
		for(word1 tmp : list) {
			System.out.println(tmp);
		}
	}
	
	
	public void delword (Scanner scan) {
		
		System.out.println("삭제할 단어를 입력하세요.");
		String name = scan.next();
		
		for(int i =0; i<list.size(); i++) {
			if(name.equals(list.get(i).getWord())) {
				list.remove(list.get(i));
				System.out.println("--삭제완료--");
				return;
			}
		}
		System.out.println("단어가 존재하지 않습니다.");
	}
	
	
	
	public void file() throws IOException {
	
		try {
			
			FileWriter fw = new FileWriter("word.txt");
			for(word1 tmp : list) {
				String data = tmp+"\r\n";
				fw.write(data);
				
			}
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		BufferedReader br = new BufferedReader(new FileReader("word.txt"));
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			System.out.println(line);
		}
		br.close();
	}

	
	public void file1() throws IOException {
		FileWriter fs = new FileWriter("word.txt1");
		BufferedWriter bw = new BufferedWriter(fs);
		
		StringBuffer sb = new StringBuffer();
		String data = null;
		sb.append("--단어장--");
		sb.append("\r\n"); //줄바꿈
		int cnt =0;
		while(cnt<list.size()) {
			sb.append(list.get(cnt));
			sb.append("\r\n");
			cnt++;
		}
		data = sb.toString();
		System.out.println(data);
		bw.write(data);
		
		bw.close();
		fs.close();
	}
	
	
	
	public static void main(String[] args) throws IOException {
		// Word package에서 생성한 word클래스를 사용하여 단어장 프로그램작성
		// 단어장 프로그램 작성
		// 1.단어등록 | 2.단어검색 | 3.단어수정 | 4.단어출력 | 5. 단어 삭제 | 6.단어파일 출력 | 7.종료
		// word class ArrayList로 구성
		// 단어 몇개 등록, 정렬 출력
		
		
		WordMain w = new WordMain();
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		//w.add();
		do {
			System.out.println("메뉴를 입력하세요.");
			System.out.println("1.단어등록 | 2.단어검색 | 3.단어수정 | 4.단어출력 | 5. 단어 삭제 | 6.단어파일 출력 | 7.종료");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: w.wordadd(scan); break;
			case 2: w.search(scan); break;
			case 3: w.modword(scan); break;
			case 4: w.wordlist(); break;
			case 5: w.delword(scan); break;
			case 6: w.file1();break;
			case 7:break;
			default : System.out.println("잘못된 입력입니다.");
			}
		} while (menu != 7);
		System.out.println("프로그램 종료");
		
	
	
	
	
	}

		
		
	}

