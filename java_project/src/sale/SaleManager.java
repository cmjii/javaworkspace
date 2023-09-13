package sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {

	private ArrayList<Menu<String, Integer>> product = new ArrayList<>();
	private ArrayList<Menu<String, Integer>> order = new ArrayList<>();
	
	

		//menu Ŭ������ ����Ʈ�� ����
		

		 private int totsum=0;
		 
		 
		 public SaleManager() {
			 addMenu();
		 }
		 
		 public void addMenu( ) {
			 product.add(new Menu("�ܹ���",7000)); //��ü ����
			 product.add(new Menu("����",15000));
			 product.add(new Menu("�����",2000));
			 product.add(new Menu("����",1000));
			 product.add(new Menu("����",500));

		 }
		 
		 
		 
		 //�޴� �߰� ���
		 
		 public void add(Scanner scan) {
			 System.out.println("�޴���: ");
			 String menu = scan.next();
			 System.out.println("����: ");
			 int price = scan.nextInt();
			 
			 Menu m = new Menu(menu, price);
			 product.add(m);
			 System.out.println("�޴� �߰� �Ϸ�");
		 }
		 
		 
		 
		 
		//�޴�����Ʈ
		
		 public void printProduct() {
			 System.out.println("----menu----");
			 for(int i =0; i<product.size(); i++) {
				 System.out.println((i+1)+"."+product.get(i));
			 }
			 System.out.println("---------------------");
		 }
		 
		 
		 
		
		//�޴� ����, �ֹ� ó��
		 
		 public void orderPick(Scanner scan) {
			 System.out.println("�ֹ��޴�: ");
			 //1.�޴��� ���� �ѱ۷� �޴� ���̽�
			 //String menu = scan.next();
			 
			 //2.�޴��� ���ڷ� �޴� ���̽�
			 int pick = scan.nextInt(); //��ȣ : index-1
			 String tmpMenu = product.get(pick-1).getMenu();//�޴� ������
			 if(tmpMenu == null) {
				 System.out.println("ã�� �޴��� �����ϴ�.");
				 return;
			 } else { 
				 System.out.println("�ֹ�����: ");
				 int count = scan.nextInt();
				 int tmpPrice = product.get(pick-1).getPrice();//���� ������ 
				 totsum += (tmpPrice * count);
				 Menu m = new Menu(tmpMenu,count); // �޴��� ����
				 order.add(m);
				 
			 }
		 }
		 
		 
		 
		 
		 //�ֹ�����Ʈ�� ����
		 public void printOrder() {
			 int sum=0;
			 int index = 1;
			 for(Menu m : order) {
				 String menu = (String) m.getMenu();
				 int price = findMenu(menu);
				System.out.println(index+"."+m+"  "+m.getPrice()+"  "+((int)m.getPrice()*price));
				 
			 }
			 System.out.println("-------------");
			 System.out.println("�ֹ� �Ѿ� : "+totsum);
		 }
		 
		 
		 public int findMenu(String menu) {
			 for(Menu m : product) {
				 if(m.getMenu().equals(menu)) {			 
				 return (int) m.getPrice();
			 }
		 } return -1;
	 } 	
		 
		 
		 
	
		

	

	
	
	
}
