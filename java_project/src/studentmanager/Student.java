package studentmanager;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Student {

	//������� : �̸�, ����, ��ȭ��ȣ, map<����,����>, �����հ�, ���
	//������ : ��ü ������ �ʱⰪ�� ����
	//getter setter 
	//toString
	//�� Ŭ���� �⺻ �غ� ��
	
	
	//�������
	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> subject = new HashMap<String, Integer>();
	private  int sum;
	private double avg;
	
	
	
	
	//������
	public Student () {}
	public Student(String name) {
		this.name=name;
		this.age=15;
	}
	
	public Student(String name, int age, String phone) {
		this.name=name;
		this.age= age;
		this.phone=phone;
	}
	

	
	
	//�޼��� ���
	//�� �л��� ������ ���� ���, ���, ����, ����(���� -> �߰�)
	public void printOne() {//�л� �˻��� ������ ���ȭ��
		System.out.println(name+"("+age+")");
		if(phone != null) {
			System.out.println(phone);
		}

		//��������
		printSubject();
		calc();//�հ���հ��
		
		//�հ�, ��� ���
		if(sum!=0) {
			System.out.println("result: "+sum+"["+avg+"]");
		}else {
			//������ ������ �����ϴٷ� ���
			System.out.println("������ �����ϴ�.");
		}
		System.out.println("----------------------------");
		
		
		
	}
	
	//subject ��� �޼���
	public void printSubject() {
		for(String tmp : subject.keySet()) {
			System.out.println(tmp+": "+subject.get(tmp));
		}
	}
	
	
	
	//subject�� ���� �հ�, ��� ���ϴ� �޼���
	public void calc() {
		sum =0;
		avg = 0;
		for(String tmp : subject.keySet()) {
			sum+=subject.get(tmp);
		}
		avg=(double)sum/subject.size();
	}
	
	
	//����, ���� ���
	public void addSubject(String subject,int score) {
		this.subject.put(subject, score);
		System.out.println("���� �߰� �Ϸ�");
	}
	
	
	
	//����, ���� ����
	public void delSubject(String subject) {
		if(this.subject.remove(subject)==null) {
			System.out.println("�ش� ������ �����ϴ�.");
			return;
		}else {
			this.subject.remove(subject);
			System.out.println("���� ���� �Ϸ�");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//getter/setter
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public HashMap<String, Integer> getSubject() {
		return subject;
	}
	public void setSubject(HashMap<String, Integer> subject) {
		this.subject = subject;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	
	@Override
	public String toString() {
		return "name=" + name + "(" + age +"),"+ "phone=" + ((phone != null)? phone : " ") ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
	
	
	
}
