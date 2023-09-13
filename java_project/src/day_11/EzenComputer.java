package day_11;

import java.util.Scanner;

//�л��� �⺻���� : �̸�, �������, ���� , ��ȭ��ȣ
//�п����� :  �п��̸� = 'EZEN', ����
//�������� : ��������, �Ⱓ(2023-08-16~2024-03-14)
//ex)ȫ�浿, 990101, 23, 010-1111-1111 -> �л����� ���
//EZEN, ��õ���� -> �п����� ���
//�ڹ�(6����), DB (1����), html (2����) -> �������� ���
//���: �л��������, �п��������, �����������
//�л��� ���������� �߰��ϴ� ���


 class EzenComputer {

	private String name;//������
	private String birth;
	private int age;
	private String phone;//������
	//final -> ���� �Ұ�����
	public final static String company = "EZEN";
	private String branch;
	private String[] course = new String[5];	//�������� -> �ѻ���� ���������� ����
	private String[] period = new String[5];//�����Ⱓ 5��
	private int cnt; //�迭�� index ó���� ���� ����
	
	//������
	
	//�޼��� ��� (���� ������ �߰�)
	
	//���� ���

	//getter,setter
	
	
	public EzenComputer() {}
	public EzenComputer (String name, String phone) {
		this.name=name; 	this.phone=phone; 
	}
	

	public EzenComputer (String name, String phone, String birth, int age, String branch) {
		this.name=name; 	this.phone=phone;  this.age=age;	this.birth=birth;   this.branch=branch;
	}

	public void student() {//�л����� ���
	
		System.out.println(name+", "+birth+", "+age+", "+phone);
	}
	
	public void academy() {
		
		System.out.println(company +"("+ branch+")");
	}
	
	public void course() { //�迭 for������ �ݺ��Ͽ� ���
		//null�� �ߴ� ��Ȳ�� ���־���
		if(course.length==0 || cnt ==0) {
			System.out.println("�����̷��� �����ϴ�.");
			return;//����� ���߰� �޼��� ������
		}
		//�߰��� ������ �ִٸ�
		for(int i =0; i<cnt; i++) {
		System.out.print(course[i]+"("+period[i]+") ");
	}
		System.out.println();//���� ����� ������ �ٹٲ�
	}
	
	public void addc(String course, String period) {
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++; //index���� ����
	}
	
	
	public void search(EzenComputer[] std, String name) {
		
		for(int i =0; i<std.length; i++) {
		
		}
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
//	public void course1() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println();
//		for(int i = 0; i<course.length; i++) {
//			System.out.print("���������� �Է����ּ��� > ");
//			String name = sc.next();
//			course[i]=name;
//
//			System.out.print("�����Ⱓ�� �Է����ּ��� > ");
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
