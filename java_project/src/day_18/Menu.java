package day_18;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	//�޴��� ������ ��Ÿ���� Ŭ���� ����
	//�������, ������, getter,setter, toString
	/* --�޴���--
	 * 1.�ܹ��� 7000
	 * 2.���� 15000
	 * 3.����� 2000
	 * 4.���� 1000
	 * 5.���� 500
	  6.���α׷� ����
	*/
	
	private String menu;
	private int price;
	
	public Menu() {}
	public Menu(String menu, int price) {
		this.menu = menu;
		this.price=price;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "�޴�=" + menu + ", ����=" + price ;
	}
	
	
	
	
	
}
