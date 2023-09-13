package day_18;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	//메뉴와 가격을 나타내는 클래스 생성
	//멤버변수, 생성자, getter,setter, toString
	/* --메뉴판--
	 * 1.햄버거 7000
	 * 2.피자 15000
	 * 3.음료수 2000
	 * 4.과자 1000
	 * 5.사탕 500
	  6.프로그램 종료
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
		return "메뉴=" + menu + ", 가격=" + price ;
	}
	
	
	
	
	
}
