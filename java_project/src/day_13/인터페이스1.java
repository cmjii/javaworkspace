package day_13;

public class �������̽�1 {

	public static void main(String[] args) {
		/* �������̽� : �߻�޼���� ����θ� �̷���� Ŭ���� 
		 * �߻�޼��� : ����θ� �ְ� ������ ���� �޼���
		 * Ű���� : abstract �������̽������� Ű���带 �Ⱥٿ��� �������.
		 * 
		 * interface �������̽���{
		 * 	- ��� ��༭
		 * 	- ��ü������ ��� �Ұ� �������̽��� ������ Ŭ������ Ȱ��
		 * 	- ���� Ű���� : implements
		 * 	- �������̽��� ��� ������ ����. �׻� �� �κ��� �����Ͽ� �޼��� ������ �ؾ���
		 * }
		 * 
		 * - ����� ���� ����� ��Ģ
		 * - ������ ������ ����
		 * */
		
		TV t = new TV();
		t.turnOn();
		t.chUp();
		t.chUp();

	}

}

interface Power{
	abstract void turnOn();
	abstract void turnOff();
}

interface Remocon{
	void chUp();
	void chDown();
}

class TV implements Power, Remocon{

	private boolean power;
	private int ch;
	
	@Override
	public void chUp() {
		ch++;
		System.out.println("����ä��"+ch);
		
	}

	@Override
	public void chDown() {
		ch--;
		System.out.println("����ä��"+ch);
		
	}

	@Override
	public void turnOn() {
		power = true;
		System.out.println("TV�� �������ϴ�");
	}

	@Override
	public void turnOff() {
		power = false;
		System.out.println("TV�� �������ϴ�.");
		
	} //���� ���� ����.
	
}

//���� ���� ���α׷�
// 1. �������̽� ���� - �л� ����Ʈ ��� �޼��� , �л��� �߰��ϴ� �޼��� , �л��� �˻��ϴ� �޼��� , �л��� ���� ��û �޼��� , �л��� ���� öȸ �޼��� 
// 2. Ŭ���� - �л�Ŭ����(�л�Ŭ������ �� �л��� �⺻������ ���� Ŭ������ �����ؾ��� �迭��5��), ����Ŭ���� (�� ������ ������ ��Ÿ���� Ŭ����), �Ŵ��� Ŭ���� (�������̽��� ����, �ż��� ����)
//���� - (�޴� ���� / �Է¹޾� �޼��带 �����Ű�� ��� )