package day_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Student1 {

	private String stuname;
	private int stuage;
	private String stufaculty;
	public Student1() {}
	public Student1(String stuname, int stuage, String stufaculty) {
	
		this.stuname=stuname;
		this.stuage = stuage;
		this.stufaculty = stufaculty;
		
	}
	


	//학생등록메서드
	public void stu(ArrayList<Student1> stulist) {
		Scanner scan = new Scanner(System.in);
		System.out.println("등록할 학생 이름을 입력하세요.");
		stuname = scan.next();
		System.out.println("나이를 입력하세요.");
		stuage = scan.nextInt();
		System.out.println("학과를 입력하세요.");
		stufaculty=scan.next();
		
		stulist.add(new Student1(stuname, stuage, stufaculty));
		
		System.out.println("--학생 추가 완료--");
	}
	
	
	
	//학생 검색 메서드
	public void stusearch(ArrayList<Student1> stulist) {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 학생 이름을 입력하세요.");
		String stu = scan.next();
		
		for(Student1 tmp : stulist) {
			if(tmp.getStuname().equals(stu)) {
				System.out.println(tmp);
			}else {
				System.out.println("해당하는 학생이 없습니다.");
			}
		}
	
	}
	
	
	//학생 전체 리스트
	public void stu1(ArrayList<Student1> stulist) {
		for(Student1 student : stulist) {
			System.out.println(student);
		}
	}
	
	
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public int getStuage() {
		return stuage;
	}
	public void setStuage(int stuage) {
		this.stuage = stuage;
	}
	public String getStufaculty() {
		return stufaculty;
	}
	public void setStufaculty(String stufaculty) {
		this.stufaculty = stufaculty;
	}
	@Override
	public String toString() {
		return "학생이름: " + stuname + ", 나이: " + stuage + ", 학과: " + stufaculty ;
	}

	
}
