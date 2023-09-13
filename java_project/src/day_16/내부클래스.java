package day_16;

public class ����Ŭ���� {

	public static void main(String[] args) {
		/* ���� Ŭ���� : Ŭ���� ���ο� ������ Ŭ����
		 * 	- �ܺ�Ŭ���� -> ���� Ŭ����
		 * 	- �ٸ� �ܺο����� ���� Ŭ������ ����� ���� ����, ���� Ŭ������ �ܺ�Ŭ������ ������ ������ ���� ���
		 * 	- ���������� ����� �������� ����� Ŭ�����̱� ������ private �����ϴ� ���� ����
		 *  - ���� Ŭ������ �����Ǵ� �ñ� : �ܺ� Ŭ������ ���� �� �� ����Ŭ������ ������
		 * �͸� (anonymous class) ���� Ŭ���� -> �͸� Ŭ������ ����ϱ� ���� ����Ŭ���� ���
		 * */
		
		A a = new A();
		a.outprint();
		B b = new B(); //�Ұ���
		
		

	}

}
//�ܺ� Ŭ����
class A{
	//���� Ŭ����
	private int num = 10;
	private int num2 = 20;
	private B b;
	
	public A () {
		b = new B();
	}
	
	class B{
		int inNum = 100;
		public void print() {
			System.out.println("���� Ŭ���� inNum: "+inNum);
			System.out.println("�ܺ�Ŭ���� num: "+num);
			System.out.println("�ܺ�Ŭ���� num2: "+num2);
		}
	}
	
	public void outprint() {
		b.print(); //���� Ŭ������ ��ü ������ ����Ͽ� �޼��� ȣ��
	}
	
}
