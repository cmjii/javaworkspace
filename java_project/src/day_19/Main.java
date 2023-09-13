package day_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student1 s = new Student1();
		Subject sb = new Subject();
		
		ArrayList<Student1> stulist = new ArrayList<Student1>();//학생 리스트
		ArrayList<Subject> sublist = new ArrayList<Subject>();
		
		
		int menu = 0;
		do {
			System.out.println("--메뉴--");
			System.out.println("1. 학생등록 | 2. 학생검색 | 3. 학생리스트 | 4. 수강신청 | 5. 수강철회 | 6. 종료");
			menu = scan.nextInt();
			
			switch (menu) {
			
			case 1: s.stu(stulist); break;
			case 2 : s.stusearch(stulist);; break;
			case 3 : s.stu1(stulist);break;
			case 4 : sb.sub(sublist);break;
			case 5 : sb.subc(sublist);break;
			case 6: break;
			default:System.out.println("잘못된 입력입니다.");
			
			}
			
		} while (menu !=6);
			System.out.println("--프로그램 종료--");
		

	}
}
