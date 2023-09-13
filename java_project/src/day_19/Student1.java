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
	


	//�л���ϸ޼���
	public void stu(ArrayList<Student1> stulist) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� �л� �̸��� �Է��ϼ���.");
		stuname = scan.next();
		System.out.println("���̸� �Է��ϼ���.");
		stuage = scan.nextInt();
		System.out.println("�а��� �Է��ϼ���.");
		stufaculty=scan.next();
		
		stulist.add(new Student1(stuname, stuage, stufaculty));
		
		System.out.println("--�л� �߰� �Ϸ�--");
	}
	
	
	
	//�л� �˻� �޼���
	public void stusearch(ArrayList<Student1> stulist) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�˻��� �л� �̸��� �Է��ϼ���.");
		String stu = scan.next();
		
		for(Student1 tmp : stulist) {
			if(tmp.getStuname().equals(stu)) {
				System.out.println(tmp);
			}else {
				System.out.println("�ش��ϴ� �л��� �����ϴ�.");
			}
		}
	
	}
	
	
	//�л� ��ü ����Ʈ
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
		return "�л��̸�: " + stuname + ", ����: " + stuage + ", �а�: " + stufaculty ;
	}

	
}
