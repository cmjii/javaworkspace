package day_11;

import java.util.Scanner;

//학생의 기본정보 : 이름, 생년월일, 나이 , 전화번호
//학원정보 :  학원이름 = 'EZEN', 지점
//수강정보 : 수강과목, 기간(2023-08-16~2024-03-14)
//ex)홍길동, 990101, 23, 010-1111-1111 -> 학생정보 출력
//EZEN, 인천지점 -> 학원정보 출력
//자바(6개월), DB (1개월), html (2개월) -> 수강정보 출력
//기능: 학생정보출력, 학원정보출력, 수강정보출력
//학생의 수강정보를 추가하는 기능


 class EzenComputer {

	private String name;//생성자
	private String birth;
	private int age;
	private String phone;//생성자
	//final -> 변경 불가능한
	public final static String company = "EZEN";
	private String branch;
	private String[] course = new String[5];	//수강정보 -> 한사람이 여러과목을 수강
	private String[] period = new String[5];//수강기간 5개
	private int cnt; //배열의 index 처리를 위한 변수
	
	//생성자
	
	//메서드 기능 (수강 정보를 추가)
	
	//별도 출력

	//getter,setter
	
	
	public EzenComputer() {}
	public EzenComputer (String name, String phone) {
		this.name=name; 	this.phone=phone; 
	}
	

	public EzenComputer (String name, String phone, String birth, int age, String branch) {
		this.name=name; 	this.phone=phone;  this.age=age;	this.birth=birth;   this.branch=branch;
	}

	public void student() {//학생정보 출력
	
		System.out.println(name+", "+birth+", "+age+", "+phone);
	}
	
	public void academy() {
		
		System.out.println(company +"("+ branch+")");
	}
	
	public void course() { //배열 for문으로 반복하여 출력
		//null이 뜨는 상황도 없애야함
		if(course.length==0 || cnt ==0) {
			System.out.println("수강이력이 없습니다.");
			return;//출력을 멈추고 메서드 끝내기
		}
		//추가된 과목이 있다면
		for(int i =0; i<cnt; i++) {
		System.out.print(course[i]+"("+period[i]+") ");
	}
		System.out.println();//과목 출력이 끝나면 줄바꿈
	}
	
	public void addc(String course, String period) {
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++; //index번지 증가
	}
	
	
	public void search(EzenComputer[] std, String name) {
		
		for(int i =0; i<std.length; i++) {
		
		}
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
//	public void course1() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println();
//		for(int i = 0; i<course.length; i++) {
//			System.out.print("수강과목을 입력해주세요 > ");
//			String name = sc.next();
//			course[i]=name;
//
//			System.out.print("수강기간을 입력해주세요 > ");
//			String num = sc.next();
//			period[i]=num;
//			
//	}
//		
//		for(int i =0; i<course.length; i++) {
//			System.out.print(course[i]+"("+period[i]+") ");
//		}
//		
//
//	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String[] getCourse() {
		return course;
	}
	public void setCourse(String[] course) {
		this.course = course;
	}
	public String[] getPeriod() {
		return period;
	}
	public void setPeriod(String[] period) {
		this.period = period;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
