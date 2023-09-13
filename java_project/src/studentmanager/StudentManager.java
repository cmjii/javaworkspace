package studentmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager implements Program{

	//������� Student List
	private  List<Student> student = new ArrayList<>();
	
	public StudentManager() {//�ʼ��� �����ڿ� ����
		add();
	}
	
	//�⺻ �л� �߰�
	public void add() {
		student.add( new Student("ȫ�浿",16,"010-7777-8888"));
		student.add( new Student("�����",15, "010-1111-2222"));
		student.add( new Student("�̼���",16,"010-3333-3333"));
		student.add( new Student("������",16,"010-1111-5555"));
		student.add( new Student("�ٵ���"));
	}
	
	@Override //�߰� �޼���
	public void addStd(Scanner scan) {
		System.out.println("�߰��� �̸��� �Է��ϼ���.");
		String name = scan.next();
//		System.out.println("���̸� �Է��ϼ���.");
//		int age = scan.nextInt();
//		System.out.println("��ȣ�� �Է��ϼ���.");
//		String phone = scan.next();
		student.add(new Student(name));
		
		System.out.println("--�߰��Ϸ�--");
	}

	@Override //����Ʈ �޼���
	public void printStd() {
		for(int i =0; i<student.size(); i++) {
			System.out.println(student.get(i));
		}
		
	}

	@Override  //�˻� �޼���
	public void searchStd(Scanner scan) {
		// �л����� �Է¹޾� �л� ������ ���
		System.out.println("�л����� �Է��ϼ���.");
		String name = scan.next();
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).printOne();
				return;
			}
		}
		System.out.println("�˻��� �л��� ã�� �� �����ϴ�.");
	}

	@Override  //�����޼���
	public void modStd(Scanner scan) {
		// ������ ����(�̸�, ����, ��ȭ��ȣ)
		System.out.println("�л����� �Է��ϼ���.");
		String name = scan.next();
		for(int i = 0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("������ ������ �Է��ϼ���.");
				String op = scan.next();
				switch(op) {
				case "�̸�" :System.out.println("������ ���� �Է��ϼ���.");
							String modName = scan.next();
							student.get(i).setName(modName);
							System.out.println("--�����Ϸ�--");
							break;
				case "����" : System.out.println("������ ���� �Է��ϼ���.");
							 int modage = scan.nextInt();
							 student.get(i).setAge(modage);
							 System.out.println("--�����Ϸ�--");
							 break;
				case "��ȭ��ȣ" :System.out.println("������ ���� �Է��ϼ���.");
					          String modphone = scan.next();
							  student.get(i).setPhone(modphone);
							  System.out.println("--�����Ϸ�--");
							  break;
				default : System.out.println("�߸��� �Է��Դϴ�.");
				}
				return;
			}
		}
		System.out.println("�л��� �������� �ʽ��ϴ�.");
		
	}

	//remove�� index����
	 @Override //�����޼���
	public void delStd(Scanner scan) {
		// �л����� �Է¹޾� ��ġ�ϴ� �л��� ����
		System.out.println("������ �л����� �Է��ϼ���.");
		String name = scan.next();
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.remove(i);
		System.out.println("--��ҿϷ�--");
				return;
			}
			}
		System.out.println("�л��� �������� �ʽ��ϴ�.");
		
		//remove(object) ���� = > object ��ü�� �̸��� ��ġ�ϸ� ���� ��ü
//		student.remove(new Student(name));
//		if(!student.remove(new Student(name))) {
//			System.out.println("�л��� �������� �ʽ��ϴ�.");
//			return;
//		}
		
	}
	
	
	

	@Override
	public void addSub(Scanner scan) {
		// �л���/����/���� �Է¹޾� ������ �޼��� ȣ��
		System.out.println("�л����� �Է��ϼ���.");
		String name = scan.next();
		System.out.println("������ �Է��ϼ���.");
		String sub = scan.next();
		System.out.println("������ �Է��ϼ���.");
		int score = scan.nextInt();
		
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).addSubject(sub, score);
				return;
			}
		} System.out.println("�߸��� �Է��Դϴ�.");
	}

	@Override
	public void modSub(Scanner scan) {
		// TODO Auto-generated method stub
		
		System.out.println("�л����� �Է��ϼ���.");
		String name = scan.next();
		for(int i = 0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				System.out.println("������ ������ �Է��ϼ���.");
				String op = scan.next();
				switch(op) {
				case "�̸�" :System.out.println("������ ���� �Է��ϼ���.");
							String modsub = scan.next();
							student.get(i).setName(modsub);
							System.out.println("--�����Ϸ�--");
							break;
				case "����" : System.out.println("������ ���� �Է��ϼ���.");
							 int modage = scan.nextInt();
							 student.get(i).setAge(modage);
							 System.out.println("--�����Ϸ�--");
							 break;
				case "��ȭ��ȣ" :System.out.println("������ ���� �Է��ϼ���.");
					          String modphone = scan.next();
							  student.get(i).setPhone(modphone);
							  System.out.println("--�����Ϸ�--");
							  break;
				default : System.out.println("�߸��� �Է��Դϴ�.");
				}
				return;
			}
		}
		System.out.println("�л��� �������� �ʽ��ϴ�.");
	}

	
	
	@Override
	public void delSub(Scanner scan) {
		System.out.println("�л����� �Է��ϼ���.");
		String name = scan.next();
		System.out.println("������ �Է��ϼ���.");
		String sub = scan.next();
		
//		int i = index(name);
//		student.get(i).delSubject(sub);
//		if(i==-1) {
//			System.out.println("�л��� �����ϴ�.");
//		}else {
//			student.get(i).delSubject(sub);
//		}
		
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				student.get(i).delSubject(sub);
				return;
			}
		}
		System.out.println("�л��� �����ϴ�.");
	}
	
	public int index(String name) {
		for(int i =0; i<student.size(); i++) {
			if(student.get(i).getName().equals(name)) {
				return i;
			}
		}
	return-1;
	}
	
}
