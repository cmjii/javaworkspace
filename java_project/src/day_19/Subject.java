package day_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Subject {

	/* �������� ���α׷�
	 * 1. �л���� 2. �л��˻� 3. �л�����Ʈ 4. ������û 5. ����öȸ 6. ����
	 * ����Ʈ�� �����
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
		
		System.out.println("��û�� ������ �Է��ϼ���.");
		subname = scan.next();
		System.out.println("������ �Է��ϼ���.");
		subCredite=scan.nextInt();
		
		sublist.add(new Subject(subname, subCredite));
		
		System.out.print("��û�Ϸ� > ");
		
		for(Subject tmp : sublist) {
			System.out.println(tmp);
		}
	}
	
	
	public void subc(ArrayList<Subject> sublist) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("����� ������ �Է��ϼ���.");
		String sub = scan.next();

		for(Subject tmp : sublist) {
			if(tmp.getSubname().equals(sub)) {
				sublist.remove(tmp);
				System.out.println("��ҿϷ�");	
			}else {
				System.out.println("�ش�Ǵ� ������ �����ϴ�.");
			}
		} 	
		
			for(Subject tmp : sublist) {
				System.out.println("���� ����Ʈ: "+tmp);}
	
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
		return "����� : " + subname + ", ���� : " + subCredite ;
	}
	
	
	
	
}
