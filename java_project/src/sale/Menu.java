package sale;

public class Menu<K,V> {

	//Generic(���׸�) : �������� ���� �Ķ���͸� ó��
	//���� ��ü�� ���� �� �� �Ķ���� Ÿ���� �����ؼ� ��ü
	//<T> <K,V>
	
	private K menu;
	private V price;
	
	public Menu() {}
	public Menu(K menu, V price) {
		this.menu=menu;
		this.price=price;
	}
	
	
	
	
	
	
	
	
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return menu +" : "+ price;
	}
	
	
	
	
}
