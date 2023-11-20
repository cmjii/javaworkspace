package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class WordManager {
	
	Scanner scan = new Scanner(System.in);
	
	public void wordadd(List<WordClass> list) {
		System.out.println("등록할 단어를 입력하세요.");
		String w = scan.next();
		System.out.println("뜻을 입력하세요.");
		String m = scan.next();
		list.add(new WordClass(w,m));
		System.out.println("등록완료");
	}
	
	public void wordsearch(List<WordClass> list) {
		System.out.println("검색할 단어를 입력하세요.");
		String w = scan.next();
		for(WordClass tmp : list) {
			if(tmp.getWord().equals(w)) {
				System.out.println(tmp);
			}else {
				System.out.println("해당하는 단어가 없습니다.");
			}
		}
	}
	
	public void wordchange(List<WordClass> list) {
		System.out.println("수정을 원하는 단어를 입력하세요.");
		String w = scan.next();
		System.out.println("수정할 뜻을 입력하세요.");
		String m = scan.next();
		for(WordClass tmp : list) {
			if(tmp.getWord().equals(w)) {
				tmp.setMean(m);
			}
		}
		System.out.println("수정완료");
	}
	
	public void wordlist(List<WordClass> list) {
		for(WordClass tmp : list) {
			System.out.println(tmp);
		}
	}
	
	public void filePrint(List<WordClass> list) throws IOException {
		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		StringBuffer sb = new StringBuffer();
		
		String data = "";
		int cnt =0;
		
		while(cnt < list.size()) {
			sb.append(list.get(cnt).toString());
			sb.append("\r\n"); // 줄바꿈 
			data = sb.toString();
			cnt++;
		}
		data = sb.toString();
		System.out.println(data);
		fw.write(data);
		fw.close();
		
	}
	
}
