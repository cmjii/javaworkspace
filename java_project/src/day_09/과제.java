package day_09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// 클래스 객체 생성 (2명)
		// 값을 입력 후 정보출력 (2명)
		
		Student stu = new Student();
		
		stu.setName("홍길동");
		stu.setAge(21);
		stu.setNum("010-5555-6666");
		stu.print();
		
		Student stu1 = new Student();
		
		stu1.setName("심청이");
		stu1.setAge(25);
		stu1.setNum("010-9999-1111");
		stu1.print();
		
//		Student stu2 = new Student();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이름");
//		stu2.setName(scan.next());
//		stu2.print();
		
		Student stu3 = new Student("홍길순", 23, "010-7777-8888", "서울시");
		stu3.print();
		
		Student stu4 = new Student("아이",5);
		stu4.print();
		
		
		
	}

}

//클래스 생성
//학생 클래스 생성
//이름, 나이, 전화번호, 주소
//출력
//이름(나이) 전화번호

class Student {

	private String name;
	private int age;
	private String num;
	private String ad;
	
	
	//생성자 위치
	//생성자 오버로딩 가능
	//생성자 오버리딩 조건 - 매개변수 개수가 다르거나, 유형이 다르거나
	public Student() {} //생성자 만들 때에 기본 생성자도 같이 만들어주는 것을 권장
	
	public Student(String name, int age) {
		this.name=name;
		this.age= age;
	}
	public Student(String name, int age, String num, String ad) {
		//생성자 호출 (호출은 반드시 첫줄에서만 가능)
		this(name,age);
		this.num = num;
		this.ad = ad;
	}
	
	
	
	public void print() {
		System.out.println(name+"("+age+")"+" "+num);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}


	
	

	
}