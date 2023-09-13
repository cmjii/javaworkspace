package day_13;

public class �߻�Ŭ���� {

	public static void main(String[] args) {
		/* �߻�Ŭ���� : �߻� �޼��� + �Ϲ� �޼��� + ������� + ��� final
		 * : �̿ϼ� Ŭ���� => ��ü�� ������ �� ����.
		 * �߻� �޼��� : �޼����� ����θ� �ְ�, ������ ���� �޼���
		 * 
		 * Ű����:abstract
		 * abstract Ŭ������ / abstract �޼���� �տ� �߰�
		 * 
		 * abstract ����Ÿ�� �޼���� (�Ű�����); //�߻�޼���
		 * - �θ� Ŭ�������� ����� �޾��� ��, Ư�� �޼��尡 �ڽ� Ŭ�������� 
		 * ���� �������̵� �� �� �ش� �޼��带 �߻� �޼���� �ۼ�
		 * - ����� ���� Ŭ�������� �߻�޼��尡 �ִٸ� �ݵ�� �����ؾ� �Ѵ�.
		 * - �� Ŭ������ �߻� Ŭ������ ��
		 * 
		 * ��� ���� �߻�޼��带 �������� �������� �ڽ��� Ŭ������ �߻� Ŭ�������� �Ѵ�.
		 * -> ��ü ���� �Ұ�
		 * */
		
		Dog d = new Dog("�ǻ�","����");
		d.printInfo();
		d.howl();
		
		Cat c = new Cat("�ᶱ","�����");
		c.printInfo();
		c.howl();
		
	}

}
//�߻�Ŭ������ ��ӹ޴� dog,catŬ���� ����
class Dog extends Animal{

	public Dog() {}
	public Dog(String name, String category) {
		super.name=name;	super.category=category;
	}
	@Override
	public void howl() {
		System.out.println("�۸�");
	}
	
}

class Cat extends Animal{
	public Cat() {}
	public Cat(String name, String category) {
	super.name=name;	super.category=category;	
	}
	
	@Override
	public void howl() {
		System.out.println("�Ŀ�");
		
	}
	
}

abstract class Animal{
	public String name;
	public String category;
	
	public void printInfo() {
		System.out.println("---");
		System.out.println("�̸�:"+name);
		System.out.println("����:" + category);
	}
	abstract public void howl();
}