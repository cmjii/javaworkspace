package day_09;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		// Ŭ���� ��ü ���� (2��)
		// ���� �Է� �� ������� (2��)
		
		Student stu = new Student();
		
		stu.setName("ȫ�浿");
		stu.setAge(21);
		stu.setNum("010-5555-6666");
		stu.print();
		
		Student stu1 = new Student();
		
		stu1.setName("��û��");
		stu1.setAge(25);
		stu1.setNum("010-9999-1111");
		stu1.print();
		
//		Student stu2 = new Student();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("�̸�");
//		stu2.setName(scan.next());
//		stu2.print();
		
		Student stu3 = new Student("ȫ���", 23, "010-7777-8888", "�����");
		stu3.print();
		
		Student stu4 = new Student("����",5);
		stu4.print();
		
		
		
	}

}

//Ŭ���� ����
//�л� Ŭ���� ����
//�̸�, ����, ��ȭ��ȣ, �ּ�
//���
//�̸�(����) ��ȭ��ȣ

class Student {

	private String name;
	private int age;
	private String num;
	private String ad;
	
	
	//������ ��ġ
	//������ �����ε� ����
	//������ �������� ���� - �Ű����� ������ �ٸ��ų�, ������ �ٸ��ų�
	public Student() {} //������ ���� ���� �⺻ �����ڵ� ���� ������ִ� ���� ����
	
	public Student(String name, int age) {
		this.name=name;
		this.age= age;
	}
	public Student(String name, int age, String num, String ad) {
		//������ ȣ�� (ȣ���� �ݵ�� ù�ٿ����� ����)
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