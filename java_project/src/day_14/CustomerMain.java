package day_14;

public class CustomerMain {

	public static void main(String[] args) {
	
		
			Customer[] customerList = new Customer[10];
			
			Customer cLee = new Customer(1001, "������");
			Customer cHong = new Gold(1002, "ȫ�浿");
			Customer cKim = new VIP(1003, "��ö��", 1111);
			Customer cchoi = new VIP(1004,"������",2222);
			Customer cppp = new Gold(1005,"������");
			Customer cqqq = new Customer(1006,"������");
			
			int cnt=0;
			customerList[cnt]=cLee;
			cnt++;
			customerList[cnt]=cHong;
			cnt++;
			customerList[cnt]=cKim;
			cnt++;
			customerList[cnt]=cchoi;
			cnt++;
			customerList[cnt]=cppp;
			cnt++;
			customerList[cnt]=cqqq;
			
			
			
//			int price = cKim.calcPrice(10000);
//			System.out.println("���ұݾ�:"+price);
//			cKim.customerInfo();
			
			System.out.println("---�� ���� ���---");
	
			//for���� Ȱ���� ������ ���
			
			for(int i =0; i<cnt; i++) {
				customerList[i].customerInfo();
//				System.out.println("�̸�: " + customerList[i].getCustomerName() );
//				System.out.println("���: " + customerList[i].getCustomerGrade());
			}
						
		System.out.println();
			
			System.out.println("--�������� ����Ʈ ���--");
			//ȫ�浿���� �����Ͻ� �ݾ��� 000�� / ���ʽ�����Ʈ�� 00���Դϴ�.
			
			int price = 100000;
			for(int i =0; i<cnt; i++) {
		
			System.out.println(customerList[i].getCustomerName()+"���� �����Ͻ� �ݾ��� "+customerList[i].calcPrice(price)+"�� / " + "���ʽ� ����Ʈ�� "+customerList[i].bonusPoint+"�Դϴ�.");
			
			}
			
			//�ٿ�ĳ���� : �θ��� �����Ǵ� ��������� �޼��尡 �ƴ�
			//�ڽ��� ���� ��������� �޼��带 ȣ���ϰ��� �� �� �ʿ�
			//�ٿ� ĳ���� : �ݵ�� ��������� ����ȯ �ؾ���.
			//instanceof ���� �� ���°� �´��� Ȯ�� true, false
			
			//1111�Ѹ��� 3333
			
			for(int i =0; i<cnt; i++) {
				Customer cus = customerList[i]; //�ּҺ��� (��ü ���� X)
				if(cus instanceof VIP) {
					VIP ckim = (VIP) cus;
					if(cKim.getCustomerID()==1111) {
						ckim.setAgentID(3333);
					}
				
			}customerList[i].customerInfo();
		}	
		
	}
}
