package day_12;
// �޴� �̸� , ����
// �޴� �߰� �޼���
// �޴� : ���� ��� �޼���

//ProductMain Ŭ���� ����
//Product �迭 ���� [10] �޴� �߰� �޼��� Ȱ��
//��ǰ ��� �� ��ǰ ����Ʈ ���

//��ǰ�� ����Ͻðڽ��ϱ�? y : ��� n : ���
//y= ��ǰ�̸��� ������ ��� �޾� �迭�� ���
//n= ��ü ��� ����Ʈ ���
public class Product {


	private String name;
	private int price;
	
	public Product() {}
	public Product(String name, int price) {
		this.name=name;	this.price=price;
	}
	
	//���Ը޼���
	
	public void insertProduct(String name, int price) {
		this.name=name;	this.price=price;
	}
	
	public void print() {
		System.out.println("�޴�:"+name+"����:"+price);
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	
	

	
	
	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
}
