package day_16;

public class �͸�Ŭ���� {

	public static void main(String[] args) {
		/* �͸�Ŭ���� : �̸��� ���� Ŭ����
		 * �������̽��� �̿��Ͽ� ��ü�� ���� �� Ŭ���� ���� �ٷ� ����
		 * �͸� Ŭ������ ����ϴ� ����
		 * �������̽��� ����� ����, �ش� ��ü�� �ѹ��� ����� ��� 
		 * �޼��忡�� �Ű������� �������̽��� ������ Ŭ������ �ʿ�.
		 * 
		 * */
		
		product(new Power() {

			@Override
			public void turnOn() {
				System.out.println("������ �մϴ�.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("������ ���ϴ�.");
			}
		});
		
		
	}

	public static void product(Power p) {
		p.turnOn();
		System.out.println("��ǰ�� �۵����Դϴ�.");
		p.turnOff();
		System.out.println("��ǰ�� �������ϴ�.");
	}
	
}

interface Power {
	void turnOn();
	void turnOff();
}




//
//class TV implements Power {
//	
//	
//
//
//@Override
//public void turnOff() {
//	System.out.println("��ǰ�� �������ϴ�.");
//	
//}
//
//@Override
//public void turnOn() {
//	System.out.println("��ǰ�� �۵����Դϴ�.");
//	
//}
//}