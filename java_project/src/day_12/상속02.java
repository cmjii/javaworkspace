package day_12;

public class ���02 {

	public static void main(String[] args) {
		// �������̵� : �θ� Ŭ�������� �������� �޼��带 ������ �ϴ� ��. (������ �� ������ �׳� ����ϸ� ��)
		// ���� : �θ�Ŭ������ �޼���� ����ΰ� ��ġ�ؾ���
		// ���������ڴ� ���ų� �� ���� ���� ���������ڸ� ��� �Ѵ�. (���� ��� �Ұ�)
		
		Dog d = new Dog();
		d.info(); d.howl();
		System.out.println();
		Cat c = new Cat("����","����̰�");
		c.info(); c.howl();
		
		Tiger t = new Tiger("������","����̰�");
		t.info(); t.howl();

	}

}

class Tiger extends Animal{ //���� ���� ���
	public Tiger(String name, String category) {
		//�θ��� ������ ȣ��
		super(name,category); 
	}

	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("����");
	}
	
}

class Dog extends Animal { //�ڽ�Ŭ���� extends ����Ͽ� animal �θ� Ŭ���� ���
	public Dog() {
		setName("������");
		setCategory("����");
	}

	@Override
	public void howl() {  //�������̵带 ����ؼ� �θ� howl�޼��� ��� (�ڽ� Ŭ���� �ȿ��� ����)
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("�۸�");
	}
	
	
}



class Cat extends Animal { //�ڽ�Ŭ���� extends ����Ͽ� animal �θ� Ŭ���� ���
//	public Cat() {
//		setName("�����"); //�θ� Ŭ������ �ִ� ���� ���
//		setCategory("ȣ���̰�");
//	}
	public Cat(String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}

	@Override
	public void howl() { //�������̵带 ����ؼ� �θ� howl�޼��� ��� (�ڽ� Ŭ���� �ȿ��� ����)
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("�߿�");
	}
	
	
}



class Animal { //�θ�
	private String name; //�̸�
	private String category; //��
	
	public Animal() {}
	public Animal (String name, String category) {
		this.name = name; this.category=category;
	}
	
	//�������
	public void info() {
		System.out.println("�̸� : "+name);
		System.out.println("�� : "+category);
	}
	
	
	
	//�����Ҹ�
	public void howl() {
		System.out.println("==" + name +" �� �����Ҹ�==");
	}
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	
	
	
	
}