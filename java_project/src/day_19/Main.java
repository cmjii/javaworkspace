package day_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student1 s = new Student1();
		Subject sb = new Subject();
		
		ArrayList<Student1> stulist = new ArrayList<Student1>();//�л� ����Ʈ
		ArrayList<Subject> sublist = new ArrayList<Subject>();
		
		
		int menu = 0;
		do {
			System.out.println("--�޴�--");
			System.out.println("1. �л���� | 2. �л��˻� | 3. �л�����Ʈ | 4. ������û | 5. ����öȸ | 6. ����");
			menu = scan.nextInt();
			
			switch (menu) {
			
			case 1: s.stu(stulist); break;
			case 2 : s.stusearch(stulist);; break;
			case 3 : s.stu1(stulist);break;
			case 4 : sb.sub(sublist);break;
			case 5 : sb.subc(sublist);break;
			case 6: break;
			default:System.out.println("�߸��� �Է��Դϴ�.");
			
			}
			
		} while (menu !=6);
			System.out.println("--���α׷� ����--");
		

	}
}
