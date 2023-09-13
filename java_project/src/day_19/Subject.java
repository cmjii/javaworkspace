package day_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Subject {

	/* 수강관리 프로그램
	 * 1. 학생등록 2. 학생검색 3. 학생리스트 4. 수강신청 5. 수강철회 6. 종료
	 * 리스트로 만들기
	 * */
	
	
	private String subname;
	private int subCredite;

	
	public Subject() {}
	public Subject(String subname, int subCredite) {
		this.subname=subname;
		this.subCredite=subCredite;
	}
	
	
	
	public void sub(ArrayList<Subject> sublist) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("신청할 과목을 입력하세요.");
		subname = scan.next();
		System.out.println("학점을 입력하세요.");
		subCredite=scan.nextInt();
		
		sublist.add(new Subject(subname, subCredite));
		
		System.out.print("신청완료 > ");
		
		for(Subject tmp : sublist) {
			System.out.println(tmp);
		}
	}
	
	
	public void subc(ArrayList<Subject> sublist) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("취소할 과목을 입력하세요.");
		String sub = scan.next();

		for(Subject tmp : sublist) {
			if(tmp.getSubname().equals(sub)) {
				sublist.remove(tmp);
				System.out.println("취소완료");	
			}else {
				System.out.println("해당되는 과목이 없습니다.");
			}
		} 	
		
			for(Subject tmp : sublist) {
				System.out.println("과목 리스트: "+tmp);}
	
	}
	
	
	
	
	
	
	
	
	
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public int getSubCredite() {
		return subCredite;
	}
	public void setSubCredite(int subCredite) {
		this.subCredite = subCredite;
	}
	
	
	@Override
	public String toString() {
		return "과목명 : " + subname + ", 학점 : " + subCredite ;
	}
	
	
	
	
}
