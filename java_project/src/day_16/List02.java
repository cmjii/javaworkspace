package day_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* --�޴���--
		 * 1.�ܹ��� 7000
		 * 2.���� 15000
		 * 3.����� 2000
		 * 4.���� 1000
		 * 5.���� 500
		 * 6.���α׷� ����
		 * 
		 * �޴����� > 1
		 * ������ ���� > 2
		 * => 1�� �ܹ��� 2�� �ֹ�
		 * �ֹ��� �����÷��� 0�� �����ּ���.
		 * �ٸ� ��ȣ ������ �޴����� > 3��
		 * ���� > 2
		 * => 3�� ���� 2�� �ֹ�
		 * �ֹ��� �����÷��� 0�� �����ּ���.
		 * 0
		 * --������ �޴�--
		 * 1�� �ܹ��� 2��, 2�� ���� 2�� ����
		 * �� ���ұݾ� ----��
		 * */
		
		
	FoodManager f = new FoodManager(); //add �Ϸ�
	System.out.println(f.getList1());
	System.out.println(f.getList2());
	
	ArrayList<Integer> order = new ArrayList<>();
	ArrayList<Integer> count = new ArrayList<>();
	
	int menu = -1;
	
	do {
		f.printMenu(); //�޴� ���
		menu = scan.nextInt(); //�޴� �Է¹ޱ�
		//1~5 �Ϲݸ޴�, 6 ���α׷� ����, 0 �޴����� ��
		if(menu==6) {
			System.out.println("���α׷� ����");
			break;
		}
		
		if(menu!=0) {
			if(menu<6) {
				System.out.println("���� : ");
				int cnt = scan.nextInt();
				order.add(menu);
				count.add(cnt);
				f.sale(menu, cnt);
				System.out.println("�ֹ������ 0�� ���α׷� ����� 6��");
			} else {
				System.out.println("�߸��� �޴�");
			}
		}
		
	}while(menu!=0); //�޴� �ֹ��� ������� ���� 
	//�޴��� ��ü �ݾ��� ��� totsum
	System.out.println("--�޴�Ȯ��--");
	for(int i =0; i<order.size(); i++) {
		System.out.print(f.getList1().get(order.get(i)-1)+" "); //����
		System.out.println(count.get(i)+"��");
		int price = f.getList2().get(order.get(i)-1);
		System.out.println(" "+(price*count.get(i)));
	}
	System.out.println("--------------------");
	System.out.println("�ѱݾ� : "+f.getTotsum());
}
}

class FoodManager {
	//������� ArrayList �޴�, ArrayList ���� 
	//�� �� �ʿ��� ��������� �˾Ƽ�
	
	public FoodManager() {
		add();
	}
	
	
	//�޼���
	//���� : ������, �޴����, (�ֹ�)add(), (������)sale()
	
	
	private List<String> list1 = new ArrayList<String>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	private int sum;
	private int totsum;
	
	
	public void printMenu() {
		System.out.println("--menu--");
		System.out.println("1.�ܹ��� 7000");
		System.out.println("2.���� 15000");
		System.out.println("3.����� 2000");
		System.out.println("4.���� 1000");
		System.out.println("5.���� 500");
		System.out.println("�޴� ���� >");
	}
	
	public void add() {
		//list�� �� �߰�
		list1.add("�ܹ���"); //index0
		list1.add("����");
		list1.add("�����");
		list1.add("����");
		list1.add("����");
		
		list2.add(7000); //index0
		list2.add(15000);
		list2.add(2000);
		list2.add(1000);
		list2.add(500);
	}
	
	public void sale(int menu, int count) {
		//menu�� list2�� index��ȣ�� ���
		sum = list2.get(menu-1) * count; //�ϳ��� �ֹ��� ���� �ݾ�
		totsum +=sum;
		System.out.println("----------");
		System.out.println("�ֹ��Ͻ� �޴��� "+list1.get(menu-1)+" "+count+"�� �Դϴ�.");
		System.out.println("�ݾ� : "+sum);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public List<String> getList1() {
		return list1;
	}

	public void setList1(List<String> list1) {
		this.list1 = list1;
	}

	public List<Integer> getList2() {
		return list2;
	}

	public void setList2(List<Integer> list2) {
		this.list2 = list2;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTotsum() {
		return totsum;
	}

	public void setTotsum(int totsum) {
		this.totsum = totsum;
	}
	
	
	
}