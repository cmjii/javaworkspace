package day_05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//파일명 5개가 주어졌을 때, 원하는 단어를 입력하면 입력한 단어가 있는 파일들을 출력하도록 코드를 작성하시오.
		
		String[] filename = {"java의 정석.txt","이것이 java다.jpg","String메서드.txt","String함수.jpg","java의 함수.png"};	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 단어를 입력하시오.");
		String str = scan.nextLine(); //next : 공백 없는 1단어 nextLine : 공백포함 문장
		//System.out.println(filename.contains("자바"));
		int count =0;
		System.out.println("--검색 값 : "+str+"--");
		
		for (String tmp : filename) {
			if(tmp.contains(str)) {
			System.out.println(tmp);
			count++;
			}
		} System.out.println("총 검색결과" + count +"개 출력");
			if (count ==0) {
				System.out.println("검색 결과가 없습니다.");
			} 
//		for(int i =0; i<filename.length; i++) {
//			if(filename[i].contains(str)) {
//				System.out.println(filename[i]);
//			}else {
//				System.out.println("해당되는 단어가 없습니다."); break;
//			}
//		}
		
		
		scan.close();
		
	}

}
