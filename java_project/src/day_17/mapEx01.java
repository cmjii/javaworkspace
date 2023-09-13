package day_17;

import java.util.HashMap;
import java.util.Scanner;

public class mapEx01 {

	public static void main(String[] args) {
		/* Map�� �̿��� ���� ���� ���α׷��� ����
		 * -- menu --
		 * 1. �����߰�
		 * 2. ������ȸ (��ü���) : �հ�/��� ���� ���
		 * 3. ������ȸ(���� ��ȸ) : ���� -> 98�� (��ġ �� ��ġ�ϴ� ���� ���)
		 * 4. �������� : ��ġ �� ����								
		 * 5. ��������										
		 * 6. ����											
		 * */					
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		int a = 0;
		do {			
			menu();
			
			a = scan.nextInt();		
			
			switch(a) {
			case 1 : list(map); break;
			case 2 : list1(map); break;
			case 3 : print(map); break;
			case 4 : lists(map); break;
			case 5 : listd(map); break;
			case 6 : break;
			default : System.out.println("�߸��� �Է��Դϴ�."); break;
						
			}
							
		
		} while (a != 6);
			System.out.println("���α׷� ����");						
	
	}			
	
	
	
	//���� �߰�
	public static void list (HashMap<String, Integer> map) {
	
	Scanner scan = new Scanner(System.in);
	
	int y =0;
	
	do { 	
			System.out.println("�߰��� ������ �Է����ּ���.");
			String sub = scan.next();
			System.out.println("������ �Է����ּ���.");
			int num = scan.nextInt();
			if(num<0||num>100) {
				System.out.println("�߸��� �����Դϴ�."); return;
			}
			if(map.get(sub)==null) {
				map.put(sub, num);
			}else {
				System.out.println("�̹� �߰��� �����Դϴ�.");
			}
		
			System.out.println("������ �߰��Ϸ��� 1��, �����Ϸ��� 0���� �����ּ���.");
			y = scan.nextInt();
			
			
	} while (y !=0);
	
	
}		
	
	
	//��ü ���
	public static void  list1 ( HashMap<String, Integer> map) {
		Scanner scan = new Scanner(System.in);
		int sum =0;
		System.out.println("--��ü--");
		for(String tmp : map.keySet()) {
			System.out.print(tmp+" :" + map.get(tmp)+" ");
		}
		for(String tmp : map.keySet()) {
			sum+= map.get(tmp);
		}
		System.out.println();
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+(double)sum/map.size());
		System.out.println("�޴��� ���ư��Ÿ� 1 ���� �����ּ���.");
		int j = scan.nextInt();
		
	}
	
	
	
	//������ȸ
	public static void print (HashMap<String, Integer> map) {
		Scanner scan = new Scanner(System.in);
		int i =0;
		
	do {
		
		System.out.println("�˻��� ������ �Է��ϼ���.");
		String a = scan.next();
		if(map.containsKey(a)) {
			System.out.println(a+"->"+map.get(a));
		}
		else if(!(map.containsKey(a))) {
			System.out.println("�˻��Ͻ� ������ �����ϴ�.");
		}
	
		System.out.println("�� �˻��Ϸ��� 1��, �����Ϸ��� 0���� �����ּ���.");
		i = scan.nextInt();
		
	}	while (i!=0);
}
	
	//��������
	public static void lists (HashMap<String, Integer> map) {
		Scanner scan = new Scanner(System.in);
		int f = 0;
	do {	System.out.println("������ �ʿ��� ������ �Է����ּ���.");
		String q = scan.next();
		
		if(map.containsKey(q)) {
			System.out.println("������ ������ �Է����ּ���.");
			int w = scan.nextInt();
			map.put(q, w);
		}
		System.out.println("--���� Ȯ��--");
			System.out.println(q+"->"+map.get(q));
			
			System.out.println("�� �����Ϸ��� 1��, �����Ϸ��� 0���� �����ּ���.");
			f = scan.nextInt();
		
	}while(f!=0);
		
		
		
	}
	
	//��������
	public static void listd (HashMap<String, Integer> map) {
		Scanner scan = new Scanner(System.in);
		int h = 0;
  do {	System.out.println("������ ������ �Է����ּ���.");
		String p = scan.next();
		map.remove(p);
		System.out.println("--���� �� ����--");
		for(String tmp : map.keySet()) {
			System.out.print(tmp+":" + map.get(tmp)+" ");
			System.out.println();
		}
		System.out.println("�� �����Ϸ��� 1��, �����Ϸ��� 0���� �����ּ���.");
		h = scan.nextInt();
	
  		}while(h!=0);
	}
	
	
	//�޴� �޼���
	public static void menu ( ) {
		
		System.out.println("--�޴�--");
		System.out.println("1. �����߰�");
		System.out.println("2. ������ȸ (��ü���)");
		System.out.println("3. ������ȸ(���� ��ȸ)");
		System.out.println("4. ��������");
		System.out.println("5. ��������	");
		System.out.println("6. ����");
		 
	}
			
	
	
}


