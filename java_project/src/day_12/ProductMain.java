package day_12;

import java.util.Scanner;

//ProductMain Ŭ���� ����
//Product �迭 ���� [10] �޴� �߰� �޼��� Ȱ��
//��ǰ ��� �� ��ǰ ����Ʈ ���

//��ǰ�� ����Ͻðڽ��ϱ�? y : ��� n : ���
//y= ��ǰ�̸��� ������ ��� �޾� �迭�� ���
//n= ��ü ��� ����Ʈ ���
public class ProductMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Product[]p = new Product[10];
		
		char menu ='y';
		int cnt =0; //while���� index�� �ڵ鸵 �ϱ� ���� ����
		
		while(menu !='n') {
			System.out.println("��ǰ���(y/n) >>");
			menu = scan.next().charAt(0);
			
			if (menu=='y') {
				//�ݺ��Է�
				System.out.println("��ǰ�� >");
				String name = scan.next();
				
				System.out.println("���� >");
				int price = scan.nextInt();
				
				//��ü�� �����ؼ�, �޴��� ������ ��� -> �迭 cnt������ �߰�
				//������ �̿�
				Product tmp = new Product(name,price);
				p[cnt] = tmp;
				
				//�޼��� �̿�
				p[cnt] = new Product();
				p[cnt].insertProduct(name, price);
				cnt++; //index����
			}else {
				if(menu =='n') {
					System.out.println("��ǰ��� ����");
				}else {
					System.out.println("y/n�� �����մϴ�.");
				}
			}//menu =='n'
		}
		System.out.println("---��ϵ� ��ǰ ����Ʈ---");
		for(int i =0; i<cnt; i++) {
			p[i].print();
		}
		
	}		
	}

